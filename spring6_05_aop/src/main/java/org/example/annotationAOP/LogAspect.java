package org.example.annotationAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author JX
 * @ClassName: org.example.annotationAOP.LogAspect
 * @Create 2023-09-07 14:35
 * @Description: TODO
 */

@Aspect // @Aspect表示这个类是一个切面类
@Component // @Component注解保证这个切面类能够放入IOC容器
public class LogAspect {

    // 设置切入点和通知类型
    @Before(value = "execution(public int org.example.annotationAOP.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("前置通知....，方法名：" + methodName);
    }

    @After(value = "execution(* org.example.annotationAOP.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("后置通知....，参数：" + Arrays.toString(args));
    }

    @AfterReturning(value = "execution(* org.example.annotationAOP.CalculatorImpl.*(..))", returning = "result")
    public void returnMethod(JoinPoint joinPoint, Object result) {
        Object[] args = joinPoint.getArgs();
        System.out.println("返回通知....，参数：" + Arrays.toString(args) + "结果：" + result);
    }

    @AfterThrowing(value = "execution(* org.example.annotationAOP.CalculatorImpl.*(..))")
    public void afterThrowingMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("异常通知....，参数：" + Arrays.toString(args));
    }

    @Around("execution(* org.example.annotationAOP.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}
