package lesson_3;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    public void range(){
        System.out.println("Дaльнocть поездки транспортного средства " + fuelcap * mpg + " миль.");
    }
}
