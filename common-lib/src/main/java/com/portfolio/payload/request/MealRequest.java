package com.portfolio.payload.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealRequest {

    @NotNull(message = "Meal code cannot be null")
    private String code;

    @NotNull(message = "Meal name cannot be null")
    private String name;

    @NotNull(message = "Meal type cannot be null")
    @Size(max = 50, message = "Meal type cannot exceed 50 characters")
    private String mealType;

    @NotNull(message = "Dietary restriction cannot be null")
    @Size(max = 100, message = "Dietary restriction cannot exceed 100 characters")
    private String dietaryRestriction;

    @Size(max = 2000, message = "Ingredients cannot exceed 2000 characters")
    private String ingredients;

    @Size(max = 255, message = "Image URL cannot exceed 255 characters")
    private String imageUrl;

    private Boolean requiresAdvanceBooking;

    private Integer advanceBookingHours;

    private Integer displayOrder;
}
