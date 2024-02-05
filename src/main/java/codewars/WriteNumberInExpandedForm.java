package codewars;

//Kata.expandedForm(12); # Should return "10 + 2"
//Kata.expandedForm(42); # Should return "40 + 2"
//Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
public interface WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        StringBuilder res = new StringBuilder();
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i)!='0') {
                System.out.println(numString.charAt(i));
                res.append(numString.charAt(i));
                for (int j = i; j < numString.length() - 1; j++) {
                    res.append("0");
                }
                res.append(" + ");
            }
        }
        res.delete(res.length() - 3, res.length());
        return res.toString();
    }
}
