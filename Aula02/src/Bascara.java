import java.util.Scanner;

public class Bascara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um valor para a: ");
        Double a = sc.nextDouble();
        System.out.printf("Digite um valor para b: ");
        Double b = sc.nextDouble();
        System.out.printf("Digite um valor para c: ");
        Double c = sc.nextDouble();
        Double delta;
        delta = ((b*b)-4*a*c);

        if (delta <= 0){
            System.out.printf("A equação nao possui raizes reais ");
        }

    }

}
