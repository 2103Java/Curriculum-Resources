package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlanetZuulApplication {
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route(
				"/hello", r -> r.path("/get").uri("http://localhost:9000/test/hello")
				).build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PlanetZuulApplication.class, args);
	}

}
