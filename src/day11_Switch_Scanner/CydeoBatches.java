package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        String time = "eu";
        switch (time) {
            case "morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "eu":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("INVALID BATCH");
        }

        System.out.println("_________________________");

        if (time == "morning") {
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        } else if (time == "evening") {
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
        } else if (time == "eu") {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        } else {
            System.out.println("INVALID BATCH");
        }
    }
}
/*
4.  Create a class named Cydeo batches.
    In Cydeo we have three batch types: US morning, US evening, EU.
    Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */