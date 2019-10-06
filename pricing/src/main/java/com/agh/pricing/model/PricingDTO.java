package com.agh.pricing.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PricingDTO {
    private String productId;
    private Double price;
}
