package br.com.api.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.projeto.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
