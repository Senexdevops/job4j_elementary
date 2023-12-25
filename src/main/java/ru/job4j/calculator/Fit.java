package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightMan) {
        return (heightMan - 100) * 1.15;
    }

    public static double womanWeight(short heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 154;
        double man = manWeight(heightMan);
        double woman = womanWeight(heightWoman);
        System.out.println("Man 187 is " + String.format("%.1f", man));
        System.out.println("Woman 154 is " + String.format("%.1f", woman));
    }
}


