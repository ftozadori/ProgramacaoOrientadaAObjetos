package JavaAcademy.Nivelacao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        String[] numeros3 = new String[]{"Felipe","Ana","José","Isabela","Lucas"};

        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        for (String i : numeros3){
            System.out.println(i);
        }
    }
}
