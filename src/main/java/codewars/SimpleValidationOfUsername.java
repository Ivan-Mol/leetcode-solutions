package codewars;

//Write a simple regex to validate a username. Allowed characters are:
//
//lowercase letters,
//numbers,
//underscore
//Length should be between 4 and 16 characters (both included).public interface SimpleValidationOfUsername {
public interface SimpleValidationOfUsername {
    static boolean validateUsr(String s) {
        boolean isValid = true;
        if (s.length() < 4 || s.length() > 16) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i)) || s.charAt(i) == '_') {
            } else {
                return false;
            }
        }
        return isValid;
    }
}

