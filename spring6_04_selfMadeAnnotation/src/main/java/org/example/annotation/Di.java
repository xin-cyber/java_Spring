package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author JX
 * @ClassName: org.example.annotation.Di
 * @Create 2023-09-05 21:49
 * @Description: TODO
 */
@Target({ElementType.FIELD}) // 属性上用
@Retention(RetentionPolicy.RUNTIME)

public @interface Di {
}
