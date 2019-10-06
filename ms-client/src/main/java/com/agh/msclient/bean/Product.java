package com.agh.msclient.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Product {
    private String id;
    private String name;
}

