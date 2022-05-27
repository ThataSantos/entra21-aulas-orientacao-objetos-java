package br.com.entra21.orientacaoobjetos.aula04.interfaces;

public class Gado implements Individuo {
	
	private String nome;
	
	public Gado(String nome) {
		super();
		this.setNome(nome);
	}
	

	@Override
	public void alimentar(String alimento) {
		System.out.println("Muuu eu como"+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("Eu ando com minhas pernas");
		
	}

	@Override
	public void comunicar(String conteudo) {
	System.out.println("MUuuuuuuu");
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
 
	
}
