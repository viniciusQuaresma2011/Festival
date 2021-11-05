package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.model.Musica;
import com.example.application.model.Pessoa;
import com.example.application.repository.MusicaRepository;

@Service
public class MusicaService {
	
	@Autowired private MusicaRepository repository;
	
	public void salvar(Musica musica) {
		repository.save(musica);
	}
	
	public List<Musica> listar() {
		return repository.findAll();
	}
	
	public boolean validar(Musica musica) {
		
		boolean disponibilidadeTitulo = verificarDisponibilidadeTitulo(musica.getTitulo());
		
		return disponibilidadeTitulo;
		
	}
	
	public boolean verificarDisponibilidadeTitulo(String titulo) {
		return repository.findByTitulo(titulo) == null;
	}
	
}
