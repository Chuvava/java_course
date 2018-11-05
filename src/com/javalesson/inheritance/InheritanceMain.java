package com.javalesson.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {
       /* Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

        Truck truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 10000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("\n");

        ElectricCar car = new ElectricCar("Tesla", "Model S", 4, 100500);
        car.start();
        car.stop();
        car.charge();

        System.out.println("\n");*/


        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Bus bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        bus.fuelUp();
        bus.pickUpPassengers(5);
        bus.start();
        bus.releasePassengers();
        EngineType engineType = bus.getEngine().getEngineType();
        int power = bus.getEngine().getPower();
        double volume = bus.getEngine().getVolume();
        System.out.println(engineType);
        System.out.println(power);
        System.out.println(volume);
        List<Piston> pistons = bus.getEngine().getPistons();
        System.out.println(pistons);
    }
}
