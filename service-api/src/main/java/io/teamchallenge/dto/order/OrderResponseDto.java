package io.teamchallenge.dto.order;

import io.teamchallenge.dto.address.AddressDto;
import io.teamchallenge.dto.user.UserVO;
import io.teamchallenge.enumerated.DeliveryMethod;
import io.teamchallenge.enumerated.DeliveryStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class OrderResponseDto {
    private Long id;
    private String email;
    private String fullName;
    private String phoneNumber;
    private DeliveryMethod deliveryMethod;
    private DeliveryStatus deliveryStatus;
    private AddressDto address;
    private Boolean isPaid;
    private LocalDateTime createdAt;
    private BigDecimal total;
    private List<OrderItemResponseDto> orderItems;
    private UserVO user;
}
