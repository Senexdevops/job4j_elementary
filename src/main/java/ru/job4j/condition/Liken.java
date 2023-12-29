package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println("First is greater than Second: " + result);

        result = first < second;
        System.out.println("First is less than Second: " + result);

        result = first == second;
        System.out.println("First is equal to Second: " + result);
    }
}

