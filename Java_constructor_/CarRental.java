class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
        dailyRate = 1000.0;
    }

    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Alice", "Honda City", 5, 1200.0);
        CarRental r3 = new CarRental(r2);

        r1.displayRental();
        r2.displayRental();
        r3.displayRental();
    }
}
