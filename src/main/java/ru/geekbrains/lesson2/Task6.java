package ru.geekbrains.lesson2;

public class Task6 {
    public static void main(String[] args) {
        // true
        System.out.println(checkBalance(new int[] { 5, 1, 3, 7, 2 }));
        // false
        System.out.println(checkBalance(new int[] { 3, 4, 11, 2, 6 }));
        //true
        System.out.println(checkBalance(new int[] { 20, 20 }));
    }
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
