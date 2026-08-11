package com.portfolio.payload.request;

import com.portfolio.domain.AncillaryMetadata;
import com.portfolio.enums.AncillaryType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AncillaryRequest {

    @NotNull(message = "Ancillary type is required")
    private AncillaryType type;

    @Size(max = 100, message = "SubType must be at most 100 characters")
    private String subType;

    @Size(max = 50, message = "RFISC must be at most 50 characters")
    private String rfisc;

    @NotBlank(message = "Name is required")
    @Size(max = 255, message = "Name must be at most 255 characters")
    private String name;

    @Size(max = 1000, message = "Description must be at most 1000 characters")
    private String description;

    @Size(max = 500, message = "Icon URL must be at most 500 characters")
    private String iconUrl;

    private AncillaryMetadata metadata;

    private Integer displayOrder;
}
