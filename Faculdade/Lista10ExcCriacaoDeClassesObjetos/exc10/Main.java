package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc10;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Kizuna";
        aluno1.nota1 = 10;
        aluno1.nota2 = 5;

        System.out.println("Aluno: "+ aluno1.nome);
        aluno1.calcularMedia();
        aluno1.verificarAprovacao();
    }
}
