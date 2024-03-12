/* Escreva um código que receba uma String simples (apenas uma palavra) e monte um array
com os valores respectivos a cada letra da palavra, os organize em ordem crescente, imprima
esse array e a palavra na nova ordem.
Ex.:
Entrada: estudar
Array: {5, 19, 20, 21, 4, 1, 18}
Array ordenado: {1, 4, 5, 18, 19, 20, 21}
Saída: aderstu.

 */

package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05Ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("Digite a palavra para ser escrita na ordem crescente: ");
        palavra = sc.nextLine().toLowerCase();
        int[] ordem = new int[palavra.length()] ;

        for (int i = 0; i < palavra.length(); i++) {
            ordem[i] = palavra.charAt(i) - 'a' + 1;
            System.out.print(palavra.charAt(i) - 'a' + 1 + ",");

        }
        Arrays.sort(ordem);
        System.out.println();
        for (int i = 0; i < ordem.length; i++) {
            System.out.print(ordem[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < ordem.length; i++) {
            System.out.print((char) (ordem[i] + 'a' - 1));
        }
    }
}
