package br.com.entra21.orientacaoobjetos.aula05.pratica;

public interface ComportamentosAcademicos {
    // deve ser publico pois o objetivo é as classes terem acesso
    // neste caso, retorna uma String
    // que pode ser aproveitado em um syso, alimentar variaveis, participar de um
    // calculo
 
    public String realizarApresentacao();
 
    // retorna uma String e precisa de um parametro recebido como argumento.
    public String gerarDossie(String nome);
}