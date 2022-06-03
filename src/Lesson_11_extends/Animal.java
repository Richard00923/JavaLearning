package Lesson_11_extends ;

public class Animal implements ArraySaver {
    public boolean isOwner;

    @Override
    public void saveArr(Animal[] arr, Animal args) {
        int i=-1;
        i++;
        arr[i]=args;
    }
    @Override
    public  Animal findOne(Animal[] arr, Animal args) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(args)) {
                return arr[i];
            }
        }
        return null;
    }

    @Override
    public Animal[] findAll(Animal[] nameArr) {
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println(nameArr[i]);
        }
        return nameArr;
    }
}
