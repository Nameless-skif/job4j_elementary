package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += counter > 1 ? input.charAt(i - 1) + "" +  counter : input.charAt(i - 1);
                counter = 1;
                symbol = input.charAt(i);
                result += i == input.length() - 1 ? input.charAt(i) : "";
                result += (i == input.length() - 1) && (counter > 1) ? counter : "";
            } else {
                counter++;
                result += i == input.length() - 1 ? input.charAt(i) : "";
                result += (i == input.length() - 1) && (counter > 1) ? counter : "";
            }
            }

        return result;
    }
}
