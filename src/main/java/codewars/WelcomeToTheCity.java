package codewars;

public interface WelcomeToTheCity {
    static String sayHello(String[] name, String city, String state) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ");
        for (int i = 0; i < name.length; i++) {
            stringBuilder.append(name[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("! Welcome to ");
        stringBuilder.append(city);
        stringBuilder.append(", ");
        stringBuilder.append(state);
        stringBuilder.append("!");
        return stringBuilder.toString();
    }

    //Hello, John Smith! Welcome to Phoenix, Arizona!
    //['John', 'Smith'], 'Phoenix', 'Arizona'
}
