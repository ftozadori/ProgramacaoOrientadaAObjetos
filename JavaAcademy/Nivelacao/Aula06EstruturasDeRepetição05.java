package JavaAcademy.Nivelacao;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor Parcela >= 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela: "+ parcela + " R$ "+ valorParcela);
        }
    }
}
