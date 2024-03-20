import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.printf("Digite o primeiro numero: ");
        int num2 = sc.nextInt();
        System.out.printf("Digite o primeiro numero: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1);
            if (num2 <= num3) {
                System.out.println(","+ num2 +","+ num3);

            } else {
                System.out.println(","+ num3 +","+ num2);

                }
            } else {
            if (num2 <= num1 && num2 <= num3) {
                System.out.print(num2);
                if (num1 <= num3) {
                    System.out.println(","+ num1 +","+ num3);

                } else {
                    System.out.println(","+ num3 +","+ num1);

                }
            } else {
                    System.out.print(num3);
                    if (num1 <= num2) {
                        System.out.println(","+ num1 +","+ num2);

                    } else {
                        System.out.println(","+ num2 +","+ num1);

                    }

            }

        }
    }
}