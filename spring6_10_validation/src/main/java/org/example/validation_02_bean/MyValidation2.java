package org.example.validation_02_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * @Author JX
 * @ClassName: org.example.validation_02_bean.MyValidation2
 * @Create 2023-09-10 17:34
 * @Description: spring validation
 */
@Service
public class MyValidation2 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserTwo(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }

}
