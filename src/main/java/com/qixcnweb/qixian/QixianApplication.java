package com.qixcnweb.qixian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@MapperScan("com.qixcnweb.qixian.dao")
public class QixianApplication {

	public static void main(String[] args) {
		SpringApplication.run(QixianApplication.class, args);
	}
}
