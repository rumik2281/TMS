package Work4;

import java.util.Random;

public class MatrixCalculator {

    private final int[][] arr = new int[5][5];


    private void fillMatrix() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
    }

    public void printMatrix() {
        fillMatrix();
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.print("\n");
        }
    }

    public int countSum() {
        int sum = 0;
        int j = 0;
        for (int[] ints : arr) {
            if (ints[j] % 2 == 0) {
                sum += ints[j];
            }
            j++;
        }
        return sum;
    }

    public void printResult() {
        System.out.println("Сумма чётных элементов главной диагонали: " + countSum());
    }
}
