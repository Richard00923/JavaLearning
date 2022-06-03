package lesson_9_interface;

import lesson_9_interface.theFirstInterface;

public class Amphibian implements theFirstInterface {
    int year;
    private String message;

    @Override
    public void scream() {
        System.out.println("yyyyyyyyyyyyyyy");
    }
    public void setMessage(String messageFromAmphibian) {
        message = messageFromAmphibian;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "year=" + year +
                ", message='" + message + '\'' +
                '}';
    }
}
