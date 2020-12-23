
package com.kytc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 何志同
 * @Date: 2020/9/11 13:27
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaServer
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class,args);
    }
}