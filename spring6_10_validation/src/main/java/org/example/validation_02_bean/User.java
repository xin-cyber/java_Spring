package org.example.validation_02_bean;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @Author JX
 * @ClassName: org.example.validation_02_bean.User
 * @Create 2023-09-10 17:25
 * @Description: TODO
 */
public class User {
    @NotNull
    private String name;

    @Min(0)
    @Max(150)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
