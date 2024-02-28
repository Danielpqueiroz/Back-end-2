import java.util.Date;

public class Aluno extends Pessoa{
    long matricula;

    public Aluno(String nome, Long cpf, Date dataNascimento, long matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
}
