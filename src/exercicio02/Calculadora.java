package exercicio02;

public class Calculadora {

    public static void soma(double num1, double num2){
        double result = num1 + num2;
        System.out.println("A Soma dos números: " + result);
    }

    public static void subtracao(double num1, double num2){
        double result = num1 - num2;
        System.out.println("A Subtração dos números: " + result);
    }

    public static void multiplicacao(double num1, double num2){
        double result = num1 * num2;
        System.out.println("A Multiplicação dos números: " + result);
    }

    public static void divisao(double num1, double num2){
        double result = num1 / num2;
        System.out.println("A Divisão dos números: " + result);
    }
}
