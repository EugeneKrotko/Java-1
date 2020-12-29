package ru.geekbrains.lesson2;

public class Task5 {
    public static void main(String[] args) {
        minOrMaxMemberOfArray();
    }
    static void minOrMaxMemberOfArray() {
        int[] arr = {34, 9034, 2345, 239, -11, 89, 28, 2, 654, 810, -9999, 351, 190};
        int min = arr[0];
        int max = arr[0];
        System.out.print("in array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nminimal member is: " + min + "\nmaximal member is: " + max);
    }

}
