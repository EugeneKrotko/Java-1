package ru.geekbains.lesson1;

public class Task8 {
    public static void main(String[] args) {
    System.out.println("Год 0 високосный : " + isYearLeap(0));
    System.out.println("Год 1 високосный : " + isYearLeap(1));
    System.out.println("Год 4 високосный : " + isYearLeap(4));
    System.out.println("Год 100 високосный : " + isYearLeap(100));
    System.out.println("Год 101 високосный : " + isYearLeap(101));
    System.out.println("Год 104 високосный : " + isYearLeap(104));
    System.out.println("Год 200 високосный : " + isYearLeap(200));
    System.out.println("Год 400 високосный : " + isYearLeap(400));
    System.out.println("Год 401 високосный : " + isYearLeap(401));
    System.out.println("Год 404 високосный : " + isYearLeap(404));
    System.out.println("Год 500 високосный : " + isYearLeap(500));
    System.out.println("Год 2000 високосный : " + isYearLeap(2000));
}

    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
