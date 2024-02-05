package alghoritms;

public interface BinToDecimal {
    static int binToDecimal(String inp) {
        int prevResult = 0;
        for (int i = 0; i < inp.length(); i++) {
            int charFromString = Character.getNumericValue(inp.charAt(i));
            int num = (prevResult*2+charFromString);
            prevResult = num;
        }
        return prevResult;
        //return req(inp,inp.length()-1,1,0);
    }

    static int req(String inp, int pos, int pov, int acc) {
        if (pos >= 0) {
            int cur = inp.charAt(pos) == '1' ? pov : 0;
            return req(inp, pos - 1, pov * 2, acc + cur);
        } else {
            return acc;
        }
    }
}
