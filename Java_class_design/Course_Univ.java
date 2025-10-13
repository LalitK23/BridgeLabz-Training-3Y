class Course_Univ {
    private String courseCode;
    private String courseName;
    private int credits;
    private Professor professor;
    private ArrayList<Student> students;

    public Course_Univ(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseCode + " - " + courseName + " (" + credits + " credits)");
        if (professor != null) {
            System.out.println("   Professor: " + professor.getName());
        }
        System.out.println("   Enrolled Students:");
        for (Student s : students) {
            System.out.println("      -> " + s.getName());
        }
    }
}
