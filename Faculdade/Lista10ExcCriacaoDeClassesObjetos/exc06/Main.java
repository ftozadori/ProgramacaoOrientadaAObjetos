package Faculdade.Lista10ExcCriacaoDeClassesObjetos.exc06;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setPreco(1560);
        produto1.setNome("Geladeira");

        System.out.println("Produto: "+ produto1.getNome());
        System.out.println("Preço: "+ produto1.getPreco());
    }
}
