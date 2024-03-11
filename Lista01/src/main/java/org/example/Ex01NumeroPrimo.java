package org.example;

import java.util.Scanner;

public class Ex01NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int number = sc.nextInt();
        int cont = 0;
        if (number > 1){

            for (int i = 2; i <= number-1; i++){
                if (number % i == 0){
                    cont += 1;
                }
            }if (cont == 0){
                System.out.println("O número informado é primo!");
            }else{
                System.out.println("O número informado não é primo!");
            }

        }else {
            System.out.println("O número informado não é primo!");
        }

    }


}
