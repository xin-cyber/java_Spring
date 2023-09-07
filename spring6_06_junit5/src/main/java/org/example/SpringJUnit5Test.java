package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author JX
 * @ClassName: org.example.SpringJUnit5Test
 * @Create 2023-09-07 20:20
 * @Description: TODO
 */
//两种方式均可
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
//方式二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringJUnit5Test {

    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
    }
}
