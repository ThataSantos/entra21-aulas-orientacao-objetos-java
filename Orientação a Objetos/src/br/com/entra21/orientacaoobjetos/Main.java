package br.com.entra21.orientacaoobjetos;

import java.util.Scanner;

import br.com.entra21.orientacaoobjetos.aula01.classes.Aluno;
import br.com.entra21.orientacaoobjetos.aula01.classes.Professor;
import br.com.entra21.orientacaoobjetos.aula02.heranca.Diretor;
import br.com.entra21.orientacaoobjetos.aula02.heranca.Funcionario;
import br.com.entra21.orientacaoobjetos.aula02.heranca.Pessoa;
import br.com.entra21.orientacaoobjetos.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacaoobjetos.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacaoobjetos.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacaoobjetos.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacaoobjetos.aula04.conceitospoo.Reta;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Aviao;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Capivara;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Gado;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Gato;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Humano;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Planta;
import br.com.entra21.orientacaoobjetos.aula04.interfaces.Sith;
import br.com.entra21.orientacaoobjetos.aula05.pratica.Revisao;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, ent?o ? um obj
	// porem o System.in ? uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orienta??o a objetos");

		do {
			System.out.println("Escolha uma op??o");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Heran?a");
			System.out.println("3 - Polimorfismo");
			System.out.println("4- Conceitos POO");
			System.out.println("5- Polimorfismo com Interfaces");
			System.out.println("6- Pratica com todos os conceitos");
			opcao = input.nextByte();

			switch (opcao) {
			case 0:

				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;
			case 3:
				aprenderClassesPolimorfismo();
				break;
			case 4:
				aprenderConceitosPoo();
				break;
			case 5:
				aprenderPolimorfismoInterface();
				break;
			case 6:
				revisarPOO();
				break;
			default:
				break;
			}

		} while (opcao != 0);

	}

	private static void aprenderClasses() {

		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela ? " + professoraIngles.getIdade());

		// Acessando o atributo est?tico da Classe Professor, atributos est?ticos ou
		// metodos estatico n?o pertencem aos objetos da Classe
		// dessa forma ? possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel ? independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as altera??es aqui s? afetam esse objeto
		alunoObjeto.idade = 18;

		// as altera??es aqui s? afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as altera??es aqui s? afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda n?o
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = input.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = input.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		Pessoa pessoa1 = new Pessoa();

		Diretor diretor1 = new Diretor("Paulo", (byte) 80, "08938491212", "Entra21", (byte) 10);
		diretor1.setNome("Paulo");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setObservacao("novato");

		Funcionario funcionario2 = new Funcionario("Fulano", (byte) 18, "07821199901", "Junin", 4000.05f);
		funcionario2.getCpf();

	}

	public static void aprenderClassesPolimorfismo() {

// padr?o de polimorfismo para comportamentos(m?todos) ? herdar.

// segunda forma do polimorfismo ? fazer completamente os comportamentos(m?todos) do meu jeito.

// terceira forma do polimorfismo ? aproveitar a minha heran?a e fazer um diferencial.

		Atleta cr7 = new Atleta();

		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarVitoria();

		System.out.println("----------------------------");

		Nadador michaelPhelps = new Nadador();

		michaelPhelps.setName("Michael Phelps");

		Nadador sergioMichael = new Nadador("S?rgio Michael", (byte) 39, 23, 40, "Pisc?na", "Sunga e Touca");

		System.out.println("Quer escrever uma frase?");
		String frase = input.nextLine();

		sergioMichael.comemorarVitoria(frase); // procura primeiro na minha classe Nadador, se n?o tiver busca na
												// heran?a.

		michaelPhelps.comemorarVitoria();

		System.out.println("----------------------------");

		Velocista usainBolt = new Velocista();

		usainBolt.setName("Usain Bolt");

		usainBolt.comemorarVitoria();

		System.out.println("----------------------------");

	}

	private static void aprenderConceitosPoo() {

		// A classe ponto tem alta COES?O pos ? preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-50, -500);

		// A classe reta ? AGREGADA por pontos que podem n?o estar inicializados.
		// A asocia??o de reta e ponto e de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);

	}

	private static void aprenderPolimorfismoInterface() {

		Humano Geovani = new Humano();
		Geovani.setNome("Geovani");
		Geovani.apresentarSe();
		Geovani.alimentar("Pizza");
		Geovani.locomover();
		Geovani.comunicar("Ol?!");

		Gato Vezu = new Gato("Vezu", new Pessoa("Rubem", (byte) 33, ""));

		Vezu.alimentar("Ra??o");
		Vezu.comunicar("Quero ra??o");
		Vezu.locomover();

		Capivara robson = new Capivara();
		robson.alimentar("?gua");
		robson.comunicar("");
		robson.locomover();

		Planta maracuja = new Planta("Passiflora edulis Sims");

		maracuja.alimentar("Carne");
		maracuja.comunicar("T? fazendo Sol hoje?");
		maracuja.locomover();

		Gado touro = new Gado("Mimoso");

		touro.alimentar("Capim");
		touro.comunicar("tem leite?");
		touro.locomover();

		Sith darth = new Sith("Vader");
		darth.alimentar("Carne");
		darth.comunicar("som de repira??o");
		darth.locomover();

		Aviao comercial = new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());

	}

	private static void revisarPOO() {

		Revisao.revisar();

	}
}