package br.com.fiap.catalogoFilmes.catalogoFilmes.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FilmeDto {
	private int id;

	@NotBlank
	@NotNull
	private String nome;

	@NotBlank
	@NotNull
	private String sinopse;

	@NotBlank
	@NotNull
	private String dataLancamento;

	@NotBlank
	@NotNull
	private String diretor;

	@NotBlank
	@NotNull
	private String genero;

	@NotBlank
	@NotNull
	private String atores;

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

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

}
