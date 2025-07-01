package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc01E02E03;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirDdos(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Marca: "+ marca);
        System.out.println("Ano: "+ ano);
    }
}
