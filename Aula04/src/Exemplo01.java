import java.util.Arrays;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(Integer n: list) {
            System.out.println(n);
        }
    }
}
