import java.util.Scanner;

interface Calculadora {
    int calculadora(int a, int b);
}

public class Exemplo02 {
    public static void main(String[] args) {
        Calculadora somar = (int a, int b) -> a + b;

        Calculadora subtrair = (int a, int b) -> a - b;

        Calculadora multiplicar = (int a, int b) -> a * b;

        Calculadora dividir = (int a, int b) -> a / b;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2 = entrada.nextInt();

        int resultadoSoma = somar.calculadora(valor1, valor2);
        System.out.println("Somar: " + resultadoSoma);
        int resultadoSubtrair = subtrair.calculadora(valor1, valor2);
        System.out.println("Subtrair: " + resultadoSubtrair);
        int resultadoMultiplicacao = multiplicar.calculadora(valor1, valor2);
        System.out.println("Multiplicar: " + resultadoMultiplicacao);
        int resultadoDividir = dividir.calculadora(valor1, valor2);
        System.out.println("Dividir: " + resultadoDividir);

        entrada.close();
    }
}
