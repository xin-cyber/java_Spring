package org.example.ResourceLoader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Author JX
 * @ClassName: org.example.ResourceLoader.ResourceLoaderDemo
 * @Create 2023-09-09 22:53
 * @Description: TODO
 */
public class ResourceLoaderDemo {
    @Test
    public void demo1() {
        // ApplicationContext的实现类都实现了ResourceLoader接口，Spring容器自身完全可作为ResorceLoader使用。
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("testResource.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("testResource.txt");
        System.out.println(resource.getFilename());
    }
}
