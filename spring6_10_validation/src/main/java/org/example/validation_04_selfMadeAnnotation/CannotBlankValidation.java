package org.example.validation_04_selfMadeAnnotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @Author JX
 * @ClassName: org.example.validation_04_selfMadeAnnotation.CannotBlankValidation
 * @Create 2023-09-10 17:53
 * @Description: 定义校验规则
 */
public class CannotBlankValidation implements ConstraintValidator<CannotBlank, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.contains(" ")) {
            //获取默认提示信息
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message :" + defaultConstraintMessageTemplate);
            //禁用默认提示信息
            context.disableDefaultConstraintViolation();
            //设置提示语
            context.buildConstraintViolationWithTemplate("can not contains blank").addConstraintViolation();
            return false;
        }
        return false;
    }
}
