package com.java.webmvc.confg;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//让SSM的整合类继承 AbstractAnnotationConfigDispatcherServletInitializer 这个类
public class ServletInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    //指定spring的核心配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //要指定配置类的字节码对象
        return new Class[]{SpringConfig.class};
    }

    //指定springMVC的核心配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    //指定springMVC要管理的路径,"/"代表全归springMVC进行管理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}