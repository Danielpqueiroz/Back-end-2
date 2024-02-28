import java.util.Date;

public class Funcionario extends Pessoa{
    Double salario;
    Date dataAdmicao;
    String cargo;

    public Funcionario(String nome, Long cpf, Date dataNascimento, Double salario, Date dataAdmicao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmicao = dataAdmicao;
        this.cargo = cargo;
    }
}
