package Lesson_11_extends;

public class Cat extends Pet {
    public  String name;
    public void makeSound() {
        System.out.println(name+ " Say  myau,myau,myau");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
