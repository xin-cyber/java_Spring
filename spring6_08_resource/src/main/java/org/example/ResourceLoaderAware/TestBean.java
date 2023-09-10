package org.example.ResourceLoaderAware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @Author JX
 * @ClassName: org.example.ResourceLoaderAware.TestBean
 * @Create 2023-09-09 22:56
 * @Description: TODO
 */
public class TestBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}
