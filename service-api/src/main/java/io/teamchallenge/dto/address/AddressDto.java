package io.teamchallenge.dto.address;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class AddressDto {

    private String addressLine;
    private String postalCode;
    private String countryName;

    @NotBlank
    private String city;
    private String street;
    private String houseNumber;
    private String flat;

}
