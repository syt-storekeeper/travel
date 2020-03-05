package cn.itcast.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.itcast.service.mapper")
public class ItcastServiceProviderApplication {




	public static void main(String[] args) {
		SpringApplication.run(ItcastServiceProviderApplication.class, args);
	}

}
