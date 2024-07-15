public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("History")
                .build();


        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);


        try {
            String studentName = studentService.findById(savedStudent.id());
            System.out.println("Student found: " + studentName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
