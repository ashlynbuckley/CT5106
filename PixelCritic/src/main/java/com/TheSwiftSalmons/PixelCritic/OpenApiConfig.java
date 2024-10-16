package com.TheSwiftSalmons.PixelCritic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig 
{
	@Bean
	public OpenAPI pixelCriticOpenAPI() 
	{
		return new OpenAPI().info(new Info().title("Pixel Critic REST API").description("Game review site").version("1.0"));
	}
}
