class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("This is not a valid Patient object.");
        }
    }
}

class pa {
    public static void main(String[] args) {
        Patient p1 = new Patient("John Doe", 45, "Flu", "P001");
        Patient p2 = new Patient("Alice Smith", 30, "Fracture", "P002");

        p1.displayDetails();
        System.out.println("----------------");
        p2.displayDetails();

        System.out.println("----------------");
        Patient.getTotalPatients();
    }
}
