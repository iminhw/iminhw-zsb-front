package com.minhw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author mz
 */
@MapperScan("com.**.mapper")
@SpringBootApplication
public class ZsbFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZsbFrontApplication.class, args);
    }

}
