package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author JX
 * @ClassName: org.example.config.SpringConfig
 * @Create 2023-09-05 19:50
 * @Description: TODO
 */
@Configuration // 配置类，替代bean.xml中的开启组件扫描功能
@ComponentScan("org.example")
public class SpringConfig {
}
