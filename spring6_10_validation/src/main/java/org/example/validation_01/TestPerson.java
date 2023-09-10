package org.example.validation_01;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @Author JX
 * @ClassName: org.example.validation_01.TestPerson
 * @Create 2023-09-10 17:00
 * @Description: TODO
 */
public class TestPerson {
    public static void main(String[] args) {
        //创建person对象
        Person person = new Person();
        person.setName("lucy");
        person.setAge(250);

        //创建person对应databinder数据绑定
        DataBinder binder = new DataBinder(person);

        //设置校验器
        binder.setValidator(new PersonValidator());

        //调用方法执行校验
        binder.validate();

        //输出校验结果
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
