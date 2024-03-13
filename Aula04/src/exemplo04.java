import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exemplo04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4);
        for (int i = 0;i < numeros.size();i++){
            System.out.println(numeros.get(i) * numeros.get(i));
        }
        numeros.forEach(n -> System.out.println(n * n));
    }
}
