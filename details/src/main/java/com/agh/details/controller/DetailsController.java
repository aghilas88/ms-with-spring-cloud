package com.agh.details.controller;

import com.agh.details.model.DetailsDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class DetailsController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DetailsDTO find(@PathVariable String id) {
        return DetailsDTO.builder()
                .productId(id)
                .longDescription("LE PRODUIT à acheter")
                .build();
    }
}
