package Lesson_11_extends;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat ball = new Cat();
        ball.name = "Murko";

        Cat bean = new Cat();
        bean.name = "Oleksa";

        AnotherClass emptyClass = new AnotherClass();
        //Create an ArraySaver interface / abstract class that describes contracts
        Animal[] save = new Animal[10];
        WildAnimal boar = new WildAnimal();
        boar.sound = "Hello world, I'm alive";
        boar.saveArr(save, boar);


        //-saving the object in the array save.

        //-search for an element in the array findOne.
        Animal x = boar.findOne(save, boar);
        if (x == null) {
            System.out.println("Not found");
            return;
        }

        //strangeMethodSaveArr(bean, save, emptyClass, 0);
        System.out.println(Arrays.toString(save));
    }

    public static void strangeMethodSaveArr(Object args, Object[] arr, AnotherClass objClass, int index) {
        Scanner yesOrNou = new Scanner(System.in);

        if (arr[index] == null) {
            arr[index] = args;
            return;
        } else {
            System.out.println("This index is busy, below this index is the element " + arr[index] + " you want to replace it ?");
        }
        String answer = yesOrNou.next();

        if (Objects.equals(answer, "yes")) {
            arr[index] = args;
        }
        if (Objects.equals(answer, "no")) {
            System.out.println("I'm upset");
        } else {
            System.out.println("the answer is incorrect");

        }
    }

    public static Object strangeMethodFindOne(Object args, Object[] arr, AnotherClass objClass) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(args)) {
                return arr[i];
            }
        }
        return null;
    }

    public Object strangeMethodFindAll(Object[] nameArr, AnotherClass objClass) {
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println(nameArr[i]);
        }
        return nameArr;
    }

}


