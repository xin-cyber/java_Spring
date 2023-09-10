package org.example.validation_02_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Author JX
 * @ClassName: org.example.validation_02_bean.ValidationConfig
 * @Create 2023-09-10 17:27
 * @Description: TODO
 */
@Configuration // 配置类
@ComponentScan("org.example.validation_02_bean") // 开启组件扫描以及规则
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
