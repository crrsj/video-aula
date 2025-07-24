package br.com.cadastro;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "API - cadastro de usuários",
				version = "1.0",
				description = "API para cadastro de usuários.",
				contact = @Contact(name = "Carlos Roberto", email = "crrsj1@gmail.com")
		)
)
public class CadastroUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroUsuarioApplication.class, args);
	}

}
