public class Student extends Person {
    private int studentId;
    private String course;
    private double marks;

    // Constructor
    public Student(int studentId, String name, int age, String course, double marks) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Encapsulation: Getters & Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Polymorphism - Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("---------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("---------------");
    }

    // Polymorphism - Method Overloading
    public void displayInfo(boolean showMarksOnly) {
        if (showMarksOnly) {
            System.out.println("Student " + getName() + " Marks: " + marks);
        } else {
            displayInfo();
        }
    }
}
