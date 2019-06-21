package com.qfedu.ljb.server.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@MapperScan("com.qfedu.ljb.server.goods.dao")
@EnableEurekaClient
@EnableTransactionManagement
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);
    }
}
