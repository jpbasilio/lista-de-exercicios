package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Variaveis
        int num1, num2;

        //Entrada
        System.out.println("Digite um número: ");
        num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        num2 = ler.nextInt();

        //Saída
        System.out.println("A soma do numeros: " + (num1 + num2));

        ler.close();
    }
}
