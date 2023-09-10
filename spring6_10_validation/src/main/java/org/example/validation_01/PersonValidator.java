package org.example.validation_01;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author JX
 * @ClassName: org.example.validation_01.PersonValidator
 * @Create 2023-09-10 16:59
 * @Description: TODO
 */
public class PersonValidator implements Validator {
    @Override // 表示此校验用在哪个类型上
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override//校验规则
    public void validate(Object target, Errors errors) {
        //name不能为空
        ValidationUtils.rejectIfEmpty(errors,
                "name", "name.empty", "name is null");

        //age 不能小于0，不能大于200
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "age.value.error", "age < 0");
        } else if (p.getAge() > 200) {
            errors.rejectValue("age", "age.value.error.old", "age > 200");
        }
    }
}
