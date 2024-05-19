package com.java.webmvc.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//与spring的配置类几乎一样,只是我们将控制层的包交给springMVC来进行管理
@Configuration
@ComponentScan({"com.java.webmvc.controller"})
@PropertySource("classpath:database.properties")
public class SpringMvcConfig implements WebMvcConfigurer {

}
