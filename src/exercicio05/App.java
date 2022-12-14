package exercicio05;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
 * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 *
 * @author João Silva
 */

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double vTempCentigrados, vTempFahrenheit;

        System.out.println("Informe a temperatura em graus Centigrados: ");
        vTempCentigrados = ler.nextDouble();

        vTempFahrenheit = (9 * vTempCentigrados + 160)/5;
        System.out.println("Temperatura em Fahrenheit: " + vTempFahrenheit);
//        System.out.println(" ");
//        Double grausFahrenheit = ((vTempCentigrados * 1.8)+32);
//        System.out.printf("Temperatura em Fahrenheit: %.2f", grausFahrenheit);

        ler.close();
    }
}
