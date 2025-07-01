package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc04E05;

public class Pessoa {
    String nome;
    int idade;

    void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }

     void fazerAniversario(){
       idade += 1;
    }

}
