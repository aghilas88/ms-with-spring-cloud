package com.agh.msclient.proxy;

import com.agh.msclient.bean.Product;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ms-product")
@RibbonClient(name = "ms-product")
public interface ProductProxy {

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    Product find (@PathVariable("id") String id);

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll ();
}
