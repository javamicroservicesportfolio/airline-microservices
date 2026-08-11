package com.portfolio.payload.request;

import com.portfolio.enums.CoverageType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceCoverageRequest {
    @NotNull(message = "Ancillary ID cannot be null")
    private Long ancillaryId;

    @NotNull(message = "Coverage Type cannot be null")
    private CoverageType coverageType;

    @NotNull(message = "Coverage Name cannot be null")
    @Size(max = 200, message = "Coverage Name cannot exceed 200 characters")
    private String name;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    @NotNull(message = "Coverage Amount cannot be null")
    @PositiveOrZero(message = "Coverage Amount must be zero or positive")
    private Double coverageAmount;

    private Boolean isFlat;

    @Size(max = 1000, message = "Claim Condition cannot exceed 1000 characters")
    private String claimCondition;

    @Size(max = 100, message = "Emergency Contact cannot exceed 100 characters")
    private String emergencyContact;

    private Integer displayOrder;

    private Boolean active;
}
