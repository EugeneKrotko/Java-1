package ru.geekbains.lesson1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Sum of 9 and 0 is in range [10..20]: " + SumInRange10to20(9, 0));
        System.out.println("Sum of 10 and -1 is in range [10..20]: " + SumInRange10to20(10, -1));
        System.out.println("Sum of 10 and 5 is in range [10..20]: " + SumInRange10to20(10, 5));
        System.out.println("Sum of 10 and 11 is in range [10..20]: " + SumInRange10to20(10, 11));
        System.out.println("Sum of 21 and -1 is in range [10..20]: " + SumInRange10to20(21, -1));
    }
    public static boolean SumInRange10to20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }
}
