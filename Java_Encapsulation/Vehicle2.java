import java.util.ArrayList;

abstract class Vehicle2 {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle2(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle2 implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.2; // Cars have 20% surcharge
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }
}

class Bike extends Vehicle2 implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Bikes have standard fare
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }
}

class Auto extends Vehicle2 implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // Autos have 10% discount
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }
}



class RideHailingApp {
    public static void main(String[] args) {
        ArrayList<Vehicle2> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", "Ravi", 15, "Downtown"));
        vehicles.add(new Bike("B201", "Anita", 10, "Uptown"));
        vehicles.add(new Auto("A301", "Karan", 8, "Midtown"));

        double distance = 12; // km

        for (Vehicle2 v : vehicles) {
            v.getVehicleDetails();
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
        }
    }
}
