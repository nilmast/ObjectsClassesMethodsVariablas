package lesson_10;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int passengers, int fuelcap, int mpg){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    int range(){
        return mpg * fuelcap;
    }
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
