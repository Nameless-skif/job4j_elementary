package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while ((amount + amount * percent / 100) - salary > 0) {
            amount = amount + (amount * percent / 100) - salary;
            year++;
        }
        return year;
    }
}
