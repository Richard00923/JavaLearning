public class Animal implements theFirstInterface {
    String name;
    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public void scream() {
        System.out.println("aaaaaaaaaaaaa");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


