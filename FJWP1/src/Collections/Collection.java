package Collections;

interface Vehicle {
    void start();
    void stop();
}

interface LandVehicle extends Vehicle {
    void drive();
}

interface SeaVehicle extends Vehicle {
    void floatOnWater();
}

class Car implements LandVehicle {
   
    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }

    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Bicycle implements LandVehicle {
   
    public void start() {
        System.out.println("Bicycle is starting.");
    }
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }

    public void drive() {
        System.out.println("Bicycle is being pedaled.");
    }
}

class Ship implements SeaVehicle {
   
    public void start() {
        System.out.println("Ship is starting.");
    }

    public void stop() {
        System.out.println("Ship is stopping.");
    }

    public void floatOnWater() {
        System.out.println("Ship is floating on water.");
    }
}

class Submarine implements SeaVehicle {
  
    public void start() {
        System.out.println("Submarine is starting.");
    }

    public void stop() {
        System.out.println("Submarine is stopping.");
    }

    public void floatOnWater() {
        System.out.println("Submarine is floating on water.");
    }
}

public class Collection {
    public static void main(String[] args) {
       
        LandVehicle car = new Car();
        LandVehicle bicycle = new Bicycle();
        SeaVehicle ship = new Ship();
        SeaVehicle submarine = new Submarine();

        car.start();
        car.drive();
        car.stop();
        System.out.println();

        bicycle.start();
        bicycle.drive();
        bicycle.stop();
        System.out.println();

        ship.start();
        ship.floatOnWater();
        ship.stop();
        System.out.println();

        submarine.start();
        submarine.floatOnWater();
        submarine.stop();
        System.out.println();
    }
}