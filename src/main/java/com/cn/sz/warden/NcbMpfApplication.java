package com.cn.sz.warden;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@MapperScan(basePackages = "com.cn.sz.ncb.mapper")
@SpringBootApplication
public class NcbMpfApplication {

    public static void main(String[] args) {
        SpringApplication.run(NcbMpfApplication.class, args);
    }

}
