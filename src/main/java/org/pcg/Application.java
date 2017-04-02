
package org.pcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/.*"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring REST Mongo Sample with Swagger")
				.description("Spring REST Mongo Sample with Swagger")
				.termsOfServiceUrl("")
				.contact("Leo")
				.license("Apache License Version 2.0")
				.licenseUrl("")
				.version("2.0")
				.build();
	}
}
