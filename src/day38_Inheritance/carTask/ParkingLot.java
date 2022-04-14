package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {


        Toyota toyota = new Toyota("Corolla", 2022, 29.500, "Black", 200);
        Tesla tesla = new Tesla("Model S", 2021, 75.000, "Silver", 2000);
        BMW bmw = new BMW("M3", 2020, 55.900, "White", 0);

        toyota.start();
        bmw.start();
        tesla.start();











    }
}
