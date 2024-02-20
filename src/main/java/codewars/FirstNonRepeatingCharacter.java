package codewars;

//streSS
public interface FirstNonRepeatingCharacter {
    static String firstNonRepeatingLetter(String s) {
        char uni = ' ';
        boolean isUniq = true;
        while (isUniq) {
            for (int i = 0; i < s.length(); i++) {
                isUniq = true;
                for (int j = i + 1; j < s.length(); j++) {
                    if (Character.toString(s.charAt(i)).equalsIgnoreCase(Character.toString(s.charAt(j)))) {
                        isUniq = false;
                    }
                }
                if (isUniq) {
                    uni = s.charAt(i);
                    return Character.toString(uni);
                }
            }
        }
        return Character.toString(uni);
    }
}
