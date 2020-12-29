package ru.geekbrains.lesson2;

public class Task2 {
    public static void main(String[] args) {
        createArray();
    }
    static void createArray() {
        int[] arr = new int[8];

        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }
}
