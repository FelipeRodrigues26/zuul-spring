package br.com.alura.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulSpringApplication.class, args);
	}

}
