package com.jtp.test_payment_str.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "test payment with stripe",
                version = "1.0.0",
                description = "testing payment integration with stripe"
        )
)
public class SwaggerConfig {


}
