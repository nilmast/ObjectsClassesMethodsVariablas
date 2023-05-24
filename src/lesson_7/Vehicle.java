package lesson_7;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}
