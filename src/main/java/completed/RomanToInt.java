package completed;

public interface RomanToInt {
    //Roman to Integer example:
    //Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: L = 50, V= 5, III = 3.
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
     static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case 'I':
                    res = res + 1;
                    break;
                case 'V':
                    if (i > 0 && chars[i - 1] == 'I') {
                        res = res + 4;
                        i--;
                    } else {
                        res = res + 5;
                    }
                    break;
                case 'X':
                    if (i > 0 && chars[i - 1] == 'I') {
                        res = res + 9;
                        i--;
                    } else {
                        res = res + 10;
                    }
                    break;
                case 'L':
                    if (i > 0 && chars[i - 1] == 'X') {
                        res = res + 40;
                        i--;
                    } else {
                        res = res + 50;
                    }
                    break;
                case 'C':
                    if (i > 0 && chars[i - 1] == 'X') {
                        res = res + 90;
                        i--;
                    } else {
                        res = res + 100;
                    }
                    break;
                case 'D':
                    if (i > 0 && chars[i - 1] == 'C') {
                        res = res + 400;
                        i--;
                    } else {
                        res = res + 500;
                    }
                    break;
                case 'M':
                    if (i > 0 && chars[i - 1] == 'C') {
                        res = res + 900;
                        i--;
                    } else {
                        res = res + 1000;
                    }
                    break;
            }
        }
        return res;
    }
}
