package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "John";
        int age = 34;
        String citizen = "NKorea";

        boolean isEligible = age >= 18 && citizen == "USA";
                    //         19 >= 18 && Uk = == USA
                    //         true && false ======> false
        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("___________________________");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 42;
        int income = 4000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for a loan: " + isEligible2);


        System.out.println("___________________________");

        String name3 = "Shay";
        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 21 && ('F' == 'M' || 'F' == 'F')
        //                      true     && ( false     ||  true)
        //                      true     &&         true
        //                      true

        System.out.println(name + " is eligible to register: " +isEligible3);

        System.out.println("___________________________");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == false;
        //                              false          ||    false
        System.out.println(name4 + " is eligible for US citizenship: " +isEligible4);


        System.out.println("___________________________");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >= 10000 || familyIncome <= 60000;
        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("___________________________");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
