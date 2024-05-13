import java.util.Scanner;

public class CalculoFuncao {

    public static double calcularFuncao(double a, double b) {
        return Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();


        double resultado = calcularFuncao(a, b);

        System.out.println("O resultado da função x = a² + 2ab + b² é: " + resultado);
    }
}
