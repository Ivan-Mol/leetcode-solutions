package codewars;

public interface TrafficLights {

    public static String updateLight(String current) {

        return current.equals("red")?"green": current.equals("green")?"yellow":current.equals("yellow")?"red":"";
    }

}