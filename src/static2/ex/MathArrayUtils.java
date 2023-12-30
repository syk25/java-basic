package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        int size = array.length;
        int sum = sum(array);
        return (double) sum / size;
    }

    public static int min(int[] array) {
        sort(array);
        return array[0];
    }

    public static int max(int[] array) {
        sort(array);
        return array[array.length - 1];
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
