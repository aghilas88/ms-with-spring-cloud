package com.agh.pricing.controller;

import com.agh.pricing.model.PricingDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
public class pricingController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PricingDTO find(@PathVariable String id){
        return PricingDTO.builder()
                .productId(id)
                .price(19.99)
                .build();
    }
}
