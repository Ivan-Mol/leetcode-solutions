package codewars;

public interface JennysSecretMessage {
    static String greet(String name) {
        return name.equals("Johnny") ? "Hello my love!" : "Hello, " + name;
    }
}