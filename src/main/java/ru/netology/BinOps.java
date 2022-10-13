package ru.netology;

public class BinOps {

    public String sum(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString((x + y));
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString((x * y));
    }

    public void sumAndMult(String a, String b) {
        System.out.println(
        "Sum = " + this.sum(a, b) + ", Multiply = " + this.mult(a, b)
        );
    }
}
