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
public class FlexibilityBenefits {
    @Column(nullable = false, name = "free_date_change")
    @Builder.Default
    private Boolean freeDateChange = false;

    @Column(nullable = false, name = "partial_refund")
    @Builder.Default
    private Boolean partialRefund = false;

    @Column(nullable = false, name = "full_refund")
    @Builder.Default
    private Boolean fullRefund = false;
}
