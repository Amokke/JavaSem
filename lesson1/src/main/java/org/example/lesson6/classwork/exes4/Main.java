package org.example.lesson6.classwork.exes4;

public class Main {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp Cel= " + new Cels().convertValue(temp));
        System.out.println("temp Kel= " + new Kelvin().convertValue(temp));
        System.out.println("temp Far= " + new Faren().convertValue(temp));
    }
}
