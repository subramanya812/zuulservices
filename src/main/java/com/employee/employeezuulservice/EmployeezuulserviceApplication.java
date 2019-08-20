package com.employee.employeezuulservice;

import com.employee.employeezuulservice.filters.ErrorFilter;
import com.employee.employeezuulservice.filters.PostFilter;
import com.employee.employeezuulservice.filters.PreFilter;
import com.employee.employeezuulservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy

public class EmployeezuulserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeezuulserviceApplication.class, args);
    }

    @Bean
    public PreFilter preFilter(){
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter(){
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter(){
        return new RouteFilter();
    }
}
