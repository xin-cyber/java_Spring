package org.example.validation_02_bean;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author JX
 * @ClassName: org.example.validation_02_bean.validation1
 * @Create 2023-09-10 17:30
 * @Description: 原生Validation
 */
@Service
public class MyValidation1 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }

}
