package com.portfolio.payload.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightMealRequest {
    @NotNull(message = "Flight ID is required")
    private Long flightId;

    @NotNull(message = "Meal ID is required")
    private Long mealId;

    private Boolean available;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private Double price;

    @Positive(message = "Display order must be a positive integer")
    private Integer displayOrder;

    private String notes;
}
