package com.agh.details.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DetailsDTO {
    private String productId;
    private String longDescription;
}
