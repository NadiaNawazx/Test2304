package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String colour, int miles) {
        super("BMW", model, year, price, colour, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breakdown is common");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is great to race with");
    }

    public void start(){
        System.out.println(brand+" "+model+" needs to be jump started :( ");
    }


}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */
