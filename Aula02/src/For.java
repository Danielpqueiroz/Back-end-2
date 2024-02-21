import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        int num1 = sc.nextInt();


        for( int i = 0; i <= num1; i++){
            for(int j = 1; j <= i; j++){
                if (j == num1){
                    System.out.print(j);
                }else{
                    System.out.print(j + ",");
                }

            }
            System.out.println();
        }

    }
}
