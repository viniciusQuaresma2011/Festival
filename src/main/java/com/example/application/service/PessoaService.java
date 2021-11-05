package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.model.Pessoa;
import com.example.application.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	
	public void salvar(Pessoa pessoa) {
		repository.save(pessoa);
	}
	
	public List<Pessoa> listar() {
		return repository.findAll();
	}
	
	public boolean validar(Pessoa pessoa) {
		
		boolean disponibilidadeCpf = verificarDisponibilidadeCpf(pessoa.getCpf());
		boolean disponibilidadeEmail = verificarDisponibilidadeEmail(pessoa.getEmail());
		
		return disponibilidadeCpf && disponibilidadeEmail;
		
	}
	
	public boolean verificarDisponibilidadeCpf(String cpf) {
		return repository.findByCpf(cpf) == null;
	}
	
	public boolean verificarDisponibilidadeEmail(String email) {
		return repository.findByEmail(email) == null;
	}
}
