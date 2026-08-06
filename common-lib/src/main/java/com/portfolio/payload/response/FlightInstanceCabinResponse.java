package com.portfolio.payload.response;


import com.portfolio.enums.CabinClassType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightInstanceCabinResponse {
    private Long id;
    private Long flightInstanceId;
    private CabinClassType cabinClassType;
    private CabinClassResponse cabinClass;
    @Builder.Default
    private List<SeatInstanceResponse> seatInstances = List.of();
    @Builder.Default
    private SeatMapResponse seatMap = new SeatMapResponse();
    private Integer totalSeats;
    private Integer bookedSeats;
    private Integer availableSeats;
    private Boolean isActive;
    private Boolean canBook;
}
