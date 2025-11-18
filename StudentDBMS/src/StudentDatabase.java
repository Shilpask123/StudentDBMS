import java.util.ArrayList;
import java.util.List;

public class StudentDatabase implements DatabaseOperations {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void updateStudent(int studentId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.set(i, updatedStudent);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found!");
    }

    @Override
    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
        System.out.println("Student deleted successfully!");
    }

    @Override
    public List<Student> viewStudents() {
        return students;
    }
}
