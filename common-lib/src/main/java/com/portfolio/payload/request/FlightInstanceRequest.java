package com.portfolio.payload.request;

import com.portfolio.enums.FlightStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightInstanceRequest {
    @NotNull(message = "Flight ID cannot be null")
    private Long flightId;

    @NotNull(message = "Departure airport ID cannot be null")
    private Long departureAirportId;

    @NotNull(message = "Arrival airport ID cannot be null")
    private Long arrivalAirportId;

    private Long scheduleId;

    @NotNull(message = "Departure date and time cannot be null")
    private LocalDateTime departureDateTime; // ISO 8601 format

    @NotNull(message = "Arrival date and time cannot be null")
    private LocalDateTime arrivalDateTime;// ISO 8601 format

    @NotNull(message = "Total seats cannot be null")
    @Positive
    private Integer totalSeats;

    @NotNull(message = "Available seats cannot be null")
    @PositiveOrZero
    private Integer availableSeats;

    private FlightStatus status; // Should match the FlightStatus enum values

    private Integer minAdvanceBookingDays;
    private Integer maxAdvanceBookingDays;
    private Boolean isActive;
}
