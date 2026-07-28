package com.portfolio.payload.response;

import com.portfolio.enums.ScheduleStatus;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "Response object representing a Flight Schedule and its background processing status")
public class FlightScheduleResponse {
    @Schema(description = "Unique schedule ID", example = "101")
    private Long id;

    @Schema(description = "Associated Flight ID", example = "45")
    private Long flightId;

    @Schema(description = "Flight number", example = "AA123")
    private String flightNumber;

    @Schema(description = "Departure airport")
    private AirportResponse departureAirport;

    @Schema(description = "Arrival airport")
    private AirportResponse arrivalAirport;

    @Schema(description = "Departure time", example = "08:00:00")
    private LocalTime departureTime;

    @Schema(description = "Arrival time", example = "11:30:00")
    private LocalTime arrivalTime;

    @Schema(description = "Start date", example = "2023-01-01")
    private LocalDate startDate;

    @Schema(description = "End date", example = "2023-12-31")
    private LocalDate endDate;

    @Schema(description = "Operating days", example = "[MONDAY, WEDNESDAY, FRIDAY]", allowableValues = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
    private List<DayOfWeek> operatingDays;

    @Schema(description = "Indicates if the schedule is active", example = "true")
    private Boolean isActive;

    @Schema(description = "Current status of the schedule", example = "ACTIVE", allowableValues = {"PROCESSING", "ACTIVE", "FAILED"})
    private ScheduleStatus status;

    @Schema(description = "Reason for failure, if applicable", example = "Invalid date range")
    private String failureReason;
}
