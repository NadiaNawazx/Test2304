package day14_StringMethod;

import java.util.Scanner;

public class DigitalUpperLowerSpecialChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();

        char firstChar = word.charAt(0);
        String result = "";

        if (firstChar >= '0' && firstChar <= '9'){
            result = "First character is a digit!";
        }else if (firstChar >= 'a' && firstChar <= 'z'){
            result = "First character is lowercase!";
        }else if (firstChar >= 'A' && firstChar <= 'Z') {
            result = "First character is uppercase!";
        }else {
            result = "First character is a special character!";
        }
        System.out.println(result);
    }

}
