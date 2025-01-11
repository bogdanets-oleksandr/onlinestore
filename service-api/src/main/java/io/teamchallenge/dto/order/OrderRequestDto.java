package io.teamchallenge.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.teamchallenge.dto.PostAddressDto;
import io.teamchallenge.dto.address.AddressDto;
import io.teamchallenge.dto.cart.CartItemRequestDto;
import io.teamchallenge.enumerated.DeliveryMethod;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
//    @Email(message = "Please, insert valid email address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    //for delete
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String firstName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fullName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comment;

//    @NotBlank
@JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;

//    @Size(min = 1, message = "You need minimum one product")
@JsonInclude(JsonInclude.Include.NON_NULL)
    private List<CartItemRequestDto> cartItems;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DeliveryMethod deliveryMethod;
    //need constant for payment method
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paymentMethod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AddressDto address;
    //for delete
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PostAddressDto postAddress;
}
