package br.com.pedro.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedro.livraria.repository.LivroRepository;
import br.com.pedro.model.Livro;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public Livro saveLivro(Livro livro) {
		
		return livroRepository.save(livro);
		
	}

}
