package com.example;

public class FirstClass {
    static byte aByte = 123; // 8 bit
    static short aShort = 12544; // 16 bit

    // самые используемые
    static int aInt = 1_323_321; // 32 bit
    static long aLong = 123_000_233L; // 64 bit

    // с плавающей точкой
    static float aFloat = 3123.32f; // 32 bit
    static double aDouble = 3.5d; // 64 bit

    static char aChar = '&';
    static String aString = "New string test text";
    static boolean aBoolean = false;

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

//        System.out.println(5 + 10);

        // >
        // <
        // >=
        // <=
        // ==
        // !=
//        System.out.println(2 != 3);

        // =
        // +=
        // -=...
        int a = 10;
        int b = 10;
        a = a + b;
        a += b;

//        System.out.println(5 % 2);

        // && (&)
        // || (|)
        // !
        boolean result = (4 < 4) || false;


        // TODO: Проверка суммирования разных типов данных
        double summ = aLong + aDouble;
        System.out.println("Результат сложения: " + summ);

        // TODO: Проверка вычитания разных типов данных
        double minus = aFloat - aDouble;
        System.out.println("Результат вычитания: " + minus);

        // TODO: Проверка умножения разных типов данных
        byte multiply = (byte) (aByte * aShort);
        System.out.println("Результат умножения: " + multiply);

        // TODO: Проверка деления разных типов данных
        long division = (long) (aLong / aDouble);
        long division2 = (long) (aDouble / aLong);
        System.out.println("Результат деления №1: " + division);
        System.out.println("Результат деления №2: " + division2);

        // TODO: Проверка деления с остатком
        byte remainder = (byte) (aLong % aDouble);
        System.out.println("Результат деления с остатком: " + remainder);

        // TODO: Проверка инкремента в цикле
        for (int i = 0; i < 9; i++) {
            float increment = aByte++;
            System.out.println(increment);
        }

        // TODO: Проверка декремента в цикле
        for (int i = 0; i < 10; i++) {
            float decrement = (aLong)--;
            System.out.println(decrement);
        }

        // TODO: Сравнения и т.д.
        System.out.println("aLong > aByte: " + (aLong > aByte));
        System.out.println("aInt < aShort: " + (aInt < aShort));
        System.out.println("aInt >= aFloat: " + (aInt >= aFloat));
        System.out.println("aFloat <= aInt: " + (aFloat <= aInt));
        System.out.println("aFloat == aByte: " + (aFloat == aByte));
        System.out.println("aFloat != aByte: " + (aFloat != aByte));
        System.out.println("aFloat = aByte: " + (aFloat = aByte));
        System.out.println("aFloat += aByte: " + (aFloat += aByte));
        System.out.println("aFloat -= aByte: " + (aFloat -= aByte));

        boolean aTrue = true, aFalse = false;
        System.out.println("aTrue && aFalse: " + (aTrue && aFalse));
        System.out.println("aTrue || aFalse: " + (aTrue || aFalse));
        System.out.println("aTrue ! aFalse: " + !(aTrue && aFalse));
    }
}
