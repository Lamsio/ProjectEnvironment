package com.java.webmvc.confg;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public DataSource getDataSource(){
        //我这里用的数据库连接池的jar包为dbcp2,该连接池的核心类为BasicDataSource，你们也可以
        //自由指定想要的数据库连接池(比如Druid,这里就要将BasicDataSource核心类换成Druid的
        //核心类)
        BasicDataSource basicDataSource = new BasicDataSource();
        //设置一些基本的信息,比如数据库的用户名和密码等等
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/study");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("123456");
        return basicDataSource;
    }

    //如果在工厂方法中想要spring中管理的对象,直接在工厂方法中的参数中进行指定即可
    @Bean
    public SqlSessionFactoryBean getFactoryBean(DataSource dataSource){
        //通过SqlSessionFactoryBean对象将SqlSession的创建过程交给spring来管理
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //指定SqlSession对象所依赖的数据源,直接指定为上面的数据源即可
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    //指定数据层所在的包
    @Bean
    public MapperScannerConfigurer getMapperScanner(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.java.webmvc.mapper");
        return mapperScannerConfigurer;
    }
}
