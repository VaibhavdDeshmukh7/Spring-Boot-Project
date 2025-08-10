package com.ecommerce.api_gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p.path("/flipkart-product/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://FLIPKART-PRODUCT-SERVICE"))
                .build();
    }

}
