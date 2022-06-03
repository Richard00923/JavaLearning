package lesson_9_interface;

public class Quadrat implements Square {
    @Override
    public double square(double a, double b) {
        return a*b;
    }
}
