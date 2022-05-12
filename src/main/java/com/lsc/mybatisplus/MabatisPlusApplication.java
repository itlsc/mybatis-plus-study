package com.lsc.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.lsc.mabatisplus.mapper")//设置mapper接⼝的扫描包
@SpringBootApplication
public class MabatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabatisPlusApplication.class, args);
    }

}
