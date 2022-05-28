package br.com.entra21.orientacaoobjetos.aula05.pratica;

import java.util.Scanner;

public class Revisao {
	 
    static Scanner input = new Scanner(System.in);
    static Professor oliota;


    public static void revisar() {
 
        byte opcao;
 
        gerarDados();

        do {
 
            System.out.println("Escolha uma opção");
            System.out.println("0 - Sair");
            System.out.println("1 - Revisar");
            opcao = input.nextByte();
 
            switch (opcao) {
            case 0:
 
                System.out.println("bye bye");

                break;
            case 1:
 
                

                break;
            default:
                System.out.println("Opção inválida pateta");
                break;
            }
 
        } while (opcao != 0);
 
    }

    private static void gerarDados() {

        oliota = new Professor ("Oliota", (byte) 33, "123.456.789-00");


    }
 
}