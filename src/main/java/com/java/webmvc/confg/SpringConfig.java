package com.java.webmvc.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//指定此类为一个spring的配置类(相当于applicationContext.xml文件)
@Configuration
//扫描spring要管理的包,我这里管理的是数据层和业务层
@ComponentScan({"com.java.webmvc.mapper", "com.java.webmvc.service"})
//将MybatisConfig这个类中被@Bean修饰的工厂方法所返回的对象交给spring管理
@Import(MybatisConfig.class)
public class SpringConfig {
}