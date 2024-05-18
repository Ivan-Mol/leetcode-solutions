package codewars;

public interface FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        String abc = Character.isLowerCase(array[0]) ? "abcdefghijklmnopqrstuvwxyz" : "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ind = abc.indexOf(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != abc.charAt(ind)) {
                return abc.charAt(ind);
            } else {
                ind++;
            }
        }
        return '0';
    }
}
