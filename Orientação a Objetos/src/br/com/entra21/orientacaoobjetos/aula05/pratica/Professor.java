package br.com.entra21.orientacaoobjetos.aula05.pratica;

import br.com.entra21.orientacaoobjetos.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentosAcademicos {
	// atributos
	private Estudante estudantes[];
	private Disciplina disciplinas[];

	// construtores
	public Professor() {
		super();
	}

	public Professor(Estudante[] estudantes, Disciplina[] disciplinas) {
		super();
		this.estudantes = estudantes;
		this.setDisciplinas(disciplinas);
	}

	// construtores da super classe
	public Professor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);

	}

	// construtor com classe
	public Professor(String nome, byte idade, String cpf, Estudante[] estudantes, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.estudantes = estudantes;
		this.setDisciplinas(disciplinas);

	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas[]) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi sou o professor " + super.getNome() + " e tenho " + this.estudantes.length;

		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {
		String mensagem = "";
		Estudante estudanteLocalizado = null;
		for (byte estudante = 0; estudante < this.estudantes.length; estudante++) {
			// gabriel //gabriel //gabriel
			if (this.estudantes[estudante] != null && this.estudantes[estudante].getNome().equals(nome)) {
				estudanteLocalizado = this.estudantes[estudante];
				break;

			}
		} // gabriel
		if (estudanteLocalizado != null) {
			mensagem = escreverDetalheDossie(estudanteLocalizado);

		} else {
			mensagem = "Esse aluno não existe na minha lista";
		}

		return mensagem;
	}

	private String escreverDetalheDossie(Estudante estudante) {
		String detalhe = "O estudante " + estudante.getNome() + " já aprendeu " + estudante.getDisciplinas().length
				+ "disciplinas";
		detalhe += "\n observações que eu percebi sobre este estudante";
		detalhe += "\n " + estudante.getObservacao();

		return detalhe;
	}

}
