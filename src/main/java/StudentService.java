import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }
    public String findById(String id) throws Exception {
        for (Student student : repo.getAllStudents()) {
            if (student.id().equals(id)) {
                return student.name();
            }
        }
        throw new Exception("Student not found");
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }
}
