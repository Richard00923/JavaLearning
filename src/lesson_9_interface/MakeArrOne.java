package lesson_9_interface;

import lesson_9_interface.InterfaceNew;

public class MakeArrOne implements InterfaceNew {
    int length;

    @Override
    public int[] Get() {
        System.out.println("Hello");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
        return arr;
    }
}
