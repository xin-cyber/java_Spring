package org.example.annotationAOP;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author JX
 * @ClassName: org.example.annotationAOP.CalculatorTest
 * @Create 2023-09-07 15:12
 * @Description: TODO
 */
public class CalculatorTest {
    private Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void testAdd() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int add = calculator.add(1, 1);
        logger.info("执行成功:" + add);
    }

}
