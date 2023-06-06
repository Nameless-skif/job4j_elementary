package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (symbol == input.charAt(i + 1)) {
                counter++;
            } else {
                result += counter > 1 ? symbol + "" +  counter : symbol;
                counter = 1;
                symbol = input.charAt(i + 1);
            }
            }
        result += counter > 1 ? symbol + "" +  counter : symbol;
        return result;
    }
}
