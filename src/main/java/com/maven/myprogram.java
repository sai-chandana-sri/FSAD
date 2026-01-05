package com.maven;

class Vehicle {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}


class Car extends Vehicle {
    void carBrand() {
        System.out.println("This is a Car");
    }
}


class ElectricCar extends Car {
    void batteryInfo() {
        System.out.println("This is an Electric Car with Battery Power");
    }
}

public class myprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec = new ElectricCar();

        
        ec.vehicleType();   
        ec.carBrand();      
        ec.batteryInfo();   

	}

}
