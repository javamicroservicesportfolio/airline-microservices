package com.portfolio.payload.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightScheduleRequest {
    @NotNull(message = "Flight ID cannot be null")
    private Long flightId;

    @NotNull(message = "Departure time cannot be null")
    private LocalTime departureTime;

    @NotNull(message = "Arrival time cannot be null")
    private LocalTime arrivalTime;

    @NotNull(message = "Start date cannot be null")
    private LocalDate startDate; // ISO 8601 format

    @NotNull(message = "End date cannot be null")
    private LocalDate endDate;

    private List<DayOfWeek> operatingDays;

    private Boolean isActive;
}
