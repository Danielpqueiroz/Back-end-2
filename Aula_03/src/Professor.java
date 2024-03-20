import java.util.Date;

public class Professor extends Pessoa{
    Double salario;
    String disciplina;

    public Professor(String nome, Long cpf, Date dataNascimento, Double salario, String disciplina) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
