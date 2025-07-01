package Faculdade.AtividadeDeRevisao2Bim;

public class Moto extends Veiculo implements OperacoesVeiculo{

    @Override
    public void exibirDados() {
        System.out.println("Modelo do moto: "+modelo);
        System.out.println("Marca do moto: "+marca);
        System.out.println("Placa do moto: "+placa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Sua moto está realizando manutenção...");
    }
}
