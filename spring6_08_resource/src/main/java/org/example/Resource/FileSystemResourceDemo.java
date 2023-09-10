package org.example.Resource;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * @Author JX
 * @ClassName: org.example.FileSystemResourceDemo
 * @Create 2023-09-09 22:43
 * @Description: 访问系统中的资源
 */
public class FileSystemResourceDemo {
    public static void loadAndReadUrlResource(String path) throws Exception {
        //相对路径,根路径
//        FileSystemResource resource = new FileSystemResource("testResource.txt");
        //绝对路径
        FileSystemResource resource = new FileSystemResource("C:\\testResource.txt");
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
