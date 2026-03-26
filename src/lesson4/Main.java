package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    private static int[] replaceNumbers(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = 1;
            } else {
                num[i] = 0;
            }
        }
        return num;
    }
    private static void numbersCount() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 10 == 0) {
                System.out.println();
            }
        }
    }
    private static void numberChange(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] *= 2;
                System.out.print(num[i] + " ,");
            }

        }
    }
    private static void fillOneDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }
    private static void fillTowDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
    }
    private static void printDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
    public static void minMaxNumber(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
