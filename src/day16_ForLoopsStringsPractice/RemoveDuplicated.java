package day16_ForLoopsStringsPractice;

public class RemoveDuplicated {
    public static void main(String[] args) {

        String str = "aabbccddee";

        String result = ""; //

        for (int i = 0; i <= str.length()-1; i++) { // i : represents the index number of str (starting from 0)
            String ch = ""+str.charAt(i); // represents each of the str character

            if ( !result.contains(ch) ) { //if the character is not contained in the result.
                result += ch; // the character will be added to the result.
            }
        }
        System.out.println(result);
    }
}

/*
	2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

Hint: You can add each character of the string into another String
Condition: the character is not contained in the other String yet before you are adding
 */