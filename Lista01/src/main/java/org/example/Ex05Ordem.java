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
