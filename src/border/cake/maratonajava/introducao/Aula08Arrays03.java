package border.cake.maratonajava.introducao;

public class Aula08Arrays03 {
    public static void main(String[] args) {
        int[] number = new int[3];
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers0 = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numbers0.length; i++) {
//            System.out.println(numbers0[i]);
//        }

        for (int num : numbers0) {
            System.out.println(num);
        }
    }
}
