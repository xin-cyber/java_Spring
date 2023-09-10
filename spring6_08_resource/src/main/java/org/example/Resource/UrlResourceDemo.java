package org.example.Resource;

import org.springframework.core.io.UrlResource;

/**
 * @Author JX
 * @ClassName: org.example.UrlResource
 * @Create 2023-09-09 22:24
 * @Description: UrlResource访问网络资源
 */
public class UrlResourceDemo {

    public static void loadAndReadUrlResource(String path) {
        // 创建一个 Resource 对象
        UrlResource url = null;
        try {
            url = new UrlResource(path);
            // 获取资源名
            System.out.println("1: " + url.getFilename());
            System.out.println(url.getURI());
            // 获取资源描述
            System.out.println("3:" + url.getDescription());
            //获取资源内容
            System.out.println("4:" + url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //访问网络资源
//        loadAndReadUrlResource("http://www.baidu.com");
        loadAndReadUrlResource("file:testResource.txt");
    }
}
