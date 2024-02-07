import java.util.Scanner;

public class Calculadora {
    public static <string> void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        int n1, n2;
        double res;
        System.out.println("Digite uma valor inteiro : ");
        n1 = sc1.nextInt();
        System.out.println("Digite uma valor inteiro : ");
        n2 = sc1.nextInt();
        System.out.println("Digite uma +, -, *, / pra ser realizada a operação: ");
        String operacao = sc1.next();

        switch (operacao) {
            case "+":
                res = n1 + n2;
                System.out.printf("O resultado da soma dos numeros é %s", res);
                break;
            case "-":
                res = n1 - n2;
                System.out.printf("O resultado da subtração dos numeros é %s", res);
                break;
            case "*":
                res = n1 * n2;
                System.out.printf("O resultado da multiplicação dos numeros é %s", res);
                break;
            case "/":
                res = (double) n1 / n2;
                System.out.println(res);
                System.out.printf("O resultado da divisão dos numeros é %s", res);
                break;
        }
    }
}
