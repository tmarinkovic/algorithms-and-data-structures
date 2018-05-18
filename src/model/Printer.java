package model;

public class Printer {

    public static void print(int[] array) {
        System.out.println("PRINTING");
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println();
    }

}
