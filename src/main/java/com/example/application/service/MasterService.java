package com.example.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.model.Musica;
import com.example.application.model.Pessoa;

@Service
public class MasterService {
	
	@Autowired private MusicaService musicaService;
	@Autowired private PessoaService pessoaService;
	

	public boolean salvar(Pessoa pessoa, Musica musica) throws Exception {
		
		if(!pessoaService.validar(pessoa)) {
			throw new Exception("Email ou Cpf da Pessoa indisponível");
		}
		
		if(!musicaService.validar(musica)) {
			throw new Exception("Título da Música Indisponível");
		}
		
		pessoaService.salvar(pessoa);
		musicaService.salvar(musica);
		
		return true;
		
	}
}
