package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passengersNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public void charge(){
        System.out.println("Battery is charging");
    }
}
