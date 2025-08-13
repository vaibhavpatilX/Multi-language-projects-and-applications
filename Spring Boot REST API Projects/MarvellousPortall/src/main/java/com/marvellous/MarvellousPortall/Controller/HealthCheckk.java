package com.marvellous.MarvellousPortall.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckk
{
    @GetMapping("HealthCheckk")
    public String HealthCheckk()
    {
        return "Everything is ok..!";
    }
}
