package exercicio03;

/**
 * Escreva um algoritmo para determinar o
 * consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;
 *
 * @author João Silva
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        //Variaveis
        Integer distanciaTotal;
        Double totalDeCombustivel;

        System.out.println("Entre com a distância total percorrida: ");
        distanciaTotal = ler.nextInt();
        System.out.println("Entre com o total de combustível gasto: ");
        totalDeCombustivel = ler.nextDouble();

        Double result = distanciaTotal / totalDeCombustivel; //Processamento

        //Saída
        System.out.printf("\nO consumo médio de " +
                "combustível do seu veiculo foi: %.1f quilômetros por litro.", result);

        System.out.println();

        ler.close();
    }
}
