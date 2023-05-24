package lesson_4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    public int range(){
        return mpg * fuelcap;
    }
}
