package Faculdade.AtividadeDeRevisao2Bim;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorVeiculos {
    private List<Veiculo> veiculos;
    private final String nomeArquivo = "veiculos.txt";

    public GerenciadorVeiculos(){
        veiculos = new ArrayList<>();
        carregarDoArquivo();
    }

    public void cadastrarVeiculo(Veiculo v){
        for (Veiculo veiculo : veiculos){
            if (veiculo.placa.equalsIgnoreCase(v.placa)){
                System.out.println("Veículo já cadastrado!!!");
            }
        }
        veiculos.add(v);
        salvarNoArquivo();
        v.cadastrarVeiculo();
    }

    public void listarVeiculos(){
        if (veiculos.isEmpty()){
            System.out.println("======= Nenhum veículo cadastrado... ==========");
        }
        for (Veiculo v : veiculos){
            v.exibirDados();
            System.out.println("(==========================================)");
        }
    }

    public void atualizarVeiculo(String placa, String novaMarca, String novoModelo){
        for (Veiculo v : veiculos){
            if (v.placa.equalsIgnoreCase(placa)){
                v.marca = novaMarca;
                v.modelo = novoModelo;
                salvarNoArquivo();
                System.out.println("Atualização realizada com sucesso!!!");
                return;
            }
        }
        System.out.println("Veículo não encontrado...");
    }

    public void removerVeiculo(String placa){
        Iterator<Veiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()){
            Veiculo v = iterator.next();
            if (v.placa.equalsIgnoreCase(placa)){
                iterator.remove();
                salvarNoArquivo();
                System.out.println("Veículo removido com suceeso");
                return;
            }
        }
        System.out.println("Veículo não encontrado...");
    }

    public void realizarManutencao(String placa){
        for (Veiculo v : veiculos){
            if (v.placa.equalsIgnoreCase(placa)){
                if (v instanceof OperacoesVeiculo){
                    ((OperacoesVeiculo) v).realizarManutencao();
                    return;
                }
            }
        }
        System.out.println("Veículo removido com suceeso");
    }

    private void salvarNoArquivo(){
        try (BufferedWriter arquivo = new BufferedWriter(new FileWriter(nomeArquivo))){
            for (Veiculo v : veiculos){
                String tipo = (v instanceof Carro) ? "Carro" : "Moto";
                arquivo.write(tipo + ";" + v.placa + ";" + v.marca + ";" +v.modelo);
                arquivo.newLine();
            }
        }catch (IOException e){
            System.out.println("Erro ao salvar no arquivo "+ e.getMessage());
        }
    }

    private void carregarDoArquivo() {
        File arquivoTeste = new File(nomeArquivo);
        if (!arquivoTeste.exists()) return;

        try (BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            String[] partes = null;
            while ((linha = arquivo.readLine()) != null) {
                partes = linha.split(";");
                if (partes.length == 4) {
                    Veiculo v = null;
                    if (partes[0].equalsIgnoreCase("Carro")) {
                        v = new Carro();
                    }
                    if (partes[0].equalsIgnoreCase("Moto")) {
                        v = new Moto();
                    }
                    v.placa = partes[1];
                    v.marca = partes[2];
                    v.modelo = partes[3];
                    veiculos.add(v);
                }
            }
         }catch (IOException e){
            System.out.println("Erro ao carregar arquivo: "+ e.getMessage());
         }
    }

}
