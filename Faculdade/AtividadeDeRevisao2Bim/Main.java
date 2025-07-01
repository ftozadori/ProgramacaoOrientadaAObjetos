package Faculdade.AtividadeDeRevisao2Bim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();
        Scanner leitor = new Scanner(System.in);

        while (true){
            System.out.println("\n1 - Cadastrar Veículo");
            System.out.println("2 - Listar Veículo");
            System.out.println("3 - Atualizar Veículo");
            System.out.println("4 - Remover Veículo");
            System.out.println("5 - Realizar Manutenção");
            System.out.println("6 - Sair");
            System.out.println("Opção: ");

            String op = leitor.nextLine();

            try{
                switch (op){
                    case "1":
                        System.out.println("Carro ou Moto? ");
                        String tipo = leitor.nextLine();

                        System.out.println("Placa: ");
                        String placa = leitor.nextLine();

                        System.out.println("Marca: ");
                        String marca = leitor.nextLine();

                        System.out.println("Modelo: ");
                        String modelo = leitor.nextLine();

                        Veiculo v = tipo.equalsIgnoreCase("Carro") ? new Carro() : new Moto();
                        v.placa= placa;
                        v.marca = marca;
                        v.modelo = modelo;

                        gerenciador.cadastrarVeiculo(v);
                        break;

                    case "2":
                        gerenciador.listarVeiculos();
                        break;

                    case "3":
                        System.out.println("Placa do Veículo: ");
                        String placaAtualizar = leitor.nextLine();
                        System.out.println("Nova Marca: ");
                        String novaMarca = leitor.nextLine();
                        System.out.println("Novo Modelo: ");
                        String novoModelo = leitor.nextLine();
                        gerenciador.atualizarVeiculo(placaAtualizar, novaMarca, novoModelo);
                        break;

                    case "4":
                        System.out.println("Placa do Veículo: ");
                        String placaRemover = leitor.nextLine();
                        gerenciador.removerVeiculo(placaRemover);
                        break;

                    case "5":
                        System.out.println("Placa do Veículo: ");
                        String manutencaoPlaca = leitor.nextLine();
                        gerenciador.realizarManutencao(manutencaoPlaca);
                        break;

                    case "6":
                        System.out.println("Saindo...");
                        return;

                    default:
                        System.out.println("Opção Inválida...");
                }
            }catch (Exception e){
                System.out.println("Erro: "+ e.getMessage());
            }
        }
    }
}
