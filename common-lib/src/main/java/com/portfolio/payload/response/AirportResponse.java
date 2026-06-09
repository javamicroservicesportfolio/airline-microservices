package com.portfolio.payload.response;

import com.portfolio.embeddable.Address;
import com.portfolio.embeddable.GeoCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirportResponse {
    private Long  id;
    private String iataCode;
    private String name;
    private String detailedName;
    private String timeZone;
    private Address address;
    private CityResponse city;
    private GeoCode geoCode;
}
