package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc04E05;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Felipe";
        pessoa1.idade = 21;

        System.out.println("Antes do aniversário:");
        pessoa1.exibirDados();
        pessoa1.fazerAniversario();
        System.out.println("Depois do aniversário:");
        pessoa1.exibirDados();

    }
}
