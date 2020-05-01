package com.eureka.mswebclient.proxy;

import com.eureka.mswebclient.model.Formation;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms-formation")
@RibbonClient(name = "ms-formation",configuration= MyRobbin.class)
public interface Formationproxy {
    @GetMapping("/formations")
    CollectionModel<Formation> getFormation();
}
