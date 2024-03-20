import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Soma s1 = new Soma(5,2);
        System.out.println(s1.valor());

        Compras c1 = new Compras("melacia", 21.0, 12);
        System.out.println(c1.valorTotal());
    }

}
