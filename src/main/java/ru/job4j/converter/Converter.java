package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        float inputDollar = 600;
        float expectedDollar = 10;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("600 rubles are 10 dollars. Test result : " + passedDollar);
    }
}

