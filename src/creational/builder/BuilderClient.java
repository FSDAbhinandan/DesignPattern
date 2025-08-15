package creational.builder;

public class BuilderClient {

    public static void main(String[] args) {
        // Create a Student object using the builder pattern
        Student student = new Student.StudentBuilder()
                .setName("John Doe")
                .setAge(20)
                .setAddress("123 Main St")
                .setPhoneNumber("123-456-7890")
                .setGraduationYear(2024)
                .build();
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Name: " + student.getAddress());
        System.out.println("Student Name: " + student.getPhoneNumber());
    }
}
