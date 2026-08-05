package com.portfolio.payload.request;

import com.portfolio.enums.CabinClassType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CabinClassRequest {
    @NotBlank(message = "Cabin class name is required")
    private CabinClassType name;

    @NotNull(message = "Cabin class code is required")
    private String code;
    private String description;

    @NotNull(message = "Aircraft ID is required")
    private Long aircraftId;

    private Integer displayOrder;
    private Boolean isActive;
    private Boolean isBookable;
    private Integer typicalSeatPitch;
    private Integer typicalSeatWidth;
    private String seatType;
}
