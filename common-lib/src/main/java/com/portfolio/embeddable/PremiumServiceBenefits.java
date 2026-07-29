package com.portfolio.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PremiumServiceBenefits {
    @Column(nullable = false, name = "lounge_access")
    @Builder.Default
    private Boolean loungeAccess = false;

    @Column(nullable = false, name = "airport_transfer")
    @Builder.Default
    private Boolean airportTransfer = false;
}
