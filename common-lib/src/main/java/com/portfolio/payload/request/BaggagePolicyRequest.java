package com.portfolio.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaggagePolicyRequest {
    @NotBlank(message = "Baggage policy name is required")
    private String name;

    @NotNull(message = "Fare ID is required")
    private Long fareId;

    private String description;

    @PositiveOrZero(message = "Cabin baggage max weight must be zero or positive")
    private Double cabinBaggageMaxWeight;
    @PositiveOrZero(message = "Cabin baggage pieces must be zero or positive")
    private Integer cabinBaggagePieces;
    @PositiveOrZero(message = "Cabin baggage weight per piece must be zero or positive")
    private Double cabinBaggageWeightPerPiece;


    @PositiveOrZero(message = "Check-in baggage max weight must be zero or positive")
    private Double checkInBaggageMaxWeight;
    @PositiveOrZero(message = "Check-in baggage pieces must be zero or positive")
    private Integer checkInBaggagePieces;
    @PositiveOrZero(message = "Check-in baggage weight per piece must be zero or positive")
    private Double checkInBaggageWeightPerPiece;
    @PositiveOrZero(message = "Cabin baggage max dimension must be zero or positive")
    private Double cabinBaggageMaxDimension;

    @PositiveOrZero(message = "Free checked bags allowance must be zero or positive")
    private Integer freeCheckedBagsAllowance;

    private Boolean priorityBaggage;
    private Boolean extraBaggageAllowance;
}
