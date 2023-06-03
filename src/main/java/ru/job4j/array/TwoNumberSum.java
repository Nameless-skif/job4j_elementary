package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] == target) {
                break;
            } else {
                j--;
            }
            if (i == j - 1) {
                i++;
                j = array.length - 1;
            }
        }
        return array[i] + array[j] == target ? new int[] {i, j} : new int[0];
    }
}
