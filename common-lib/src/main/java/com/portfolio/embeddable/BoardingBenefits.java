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
public class BoardingBenefits {
    @Column(nullable = false, name = "priority_boarding")
    @Builder.Default
    private Boolean priorityBoarding=false;

    @Column(nullable = false, name = "priority_checkin")
    @Builder.Default
    private Boolean priorityCheckin=false;

    @Column(nullable = false, name = "fast_track_security")
    @Builder.Default
    private Boolean fastTrackSecurity=false;
}
