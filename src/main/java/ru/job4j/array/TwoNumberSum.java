package ru.job4j.array;

public class TwoNumberSum {
    @SuppressWarnings("checkstyle:RightCurly")
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] res = new int[2];
        while (i < array.length) {
            if (array[i] + array[j] == target && j < array.length) {
                res[0] = i;
                res[1] = j;
                break;
            }
            if (j < array.length - 1) {
                j++;
            } else {
                i++;
                j = i + 1;
                if (j == array.length) {
                    break;
                }
            }
        }
        return res[1] > 0 ? res : new int[0];
    }
}
