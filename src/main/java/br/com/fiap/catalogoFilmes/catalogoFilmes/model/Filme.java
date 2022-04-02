package br.com.fiap.catalogoFilmes.catalogoFilmes.model;

public class Filme {
	private int id;
	private String nome;
	private String sinopse;
	private String dataLancamento;
	private String autor;
	private String genero;
	private String atores;
	
	
	public Filme(int id, String nome, String sinopse, String dataLancamento, String autor, String genero,
			String atores) {
		super();
		this.id = id;
		this.nome = nome;
		this.sinopse = sinopse;
		this.dataLancamento = dataLancamento;
		this.autor = autor;
		this.genero = genero;
		this.atores = atores;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
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
