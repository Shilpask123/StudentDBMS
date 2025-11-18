import java.util.List;

public interface DatabaseOperations {
    void addStudent(Student student);
    void updateStudent(int studentId, Student updatedStudent);
    void deleteStudent(int studentId);
    List<Student> viewStudents();
}
