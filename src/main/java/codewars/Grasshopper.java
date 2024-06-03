package codewars;

import java.util.stream.IntStream;

public interface Grasshopper {
    public static char getGrade(int s1, int s2, int s3) {
        double avg = IntStream.of(s1,s2,s3).average().getAsDouble();
        return 90<=avg&&avg<=100? 'A':80<=avg&&avg<90?'B':70<=avg&&avg<80?'C':60<=avg&&avg<70?'D':0<=avg&&avg<60?'F':'o';
    }
}
