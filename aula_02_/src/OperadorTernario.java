import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.printf("Digite o primeiro numero: ");
        int num2 = sc.nextInt();

        System.out.println((num1 > num2) ? "O primeiro valor é maior" : "O segundo valor é maior");
    }
}
