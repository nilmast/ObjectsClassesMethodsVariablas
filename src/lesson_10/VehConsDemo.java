package lesson_10;

public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        gallons = sportscar.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини- фургону требуется " + gallons + " галлонов топлива");
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");

    }
}
