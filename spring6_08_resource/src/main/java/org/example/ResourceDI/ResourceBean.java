package org.example.ResourceDI;


import org.springframework.core.io.Resource;

/**
 * @Author JX
 * @ClassName: org.example.ResourceDI.ResourceBean
 * @Create 2023-09-09 23:09
 * @Description: TODO
 */
public class ResourceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse() {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
