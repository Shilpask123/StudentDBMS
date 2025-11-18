public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Subject     : " + subject);
    }
}
