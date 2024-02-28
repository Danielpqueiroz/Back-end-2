import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Array {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        int[] arrayA = {12, 3, 4, 5, 12, 23, 34, 45, 45, 67};

        Arrays.sort(arrayA);

        for (int i = 0; i < arrayA.length;i++){

            System.out.println(arrayA[i]);
        }




    }
}