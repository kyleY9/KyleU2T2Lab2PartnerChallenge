public class Letter {
    // instance variables
    private String from;

    public Letter(String from) {
        this.from = from;
    }

    public void writeLetter(String toName) {
        greeting(toName);
        specialMessage();
        closing();
    }

    public void greeting(String toName) {
        System.out.println("Hello, " + toName + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!\nFrom, " + from);
    }
}
