package br.com.pedro.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pedro.model.Livro;
@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
