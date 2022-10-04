package exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Variaveis
        String aluno;
        double nota1, nota2, nota3;

        //Entrada
        System.out.println("Digite o nome do aluno: ");
        aluno = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(aluno);
        System.out.println("Média: " + media);
    }
}
