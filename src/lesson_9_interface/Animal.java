package lesson_9_interface;

public class Animal implements theFirstInterface {
    String name;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public void scream() {
        System.out.println("aaaaaaaaaaaaa");
    }
}



