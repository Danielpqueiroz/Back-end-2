package org.example;

/*Escrever um código que sorteie um número randômico de 0 a 1000, peça um número inteiro
  neste intervalo, se o usuário errar, informar se o valor sorteado é maior ou menor que o
    informado e solicitar outro número do usuário até que ele acerte o número. Quando acertar,
    informar a quantidade de palpites que ele informou até acertar.
*/
import java.util.Random;
import java.util.Scanner;

public class Ex02Random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(1001);
        int cont = 0, numero = 0;

        System.out.println("Jogo do Número");
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        while (numero != numeroAleatorio) {

            if (numero < numeroAleatorio){
                System.out.println("O número digitado é menor! Tente outra vez");
                numero = sc.nextInt();
            }else if (numero > numeroAleatorio){
                System.out.println("O número digitado é maior! Tente outra vez");
                numero = sc.nextInt();
            }
        }
        System.out.println("Parabens você acertou!!!");
    }
}
