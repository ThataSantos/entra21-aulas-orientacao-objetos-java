package br.com.entra21.orientacaoobjetos.aula05.pratica;

import br.com.entra21.orientacaoobjetos.aula02.heranca.Pessoa;

public class Estudante extends Pessoa implements ComportamentosAcademicos {



private Disciplina disciplinas[];



public Estudante() {
super();
}



public Estudante(Disciplina[] disciplinas) {
super();
this.disciplinas = disciplinas;
}



public Estudante(String nome, byte idade, String cpf) {
super(nome, idade, cpf);



}



public Estudante(String nome, byte idade, String cpf, Disciplina[] disciplinas) {
super(nome, idade, cpf);
this.disciplinas = disciplinas;



}



public Disciplina[] getDisciplinas() {
return disciplinas;
}



public void setDisciplinas(Disciplina[] disciplinas) {
this.disciplinas = disciplinas;
}



@Override
public String realizarApresentacao() {
String apresentacao = "Oi meu nome é " + super.getNome();
return apresentacao;
}



@Override
public String gerarDossie(String nome) {
String mensagem = "";
if (nome.equals(super.getNome())) {
mensagem = "O dosssie sobre min é gerado com minha interação entre professor e colegas";
} else {
mensagem = "Eiii.. Você errou meu nome";
}
return mensagem;
}



}
