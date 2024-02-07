import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        int n1, n2, n3;
        double media;
        System.out.println("Digite uma valor inteiro entre 1 e 10: ");
        n1 = sc1.nextInt();
        System.out.println("Digite uma valor inteiro entre 1 e 10: ");
        n2 = sc1.nextInt();
        System.out.println("Digite uma valor inteiro entre 1 e 10: ");
        n3 = sc1.nextInt();

        if (-1<n1 && n1<11 && -1<n2 && n2<11 && -1<n3 && n3<11) {
            media = (n1 + n2 + n3)/3;
            System.out.println(media);

            if (media > 6){
                System.out.printf("Media: %s . APROVADO!!", media);
            }
            if (media > 3 && media < 7){
                System.out.printf("Media: %s . RECUPERAÇÃO!!", media);
            }
            if (media < 3){
                System.out.printf("Media: %s . REPROVADO!!", media);;
            }
        }
    }
}
