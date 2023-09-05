package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author JX
 * @ClassName: org.example.annotation.Bean
 * @Create 2023-09-05 21:49
 * @Description: TODO
 */
@Target(ElementType.TYPE) // 类，接口上用
@Retention(RetentionPolicy.RUNTIME) // 运行时
public @interface Bean {
}
