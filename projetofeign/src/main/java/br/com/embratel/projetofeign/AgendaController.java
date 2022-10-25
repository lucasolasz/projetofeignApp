package br.com.embratel.projetofeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {
	
	
	@GetMapping
	public Contato retornaContato() {
		return Contato.builder()
				.id(1L)
				.nome("Lucas")
				.telefone("989898-98989")
				.build();
	}
	
}
