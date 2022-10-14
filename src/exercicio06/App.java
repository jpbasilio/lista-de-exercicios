package exercicio06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
 * disponíveis com ao usuário;
 *
 *
 */

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //variable
        Double valorCotacao, qtdDolares, valorEmReais;

        //Entrada
        System.out.println("Qual o valor da cotação do dólar R$: ");
        valorCotacao = sc.nextDouble();
        System.out.println("Quantidade de dólares que possui, US$: ");
        qtdDolares = sc.nextDouble();

        valorEmReais = (qtdDolares * valorCotacao);

        System.out.printf("\nValor da conversão em real(R$): %.2f", valorEmReais);

    }

}
