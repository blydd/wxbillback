package com.bgt.billback;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.bgt.billback.mapper")
public class BillBackApplication {
    private static final Logger log = LoggerFactory.getLogger(BillBackApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BillBackApplication.class, args);
        log.info("標簽記賬后端程序啓動成功。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
} 