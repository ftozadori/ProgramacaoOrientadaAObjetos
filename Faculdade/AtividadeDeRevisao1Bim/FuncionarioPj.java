package Faculdade.AtividadeDeRevisao1Bim;

public class FuncionarioPj extends Funcionario{
    double taxaContrato;

    public FuncionarioPj(String nome, double salario, double taxaContrato){
        super(nome,salario);
        this.taxaContrato = taxaContrato;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Taxa de contrato: "+ taxaContrato);
    }
}
