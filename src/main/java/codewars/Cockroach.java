package codewars;
//The cockroach is one of the fastest insects.
// Write a function which takes its speed in km per hour and returns it in cm per second,
// rounded down to the integer (= floored). 1.08 --> 30
public interface Cockroach {
    static int cockroachSpeed(double x){

        return (int)Math.floor((x / 0.036));
    }
}
