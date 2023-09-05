package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author JX
 * @ClassName: org.example.TestCar
 * @Create 2023-09-05 20:04
 * @Description: TODO
 */
public class TestCar {

    // 1.获取class对象
    @Test
    public void test01() throws Exception {
        // 从字节码文件获取类的Class对象
        Class<Car> clazz = Car.class;
        //Class aClass = new Car().getClass();
        //Class aClass1 = Class.forName("org.example.Car");

        // 实例化
        Car car = clazz.getDeclaredConstructor().newInstance(); // 所有 constructor
    }

    // 2.获取构造函数
    @Test
    public void test02() throws Exception {
        // 从字节码文件获取类的Class对象
        Class<Car> clazz = Car.class;
        Constructor<?>[] constructors = clazz.getConstructors(); // 获取public constructor
        for (Constructor constructor : constructors) {
            System.out.println("构造方法名称：" + constructor.getName() + "  参数个数: " + constructor.getParameterCount());
        }
    }

    // 3.获取属性
    @Test
    public void test03() throws Exception {
        // 从字节码文件获取类的Class对象
        Class<Car> clazz = Car.class;
        Car car = clazz.getDeclaredConstructor().newInstance(); // 所有 constructor
        // 获取所以属性，包含私有private
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(car, "五菱宏光");
            }
            System.out.println(field.getName());
            System.out.println(car);
        }

    }

    // 4.获取方法
    @Test
    public void test04() throws Exception {
        // 传参并且获取类的Class对象
        Car car = new Car("奔驰", 10, "red");
        Class<? extends Car> aClass = car.getClass();

        // public methods
        // private getDeclaredMethods
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());

            // 执行toString
            if (method.getName().equals("toString")) {
                Object invoke = method.invoke(car);
                System.out.println(invoke);
            }
        }

    }
}
