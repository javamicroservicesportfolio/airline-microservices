package com.portfolio.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatMapRequest {
    @NotBlank(message = "Seat map name is required")
    private String name;

    @Positive(message = "Total rows must be a positive number")
    @NotNull(message = "Total rows is required")
    private Integer totalRows;

    @Positive(message = "Right seats per row must be a positive number")
    @NotNull(message = "Right seats per row is required")
    private Integer rightSeatsPerRow;

    @Positive(message = "Left seats per row must be a positive number")
    @NotNull(message = "Left seats per row is required")
    private Integer leftSeatsPerRow;

    @NotNull(message = "Cabin class ID is required")
    private Long cabinClassId;

}
