package com.java.webmvc.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//与spring的配置类几乎一样,只是我们将控制层的包交给springMVC来进行管理
@Configuration
@ComponentScan({"com.java.webmvc.controller"})
public class SpringMvcConfig {
}
