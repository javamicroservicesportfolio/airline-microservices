package com.portfolio.payload.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightInstanceCabinRequest {
    @NotNull(message = "Flight ID cannot be null")
    private Long flightId;

    @NotNull(message = "Flight Instance ID cannot be null")
    private Long flightInstanceId;

    @NotNull(message = "Cabin Class ID cannot be null")
    private Long cabinClassId;

    @NotNull(message = "Base fare cannot be null")
    @Positive(message = "Base fare must be a positive value")
    private Double baseFare;

    @NotNull(message = "Window surcharge cannot be null")
    private Double windowSurcharge;

    @NotNull(message = "Aisle surcharge must be a positive value")
    private Double aisleSurcharge;

    @NotNull(message = "Taxes and fees cannot be null")
    @PositiveOrZero(message = "Taxes and fees must be a positive value or zero")
    private Double taxesAndFees;

    @NotNull(message = "Airline fees cannot be null")
    @PositiveOrZero(message = "Airline fees must be a positive value or zero")
    private Double airlineFees;

    private Double currentPrice;
    private Boolean isActive;
}
