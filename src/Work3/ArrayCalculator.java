package Work3;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Random;

public class ArrayCalculator {
    private final int[] firstArr = new int[5];
    private final int[] secondArr = new int[5];

    public int[] fillArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(16);
        }
        return arr;
    }

    public void printArrs() {
        System.out.println(Arrays.toString(fillArr(firstArr)));
        System.out.println(Arrays.toString(fillArr(secondArr)));
    }

    private double findAverage(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    public void calculateAndPrintResult() {
        double firstAverage = findAverage(firstArr);
        double secondAverage = findAverage(secondArr);
        System.out.println("Среднее арифметическое первого массива равно: " + firstAverage);
        System.out.println("Среднее арифметическое второго массива равно: " + secondAverage);
        if (firstAverage > secondAverage) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (firstAverage < secondAverage) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Среднее арифметические равны.");
        }
    }

}
