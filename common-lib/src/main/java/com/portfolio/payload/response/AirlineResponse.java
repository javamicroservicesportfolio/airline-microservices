package com.portfolio.payload.response;

import com.portfolio.dto.UserDTO;
import com.portfolio.embeddable.Support;
import com.portfolio.enums.AirlineStatus;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirlineResponse {
    private Long id;
    private String iataCode;
    private String icaoCode;
    private String name;
    private String alias;
    private String logoUrl;
    private String website;
    private AirlineStatus status = AirlineStatus.ACTIVE;
    private String alliance;
    private Instant createdAt;
    private Instant updatedAt;
    private Long ownerId;
    private UserDTO owner;
    private Long updatedById;

    private CityResponse headquartersCity;
    private Support support;
}
