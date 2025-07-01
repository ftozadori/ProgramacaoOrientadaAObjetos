package JavaAcademy.IntroducaoAosPilares.test;

import javacoreAIntroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno";
        carro1.modelo = "Fire";
        carro1.ano = 2010;

        carro2.nome = "Fox";
        carro2.modelo = "Roock In Rio";
        carro2.ano = 2016;

        System.out.println("======Carro 1======");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println();
        System.out.println("======Carro 2======");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Modelo: " + carro2.modelo);
    }
}
