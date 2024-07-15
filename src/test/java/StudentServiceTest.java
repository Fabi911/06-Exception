import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @Test
    void findById() {
        try {
            studentService.findById("1");
        }catch (Exception e){
            System.out.println( e.getMessage());
        }
    }
}