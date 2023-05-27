package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number % 2 != 0 && number > 1 && number % number == 0) {
            prime = true;
        }
        return prime;
    }
}
