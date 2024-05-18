package leetcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Assume that file.txt has the following content:
//
//987-123-4567 /12 sym
//123 456 7890 / 12 sym
//(123) 456-7890 / 14 sym
//Your script should output the following valid phone numbers:
//
//987-123-4567
//(123) 456-7890
public class ValidPhoneNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:/file.txt")));
        while (bufferedReader.ready()) {
            String number = bufferedReader.readLine();
            if (number.length() == 12 && number.charAt(3) == '-' && number.charAt(7) == '-') {
                System.out.println(number);
            }
            if (number.length() == 14 && number.charAt(0) == '(' && number.charAt(4) == ')') {
                System.out.println(number);
            }
        }
    }
}
