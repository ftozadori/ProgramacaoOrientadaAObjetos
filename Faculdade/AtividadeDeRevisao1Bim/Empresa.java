package Faculdade.AtividadeDeRevisao1Bim;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println("=======================================");
        }
    }
}
