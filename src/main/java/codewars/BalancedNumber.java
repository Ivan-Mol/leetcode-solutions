package codewars;

public class BalancedNumber {
    public static String balancedNum(long number)
    {
        String s = Long.toString(number);
        String frstS = s.length()%2>0? s.substring(0,s.length()/2):s.substring(0,s.length()/2-1);
        String secS = s.substring(s.length()/2+1);
        int first = frstS.chars().map(Character::getNumericValue).sum();
        int second = secS.chars().map(Character::getNumericValue).sum();
        return first==second?"Balanced":"Not Balanced";
    }
}
