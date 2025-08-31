public class Car {
    String brand;
    String model;
    int year;
    String color;
    boolean isRunning;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }

    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " engine started.");
        } else {
            System.out.println(brand + " " + model + " engine is already running.");
        }
    }

    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " engine stopped.");
        } else {
            System.out.println(brand + " " + model + " engine is already off.");
        }
    }

    public void displayInfo() {
        System.out.println("Car Info: " + year + " " + brand + " " + model + ", Color: " + color);
        System.out.println("Engine running? " + isRunning);
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2015, "Red");
        Car car2 = new Car("Honda", "Civic", 2018, "Blue");
        Car car3 = new Car("Ford", "Mustang", 2020, "Black");

        car1.startEngine();
        car1.displayInfo();
        System.out.println("Car age: " + car1.getAge(2025) + " years\n");

        car2.displayInfo();
        car2.startEngine();
        car2.stopEngine();
        System.out.println("Car age: " + car2.getAge(2025) + " years\n");

        car3.startEngine();
        car3.displayInfo();
        System.out.println("Car age: " + car3.getAge(2025) + " years\n");
    }
}
