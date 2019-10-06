package com.agh.msclient.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("msclient.confs")
@Getter
@Setter
public class MsClientConf {
    private int nbProductsMax;

}
