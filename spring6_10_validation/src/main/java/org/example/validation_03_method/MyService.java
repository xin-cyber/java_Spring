package org.example.validation_03_method;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Author JX
 * @ClassName: org.example.validation_03_method.MyService
 * @Create 2023-09-10 17:47
 * @Description: TODO
 */
@Service
@Validated
public class MyService {

    public String testMethod(@NotNull @Valid User user) {
        return user.toString();
    }
}
