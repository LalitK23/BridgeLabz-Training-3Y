class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        super.displayInfo();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%, Final Price: " + finalPrice);
    }
}

class cou {
    public static void main(String[] args) {
        Course c1 = new Course("Basic Programming", 6);
        OnlineCourse c2 = new OnlineCourse("Java Fundamentals", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 5000, 20);

        c1.displayInfo();
        System.out.println();
        c2.displayInfo();
        System.out.println();
        c3.displayInfo();
    }
}
