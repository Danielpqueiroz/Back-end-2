/*Escreva um código que receba um nome completo em forma de String e mostre as iniciais
do nome.
Ex.:
Entrada: Demetrius de Castro do Amaral
Saída: D.C.A

 */

package org.example;

import java.util.Scanner;

public class Ex03Iniciais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome completo : ");
        String nomeCompleto = sc.nextLine().toUpperCase();
        String iniciais = "";

        System.out.println("As iniciais do nome são: " );
        System.out.print(nomeCompleto.charAt(0) + ".");

        for(int i=0; i<nomeCompleto.length(); i++) {
            if(nomeCompleto.charAt(i) == ' ' && nomeCompleto.charAt(i + 3) != ' ') {
                System.out.print(nomeCompleto.charAt(i + 1) + ".");
            }
        }


        sc.close();
    }


}
