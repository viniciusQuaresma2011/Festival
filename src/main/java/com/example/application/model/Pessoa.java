package com.example.application.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="musicas")
public class Pessoa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private List<Musica> musicas;
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String fone;
	private String email;
	private String banda;
	private String acompanhante;
	private String termo_de_responsabilidade;
	private String biografia;
	
	

	public Pessoa() {
		super();
	}
	public Pessoa(Long id, String nome, String cpf, String rg, String endereco, String bairro, String cep,
			String cidade, String estado, String fone, String email, String banda, String acompanhante, String termo_de_responsabilidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.fone = fone;
		this.email = email;
		this.banda = banda;
		this.acompanhante = acompanhante;
		this.termo_de_responsabilidade = termo_de_responsabilidade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}

	public String getTermo_de_responsabilidade() {
		return termo_de_responsabilidade;
	}

	public void setTermo_de_responsabilidade(String termo_de_responsabilidade) {
		this.termo_de_responsabilidade = termo_de_responsabilidade;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
	
	
}
