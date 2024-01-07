package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Sergey";
        names[1] = "Aleksey";
        names[2] = "Valentin";
        names[3] = "Anatoly";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surname.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
