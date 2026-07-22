package com.portfolio.payload.request;

import com.portfolio.enums.AircraftStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AircraftRequest {
    @NotBlank(message = "Aircraft code is required")
    private String code;

    @NotBlank(message = "Aircraft model is required")
    private String model;

    @NotBlank(message = "Aircraft manufacturer is required")
    private String manufacturer;

    @NotNull(message = "Seating capacity is required")
    @Positive(message = "Seating capacity must be a positive number")
    private Integer seatingCapacity;

    @Positive(message = "Economy seats must be a positive number")
    private Integer economySeats;

    @Positive(message = "Premium economy seats must be a positive number")
    private Integer premiumEconomySeats;

    @Positive(message = "Business seats must be a positive number")
    private Integer businessSeats;

    @Positive(message = "First class seats must be a positive number")
    private Integer firstClassSeats;

    @Positive(message = "Cruising speed must be a positive number")
    private Integer cruisingSpeedKmh;

    @Positive(message = "Range must be a positive number")
    private Integer rangeKm;

    @Positive(message = "Maximum altitude must be positive")
    private Integer maxAltitudeFt;

    @Positive(message = "Year of manufacture must be a positive number")
    private Integer yearOfManufacture;

    private LocalDate registrationDate;
    private LocalDate nextMaintenanceDate;

    @NotNull(message = "Aircraft status is required")
    private AircraftStatus status;

    @NotNull(message = "Airline ID is required")
    private Long airlineId;

    @NotNull(message = "Availability status is required")
    private Boolean isAvailable;

    private Long currentAirportId;


}
