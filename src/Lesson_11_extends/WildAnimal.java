package Lesson_11_extends;

public class WildAnimal extends Animal{
    public String sound;

    @Override
    public String toString() {
        return "WildAnimal{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
