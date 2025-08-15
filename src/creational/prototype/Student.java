package creational.prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private int batch;
    private double avgMarks;
    private String universityName;

    public Student() {
    }

    public Student(Student student) {
        this.name =student.name;
        this.age =student.age;
        this.batch =student.batch;
        this.avgMarks =student.avgMarks;
        this.universityName =student.universityName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public Student copy() {
         return new Student(this);
    }
}



