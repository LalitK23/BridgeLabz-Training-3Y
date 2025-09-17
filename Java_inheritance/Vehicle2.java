class Vehicle2 {
    String model;
    int maxSpeed;

    Vehicle2(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle2 {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle2 implements Refuelable {
    int fuelCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Fuel Capacity: " + fuelCapacity + " liters");
    }
}

class vehc {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 200, 50);

        ev.displayInfo();
        ev.charge();
        System.out.println();
        pv.displayInfo();
        pv.refuel();
    }
}
