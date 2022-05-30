package Lesson_10_reference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User max = new User();
        int[] arr = new int[100];
        //System.out.println(Arrays.toString(arr));
    }

    //create a method that gets an empty array, and fills it with random numbers. The method does not return anything
    public static void randomMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    //create a method that gets an empty array and fills it with even numbers. The method does not return anything
    public static void pairMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomNum = (int) (Math.random() * 100);
            if (randomNum % 2 == 0 && randomNum != 0) {
                arr[i] = randomNum;
            }
            if (randomNum == 0) {
                arr[i] = randomNum + 2;
            }
            if (randomNum % 2 != 0) {
                arr[i] = randomNum + 1;
            }
        }
    }

    //create a method that gets an empty array and fills it with odd numbers. The method does not return anything
    public static void notEvenMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomNum = (int) (Math.random() * 10);
            if (randomNum % 2 != 0) {
                arr[i] = randomNum;
            }
            if (randomNum % 2 == 0) {
                arr[i] = randomNum + 1;
            }
        }
    }

    //create a method that takes a user object and changes it that you define. The method returns nothing
    public static void nameEditing(User args, String newName) {
        args.name = newName;
    }
}

