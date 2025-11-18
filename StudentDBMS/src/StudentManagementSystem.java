import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();

        while (true) {
            System.out.println("\n===== Student Database Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, age, course, marks);
                    db.addStudent(s);
                    break;

                case 2:
                    for (Student st : db.viewStudents()) {
                        st.displayInfo();
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Update: ");
                    int updId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    Student updated = new Student(updId, newName, newAge, newCourse, newMarks);
                    db.updateStudent(updId, updated);
                    break;

                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    int delId = sc.nextInt();
                    db.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
