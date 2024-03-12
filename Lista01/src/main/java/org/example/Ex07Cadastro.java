package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex07Cadastro {
    public static void main(String[] args) {
        // Cadastro de clientes
        Cliente cliente1 = new Cliente("Fulano", "123.456.789-00", "Rua A, 123", LocalDate.of(1990, 5, 15), "1234-5678");
        Cliente cliente2 = new Cliente("Ciclano", "987.654.321-00", "Rua B, 456", LocalDate.of(1985, 9, 25), "9876-5432");

        // Cadastro de livros
        Livro livro1 = new Livro("Java", "John", 300, "Tech");
        Livro livro2 = new Livro("Python", "Janeh", 400, "Tech");

        // Empréstimos
        List<EmprestimoDTO> emprestimos = new ArrayList<>();
        emprestimos.add(new EmprestimoDTO(cliente1, livro1, LocalDate.now(), LocalDate.now().plusDays(7)));
        emprestimos.add(new EmprestimoDTO(cliente2, livro2, LocalDate.now(), LocalDate.now().plusDays(14)));

        // Exibindo os empréstimos
        for (EmprestimoDTO emprestimo : emprestimos) {
            System.out.println("Cliente: " + emprestimo.getCliente().getNome());
            System.out.println("Livro: " + emprestimo.getLivro().getNome());
            System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
            System.out.println();
        }
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getters e Setters
}

class Livro {
    private String nome;
    private String autor;
    private int quantidadePaginas;
    private String editora;

    public Livro(String nome, String autor, int quantidadePaginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
// Getters e Setters
}

class EmprestimoDTO {
    private Cliente cliente;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public EmprestimoDTO(Cliente cliente, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e Setters
}
