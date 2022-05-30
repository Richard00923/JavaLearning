package Lesson_10_reference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User max =new User();
        int[] arr = new int[100];
        //System.out.println(Arrays.toString(arr));
    }

    public static void randomMethod(int[] arr) {//-створити метод який отримує пустий масив , і зповнює його рандомними числами. Метод нічтого не повертає!
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void pairMethod(int[] arr) {//-створити метод який отримує пустий масив , і зповнює його парними числами. Метод нічтого не повертає!

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
    public static void notEvenMethod(int[] arr) {//-створити метод який отримує пустий масив , і зповнює його непарними числами. Метод нічтого не повертає!
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

    public static void nameEditing(User args,String newName) {//-стоврити метод, який приймає об'єкт користувача та змінює йому їм'я на те, яке ви визначите.Метод нічого не повертає!
    args.name=newName;
    }
}

