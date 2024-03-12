import java.util.Scanner;

public class Ex06Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] aluno = new String[100];
        int[] nota1 = new int[100];
        int[] nota2 = new int[100];
        int[] nota3 = new int[100];
        int[] alunosAprovados = new int[100];
        int[] alunosReprovados = new int[100];
        Double[] media = new Double[100];
        Double mediaTotal = 0.0;
        int contAprovados = 0;
        int contReprovados = 0;
        int cont = 0;

        while (true) {
            System.out.println("Para sair da aplicação digite SAIR");
            System.out.println("Digite o nome do aluno: ");
            aluno[cont] = sc.nextLine();

            if (aluno[cont].equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a primeira nota do aluno: ");
            nota1[cont] = Integer.parseInt(sc.nextLine());
            System.out.println("Digite a segunda nota do aluno: ");
            nota2[cont] = Integer.parseInt(sc.nextLine());
            System.out.println("Digite a terceira nota do aluno: ");
            nota3[cont] = Integer.parseInt(sc.nextLine());

            media[cont] = (nota1[cont] + nota2[cont] + nota3[cont]) / 3.0;
            mediaTotal += media[cont];

            if (media[cont] >= 6) {
                alunosAprovados[contAprovados] = cont;
                contAprovados++;
            } else {
                alunosReprovados[contReprovados] = cont;
                contReprovados++;
            }
            cont++;
        }

        System.out.println("\nAlunos:");
        for (int i = 0; i < cont; i++) {
            System.out.println(aluno[i] + ", Nota01: " + nota1[i] + ", Nota02: " + nota2[i] + ", Nota03: " + nota3[i] + ", Media: " + media[i]);
        }
        System.out.println("\nA media geral da turma é: " + (mediaTotal / cont) + ".");
        System.out.println("Quantidade de alunos APROVADOS: " + contAprovados);
        System.out.println("Quantidade de alunos REPROVADOS: " + contReprovados);
        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < contAprovados; i++) {
            System.out.println("Aluno: " + aluno[alunosAprovados[i]]);
        }
        System.out.println("\nAlunos reprovados:");
        for (int i = 0; i < contReprovados; i++) {
            System.out.println("Aluno: " + aluno[alunosReprovados[i]]);
        }

        sc.close();
    }
}
