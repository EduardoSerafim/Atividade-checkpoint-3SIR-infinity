package br.com.fiap.catalogoFilmes.catalogoFilmes.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MusicaDto {
	private int id;
	
	@NotBlank
	@NotNull
	private String nome;
	
	@NotBlank
	@NotNull
	private String artista;
	
	@NotBlank
	@NotNull
	private String genero;
	
	
	private double duracao;
	
	@NotBlank
	@NotNull
	private String album;
	
	@NotBlank
	@NotNull
	private String gravadora;
	
	public MusicaDto(int id, String nome, String artista, String genero, double duracao, String album, String gravadora) {
		super();
		this.id = id;
		this.nome = nome;
		this.artista = artista;
		this.genero = genero;
		this.duracao = duracao;
		this.album = album;
		this.gravadora = gravadora;
	}
	
	public MusicaDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
}
