package org.webler.zsolt;

public class Calculator {


    public static <T extends Number> double addition(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double substraction(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static <T extends Number> double multiplication(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double divison(T x, T y) {
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number> double exponentation(T x, T y) {
        return Math.pow(x.doubleValue(), y.doubleValue());
    }

    public static <T extends Number> double squareRoot(T x) {
        return Math.sqrt(x.doubleValue());
    }

    public static <T extends Number> double logarithm(T x) {
        return Math.log(x.doubleValue());
    }


}
