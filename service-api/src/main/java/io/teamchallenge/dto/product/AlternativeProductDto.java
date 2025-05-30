package io.teamchallenge.dto.product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class AlternativeProductDto {
    private Long id;
    private String value;
    private boolean isAvailable;
}
