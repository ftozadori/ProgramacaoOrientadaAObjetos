package Faculdade.AtividadeDeRevisao2Bim;

public class Carro extends Veiculo implements OperacoesVeiculo{

    @Override
    public void exibirDados() {
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Marca do carro: "+marca);
        System.out.println("Placa do carro: "+placa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Seu carro está realizando manutenção...");
    }
}
