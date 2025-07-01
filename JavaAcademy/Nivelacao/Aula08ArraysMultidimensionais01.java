package JavaAcademy.Nivelacao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // 1, 2, 3, 4, 5 Meses
        // 31, 28, 30 Dias

        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 26;
        dias[1][2] = 27;

        dias[2][0] = 25;
        dias[2][1] = 24;
        dias[2][2] = 22;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        // foreach arrey multidimensional
        System.out.println("Dentro do foreach");

        for (int[] arreyBase: dias){
            for (int num: arreyBase){
                System.out.println(num);
            }
        }
    }
}
