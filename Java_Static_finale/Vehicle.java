class Vehicle {
    static double registrationFee = 500.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("This is not a valid Vehicle object.");
        }
    }
}

class v {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car", "REG123");
        Vehicle v2 = new Vehicle("Alice Smith", "Bike", "REG456");

        v1.displayDetails();
        System.out.println("----------------");
        v2.displayDetails();

        System.out.println("----------------");
        Vehicle.updateRegistrationFee(600.0);

        v1.displayDetails();
    }
}
