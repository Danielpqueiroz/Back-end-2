import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite uma valor inteiro: ");
        Scanner sc1 = new Scanner(System.in);
        int n;
        n = sc1.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("+");
            }
            System.out.println();

        }
    }
}