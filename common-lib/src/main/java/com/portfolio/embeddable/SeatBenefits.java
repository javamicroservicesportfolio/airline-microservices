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
public class SeatBenefits {
    @Column(nullable = false, name = "extra_seat_space")
    @Builder.Default
    private Boolean extraSeatSpace=false;

    @Column(nullable = false, name = "preferred_seat_choice")
    @Builder.Default
    private Boolean preferredSeatChoice=false;

    @Column(nullable = false, name = "advance_seat_selection")
    @Builder.Default
    private Boolean advanceSeatSelection=false;

    @Column(nullable = false, name = "guaranteed_seat_together")
    @Builder.Default
    private Boolean guaranteedSeatTogether = false;
}
