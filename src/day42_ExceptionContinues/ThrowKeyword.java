package day42_ExceptionContinues;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();


        if (age < 0) {
            throw new InputMismatchException("Age cannot be negative");
        }

        if (age > 21) {
            throw new RuntimeException("Age must be minimum 21 years old");
        } else {

        }
    }
}
