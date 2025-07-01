package JavaAcademy.Nivelacao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
       String nome = "Felipe Tozadori Silva", endereco = "Rua José Francisco Ferreira N:120", data = "13/03/2025";
       float salario = 2698.57F;

        System.out.println("Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salario de "+salario+
                ", na data "+data+".");
    }
}
