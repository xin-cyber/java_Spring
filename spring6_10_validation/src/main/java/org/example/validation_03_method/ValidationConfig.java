package org.example.validation_03_method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @Author JX
 * @ClassName: org.example.validation_03_method.ValidationConfig
 * @Create 2023-09-10 17:46
 * @Description: TODO
 */
@Configuration
@ComponentScan("org.example.validation_03_method")
public class ValidationConfig {

    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
