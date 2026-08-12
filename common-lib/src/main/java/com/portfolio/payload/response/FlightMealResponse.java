package com.portfolio.payload.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightMealResponse {
    private Long id;
    private Long flightId;
    private MealResponse meal;
    private Boolean available;
    private Double price;
    private Integer displayOrder;
    private String notes;
}
