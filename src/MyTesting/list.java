package MyTesting;

import java.util.ArrayList;

public class list {

    public static void main(String[] args) {


        ArrayList<String> colours = new ArrayList<>();
        colours.add("green");
        colours.add("R");
        colours.add("B");
        colours.add("Y");
        colours.add(3, "C");

        System.out.println(colours);



    }
}
