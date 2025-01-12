package io.teamchallenge.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.teamchallenge.dto.PostAddressDto;
import io.teamchallenge.dto.address.AddressDto;
import io.teamchallenge.dto.cart.CartItemRequestDto;
import io.teamchallenge.enumerated.DeliveryMethod;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

public class OrderRequestDto {
    @Email(message = "Please, insert valid email address")
    private String email;

    @NotBlank
    private String fullName;

    private String comment;

    @NotBlank
    private String phoneNumber;

    @Size(min = 1, message = "You need minimum one product")
    private List<CartItemRequestDto> cartItems;

    @NotNull
    private DeliveryMethod deliveryMethod;

    //TODO: add constraints for payment method
    private String paymentMethod;

    @NotNull
    private AddressDto address;
}
