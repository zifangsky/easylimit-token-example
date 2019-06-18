package cn.zifangsky.easylimit.token.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ServletComponentScan
@EnableAsync
@MapperScan("cn.zifangsky.easylimit.token.example.mapper")
public class EasylimitTokenExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasylimitTokenExampleApplication.class, args);
	}

}
