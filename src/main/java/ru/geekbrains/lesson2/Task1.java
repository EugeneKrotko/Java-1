package ru.geekbrains.lesson2;

public class Task1 {
    public static void main(String[] args) {
        changeArray();
    }
    static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
