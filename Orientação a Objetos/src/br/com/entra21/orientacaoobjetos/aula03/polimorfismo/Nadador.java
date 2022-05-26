package br.com.entra21.orientacaoobjetos.aula03.polimorfismo;

public class Nadador extends Atleta { // minha classe Nadador pegando atributos da minha super-Classe Atleta

	private String ambienteAquatico;
	private String equipamentoAquatico;

	public Nadador() { // construtor vazio

	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) { // construtor com meus atributos da classe
// Nadador
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}

	public Nadador(String nome, byte age, int qtdLoss, int qtdWin, String ambienteAquatico,
			String equipamentoAquatico) {
		super(nome, age, qtdLoss, qtdWin); // construtor com meus atributos da classe Nadador também atributos da minha
// super-Classe Atleta
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentoAquatico() {
		return equipamentoAquatico;
	}

	public void setEquipamentoAquatico(String equipamentoAquatico) {
		this.equipamentoAquatico = equipamentoAquatico;
	}

// comemorar vitória já existe na super-Classe
// mas se eu criar com o mesmo nome visibilidade, tipo de retorno e argumentos
// o método escolhido será esse aqui, não o da super-Classe

	public void comemorarVitoria(String frase) {
		setQtdWin(getQtdWin() + 1);
		System.out.println(getName() + (frase.isEmpty() ? " comemora batendo as mãos na água" : frase));
// isEmpty testa se a string tem zero caracteres.
	}

}