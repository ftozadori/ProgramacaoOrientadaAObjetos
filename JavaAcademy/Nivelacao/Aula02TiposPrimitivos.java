package JavaAcademy.Nivelacao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        double salarioDouble = 2000;
        float salarioFloat = 2500.54F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; //trabalha com asci ou unicode usando '\u0041'
        String nome = "Goku";

        System.out.println("A idade é "+ age +" anos.");
        System.out.println(falso);
        System.out.println("char: "+caractere);
        System.out.println("Oi, meu nome é "+nome);
    }
}
