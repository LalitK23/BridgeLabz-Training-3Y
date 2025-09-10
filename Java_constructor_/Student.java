class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("-----------------------");
    }
}

class PostgraduateStudent extends Student {
    String researchTopic;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name); // protected
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("CGPA (via getter): " + getCGPA()); // private accessed via public method
        System.out.println("-----------------------");
    }
}

class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 9.2);
        s1.displayDetails();
        s1.setCGPA(9.5);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 8.7, "AI Research");
        pg1.displayPGDetails();
    }
}
