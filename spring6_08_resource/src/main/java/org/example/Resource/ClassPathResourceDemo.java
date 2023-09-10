package org.example.Resource;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * @Author JX
 * @ClassName: org.example.ClassPathResourceDemo
 * @Create 2023-09-09 22:38
 * @Description: 访问类路径下的资源，resources目录下的文件
 */
public class ClassPathResourceDemo {
    public static void loadAndReadUrlResource(String path) throws Exception {
        // 创建一个 Resource 对象
        ClassPathResource resource = new ClassPathResource(path);
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = " + resource.getDescription());
        //获取文件内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while (in.read(b) != -1) {
            System.out.println(new String(b));
        }
    }

    public static void main(String[] args) throws Exception {
        loadAndReadUrlResource("testResource.txt");
    }
}
