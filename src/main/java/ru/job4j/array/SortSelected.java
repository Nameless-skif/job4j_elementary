package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int start = 0;
        for (int i = start; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexInRange(data, min, start, data.length - 1);
            data = SwitchArray.swap(data, start, index);
            start++;
        }
        return data;
    }
}
