package com.example.application.model;
import javax.persistence.*;

@Entity
@Table(name="musicas")
public class Musica {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String autor_letra;
	private String autor_musica;
	private String interprete;
	private int numero_quantidade_acompanhantes;
	
	
	

	public Musica() {
		super();
	}
	public Musica(Long id, String titulo, String autor_letra, String autor_musica, String interprete,
			int numero_quantidade_acompanhantes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor_letra = autor_letra;
		this.autor_musica = autor_musica;
		this.interprete = interprete;
		this.numero_quantidade_acompanhantes = numero_quantidade_acompanhantes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor_letra() {
		return autor_letra;
	}
	public void setAutor_letra(String autor_letra) {
		this.autor_letra = autor_letra;
	}
	public String getAutor_musica() {
		return autor_musica;
	}
	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getNumero_quantidade_acompanhantes() {
		return numero_quantidade_acompanhantes;
	}
	public void setNumero_quantidade_acompanhantes(int numero_quantidade_acompanhantes) {
		this.numero_quantidade_acompanhantes = numero_quantidade_acompanhantes;
	}

	
	
	
	
}
