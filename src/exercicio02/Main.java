package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
 * dos dois números lidos;
 *
 * @author João Silva
 */

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        //Variaveis
        double numero1, numero2;

        //Entrada
        System.out.println("Digite um número: ");
        numero1 = ler.nextDouble();
        System.out.println("Digite outro número: ");
        numero2 = ler.nextDouble();

        Calculadora.soma(numero1,numero2);
        Calculadora.subtracao(numero1,numero2);
        Calculadora.multiplicacao(numero1,numero2);
        Calculadora.divisao(numero1,numero2);


        ler.close();
    }
}
