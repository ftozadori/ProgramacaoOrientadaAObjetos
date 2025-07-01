package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc10;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("Média final: "+ media);
    }

    void verificarAprovacao(){
        if (media >= 7){
            System.out.println("Aluno aprovado...");
        } else {
            System.out.println("Aluno REPROVADO...");
        }

    }
}
