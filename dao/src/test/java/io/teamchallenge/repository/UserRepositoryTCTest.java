package io.teamchallenge.repository;

import io.teamchallenge.dto.user.UserVO;
import io.teamchallenge.entity.User;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
@ActiveProfiles("ts")
@Sql(scripts = "classpath:data.sql")
public class UserRepositoryTCTest {

    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgresqlContainer =
        new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));

    @Autowired
    private UserRepository userRepository;

    @Test
    void findUserByEmailTest() {
        String email = "john@example.com";
        Optional<User> userVOByEmail = userRepository.findUserByEmail(email);
        assertFalse(userVOByEmail.isEmpty());
        assertEquals(email, userVOByEmail.get().getEmail());
    }

    @Test
    void existsByEmailTest() {
        assertTrue(userRepository.existsByEmail("john@example.com"));
    }

    @Test
    void existsByPhoneNumberTest() {
        assertTrue(userRepository.existsByPhoneNumber("+1234567890"));
    }

    @Test
    void existsByIdAndCompletedOrderWithProductIdTest() {
        assertTrue(userRepository.existsByIdAndCompletedOrderWithProductId(1L,1L));
        assertFalse(userRepository.existsByIdAndCompletedOrderWithProductId(2L,1L));
    }

    @Test
    void findVOByOrdersIdTest() {
        Optional<UserVO> voByOrdersId = userRepository.findVOByOrdersId(1L);

        assertTrue(voByOrdersId.isPresent());
        assertEquals(1L, voByOrdersId.get().getId());
    }

    @Test
    void userHasOrderWithIdTest() {
        assertTrue(userRepository.userHasOrderWithId(1L,1L));
        assertFalse(userRepository.userHasOrderWithId(2L,1L));
    }
}
