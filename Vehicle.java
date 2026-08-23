class Vehicle {

    String brand;

    void start() {
        System.out.println("The vehicle is starting");
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";
        c.modelName = "Fortuner";

        System.out.println("Brand: " + c.brand);
        System.out.println("Model: " + c.modelName);

        c.start();
        c.accelerate();
    }
}

class Car extends Vehicle {

    String modelName;

    void accelerate() {
        System.out.println("The car is accelerating");
    }
}

