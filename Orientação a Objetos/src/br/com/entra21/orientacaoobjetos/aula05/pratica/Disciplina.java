package br.com.entra21.orientacaoobjetos.aula05.pratica;

public class Disciplina {



	//atributos da classe
	private String nome;
	private String assuntos[];
	private float nota;

	//construtor vazio
	public Disciplina() {

	}



	//construtor com os atributos
	public Disciplina(String nome, String[] assuntos, float nota) {
	super();
	this.nome = nome;
	this.assuntos = assuntos;
	this.nota = nota;
	}

	//encapsulamento
	public String getNome() {
	return nome;
	}



	public void setNome(String nome) {
	this.nome = nome;
	}



	public String[] getAssuntos() {
	return assuntos;
	}



	public void setAssuntos(String[] assuntos) {
	this.assuntos = assuntos;
	}



	public float getNota() {
	return nota;
	}



	public void setNota(float nota) {
	this.nota = nota;
	}



	}
