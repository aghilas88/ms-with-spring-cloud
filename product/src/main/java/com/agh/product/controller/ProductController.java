package com.agh.product.controller;

import com.agh.product.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/products")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product find (@PathVariable String id) {
        return Product.builder()
                .id(id)
                .name("chemise agh")
                .build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll () {
        logger.info("find all products");
        Stream.Builder<Product> builder = Stream.builder();
        return builder.add(Product.builder()
                        .id("90")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("91")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("92")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("93")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("94")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("95")
                        .name("chemise agh")
                        .build())
                .add(Product.builder()
                        .id("96")
                        .name("chemise agh")
                        .build())
                .build()
                .collect(Collectors.toList());
    }

}
