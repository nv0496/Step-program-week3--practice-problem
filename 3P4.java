class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double fuelLevel;

    public Vehicle(String make, String model, int year, double fuelLevel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
    }

    public void startVehicle() {
        System.out.println(year + " " + make + " " + model + " started.");
    }

    public void stopVehicle() {
        System.out.println(year + " " + make + " " + model + " stopped.");
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println(model + " refueled. Current fuel level: " + fuelLevel);
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model + ", Fuel: " + fuelLevel);
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, double fuelLevel) {
        super(make, model, year, fuelLevel);
    }

    @Override
    public void startVehicle() {
        System.out.println(year + " " + make + " " + model + " (Car) is ready to drive.");
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, double fuelLevel) {
        super(make, model, year, fuelLevel);
    }

    @Override
    public void startVehicle() {
        System.out.println(year + " " + make + " " + model + " (Truck) is hauling cargo.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, double fuelLevel) {
        super(make, model, year, fuelLevel);
    }

    @Override
    public void startVehicle() {
        System.out.println(year + " " + make + " " + model + " (Motorcycle) is roaring on the road.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2019, 50);
        Vehicle truck = new Truck("Ford", "F-150", 2020, 70);
        Vehicle bike = new Motorcycle("Yamaha", "R15", 2021, 20);

        car.startVehicle();
        truck.startVehicle();
        bike.startVehicle();

        Vehicle[] vehicles = {car, truck, bike};
        for (Vehicle v : vehicles) {
            v.displayVehicleInfo();
            v.refuel(10);
            v.stopVehicle();
            System.out.println();
        }
    }
}
