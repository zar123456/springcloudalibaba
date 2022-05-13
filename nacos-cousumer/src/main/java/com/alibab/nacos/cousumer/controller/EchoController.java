package com.alibab.nacos.cousumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class EchoController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    public EchoController(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//    }

    @GetMapping("/echo/app-name/{str}")
    public String echoAppName(@PathVariable String str){
        return restTemplate.getForObject("http://nacos-provider/echo/"+str,String.class);
    }

}
