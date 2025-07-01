package Faculdade.AtividadeDeRevisao1Bim;

public class FuncionarioClt extends Funcionario{
    double beneficio;

    public FuncionarioClt(String nome, double salario, double beneficio){
        super(nome,salario);
        this.beneficio = beneficio;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Beneficio do funcionario: "+ beneficio);
    }

}
