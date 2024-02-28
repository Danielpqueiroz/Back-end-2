import java.util.Date;

public class Pessoa {
    String nome;
    Long cpf;
    Date dataNascimento;

    public Pessoa (String nome, Long cpf, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
