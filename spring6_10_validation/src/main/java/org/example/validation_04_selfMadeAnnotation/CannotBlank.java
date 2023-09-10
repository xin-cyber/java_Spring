package org.example.validation_04_selfMadeAnnotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @Author JX
 * @ClassName: org.example.validation_04_selfMadeAnnotation.CannotBlank
 * @Create 2023-09-10 17:52
 * @Description: TODO
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {CannotBlankValidation.class}) // 指定校验器的类
public @interface CannotBlank {

    //默认提示错误信息
    String message() default "不能包含空格";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    // 指定多个
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        CannotBlank[] value();
    }
}
