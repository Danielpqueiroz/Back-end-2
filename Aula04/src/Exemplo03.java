import java.util.List;

public class Exemplo03 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Daniel", "Carlos", "Bia", "Diego", "Amanda", "Murilo", "Maria", "Mario", "Simone", "Tiago", "Marcio");
        List<String> nomesComM = nomes.stream();


        nomes.forEach(n -> System.out.println(n.startsWith("M") ? n : null));

    }

}
