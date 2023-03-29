package br.com.pedro.livraria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedro.livraria.repository.LivroRepository;
import br.com.pedro.livraria.service.LivroService;
import br.com.pedro.model.Livro;

@RequestMapping(path = "/livro")
@RestController
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping("/teste")
	public String teste() {
		return "Pedro Victor";
	}
	
	@PostMapping("/cadastrar")
	@ResponseStatus(HttpStatus.CREATED)
	public Livro saveLivro(@Valid @RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	

}
