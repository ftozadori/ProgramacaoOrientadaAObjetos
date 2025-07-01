package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc01E02E03;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Camaro", 2011 );
        Carro carro2 = new Carro("Volks", "Fox RockInRio", 2016 );

        carro.exibirDdos();
        System.out.println();
        carro2.exibirDdos();
    }
}
