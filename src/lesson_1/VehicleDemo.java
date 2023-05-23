package lesson_1;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Mини-фypгoн может перевезти " +
                minivan.passengers +" пассажиров на расстояние "+ range + " миль");
    }
}
// TODO: 23.05.2023
