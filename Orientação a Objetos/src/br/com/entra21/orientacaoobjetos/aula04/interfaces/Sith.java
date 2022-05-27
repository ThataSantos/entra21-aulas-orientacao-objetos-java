package br.com.entra21.orientacaoobjetos.aula04.interfaces;

public class Sith implements Individuo {
	private String nome;

	public Sith(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println("Eu me alimento do medo" + alimento);

	}

	@Override
	public void locomover() {
		System.out.println("ando, corro e teleporto");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("com minha mente");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
