package org.myshowtime.shared.controller.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerController {

    @Bean
    public Docket getCustomersApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("customers-api")
                .apiInfo(apiInfo()).select().paths(getCustomerPaths()).build();
    }

    @Bean
    public Docket getPartnersApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("partners-api")
                .apiInfo(apiInfo()).select().paths(getPartnersPaths()).build();
    }

    @Bean
    public Docket getPlatformApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("platform-api")
                .apiInfo(apiInfo()).select().paths(getPlatformPaths()).build();
    }

    private Predicate<String> getCustomerPaths() {
        return or(regex("/show/user/*.*"), regex("/theatre/user/*.*"));
    }

    private Predicate<String> getPlatformPaths() {
        return regex("/myshowtime/admin*.*");
    }

    private Predicate<String> getPartnersPaths() {
        return or(regex("/show/admin/*.*"), regex("/theatre/admin/*.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Show ticket management platform")
                .description("This platform provides features for show ticket booking, on boarding new partner theatres and managing existing theatres digitally.")
                .licenseUrl("terms@showmytime.com").version("1.0").build();
    }
}

