package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex04Inverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome qualquer para que seja invertido :");
        String nome = sc.nextLine();


        for (int i = nome.length()-1; i >= 0; i--){
            System.out.print(nome.charAt(i));
        }
    }


}
