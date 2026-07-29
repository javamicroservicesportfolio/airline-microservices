package com.portfolio.embeddable;

import jakarta.persistence.Column;import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InFlightBenefits {
    @Column(nullable = false, name = "complimentary_meals")
    @Builder.Default
    private Boolean complimentaryMeals=false;

    @Column(nullable = false, name = "premium_meal_choice")
    @Builder.Default
    private Boolean premiumMealChoice=false;

    @Column(nullable = false, name = "in_flight_internet")
    @Builder.Default
    private Boolean inFlightInternet = false;

    @Column(nullable = false, name = "in_flight_entertainment")
    @Builder.Default
    private Boolean inFlightEntertainment = false;

    @Column(nullable = false, name = "complimentary_beverages")
    @Builder.Default
    private Boolean complimentaryBeverages = false;
}