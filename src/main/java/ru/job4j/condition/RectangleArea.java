package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println("With p = 6 and k = 2, the area is " + result);
    }
}



