package com.agh.msclient.controller;

import com.agh.msclient.conf.MsClientConf;
import com.agh.msclient.proxy.ProductProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private ProductProxy productProxy;

    @Autowired
    private MsClientConf clientConf;

    @RequestMapping("/")
    public String acceuil(Model model) {
        model.addAttribute("products", productProxy.findAll().subList(0, clientConf.getNbProductsMax()-1));
        return "Acceuil";
    }
}
