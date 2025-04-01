package Teste;

import java.util.Scanner;

public class TestaOlaMundo {
    public static void main(String[] args) {
        //<nome classe> <nome do objeto> = new <nome classe>
        OlaMundo xyz = new OlaMundo();
        xyz.imprimirDados();
        xyz.imprimir("Fernando",18);

        // Criação de um objeto para leitura de dados
        Scanner leDados = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leDados.nextLine();

        System.out.print("Digite seu idade: ");
        int valor = leDados.nextInt();

        xyz.imprimir(nome, valor);
    }
}
