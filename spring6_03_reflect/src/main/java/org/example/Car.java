package org.example;

/**
 * @Author JX
 * @ClassName: org.example.${NAME}
 * @Create 2023-09-05 19:57
 * @Description: TODO
 */
public class Car {

    private String name;
    private int age;
    private String color;

    // 无参数构造
    public Car() {

    }

    // 有参数构造
    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void run() {
        System.out.println("私有方法run");
    }


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}