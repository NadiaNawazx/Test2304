package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(10, 20);
        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(20, 20, 20);
        System.out.println("sum = " + sum2);

        int sum3 = sumOf4Numbers(10, 10, 10, 10);
        System.out.println("sum = " + sum3);

    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}