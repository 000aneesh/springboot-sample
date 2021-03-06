package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableAsync
@SpringBootApplication
public class ServiceApplication {

	/**
	 * This method invokes Service SpringBoot application
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	/**
	 * This method used to generate service api
	 *
	 * @return docket
	 */
	@Bean
	public Docket propertyServiceApi() {
		// formatter:off
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(propertyServiceInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("app.controller")).paths(PathSelectors.any()).build()
				.pathMapping("/");
		// formatter:on
	}

	/**
	 * This method used to display student service information
	 *
	 * @return apiInfo
	 */
	private ApiInfo propertyServiceInfo() {
		return new ApiInfoBuilder().title("Service API").description("Service manages students and teachers information")
				.version("1.0").build();
	}

}
