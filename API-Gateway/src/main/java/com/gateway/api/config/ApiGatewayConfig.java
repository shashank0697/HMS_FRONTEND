package com.gateway.api.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
	
	@Bean
	public RouteLocator routeLocatorInventory(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p->p
						.path("/inventory/get")
						.uri("http://localhost:8081")
						)
				.route(p->p
						.path("/inventory/add")
						.uri("http://localhost:8081")
						)
				.route(p->p
						.path("/inventory/get/{invId}")
						.uri("http://localhost:8081")
						)
				.route(p->p
						.path("/inventory/put/{invId}")
						.uri("http://localhost:8081")
						)
				.route(p->p
						.path("/inventory/delete/{invId}")
						.uri("http://localhost:8081")
						)
				.build();
	}
	
	@Bean
	public RouteLocator routeLocatorRoom(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p->p
						.path("/room/get")
						.uri("http://localhost:8082")
						)
				.route(p->p
						.path("/room/add")
						.uri("http://localhost:8082")
						)
				.route(p->p
						.path("/room/get/{roomId}")
						.uri("http://localhost:8082")
						)
				.route(p->p
						.path("/room/update/{roomId}")
						.uri("http://localhost:8082")
						)
				.route(p->p
						.path("/room/delete/{roomId}")
						.uri("http://localhost:8082")
						)
				.route(p->p
						.path("/room/search/")
						.uri("http://localhost:8082")
						)
				.build();
	}
	
	@Bean
	public RouteLocator routeLocatorGuest(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p->p
						.path("/guest/get")
						.uri("http://localhost:8083")
						)
				.route(p->p
						.path("/guest/add")
						.uri("http://localhost:8083")
						)
				.route(p->p
						.path("/guest/get/{gId}")
						.uri("http://localhost:8083")
						)
				.route(p->p
						.path("/guest/update/{gId}")
						.uri("http://localhost:8083")
						)
				.route(p->p
						.path("/guest/delete/{gId}")
						.uri("http://localhost:8083")
						)
				.build();
	}
	
	@Bean
	public RouteLocator routeLocatorReservation(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p->p
						.path("/reservation/get")
						.uri("http://localhost:8084")
						)
				.route(p->p
						.path("/reservation/add")
						.uri("http://localhost:8084")
						)
				.route(p->p
						.path("/reservation/get/{resId}")
						.uri("http://localhost:8084")
						)
				.route(p->p
						.path("/reservation/update/{resId}")
						.uri("http://localhost:8084")
						)
				.route(p->p
						.path("/reservation/delete/{resId}")
						.uri("http://localhost:8084")
						)
				.build();
	}
}
