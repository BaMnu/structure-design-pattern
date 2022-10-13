package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 8));
        System.out.println(intsCalc.mult(10, 33));
        System.out.println(intsCalc.pow(2, 10));
    }
}