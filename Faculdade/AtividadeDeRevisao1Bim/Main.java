package Faculdade.AtividadeDeRevisao1Bim;

public class Main {
    public static void main(String[] args) {
        Funcionario pessoa1 = new FuncionarioPj("Felipe Tozadori", 15000,10000);
        Funcionario pessoa2 = new FuncionarioClt("Ana Clara", 10000, 1500);

        System.out.println("Dados dos funcionarios...");
        pessoa1.exibirDados();
        System.out.println("=======================================");
        pessoa2.exibirDados();
        System.out.println();
        System.out.println();

        Empresa empresa1 = new Empresa("Nova Tec");

        empresa1.addFuncionario(pessoa1);
        empresa1.addFuncionario(pessoa2);

        empresa1.exibirFuncionarios();
    }
}
