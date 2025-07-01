package Faculdade.AtividadeDeRevisao2Bim;

public abstract class Veiculo {
    String placa;
    String marca;
    String modelo;

    public void cadastrarVeiculo(){
        System.out.println("Veículo cadastrado com sucesso!!!");
    }

    public abstract void exibirDados();

}
