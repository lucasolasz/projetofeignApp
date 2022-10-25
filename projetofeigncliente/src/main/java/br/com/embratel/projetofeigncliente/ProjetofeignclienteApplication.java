package br.com.embratel.projetofeigncliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjetofeignclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetofeignclienteApplication.class, args);
	}

}
