package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.model.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long>{
	
	Musica findByTitulo(String titulo);
	
}
