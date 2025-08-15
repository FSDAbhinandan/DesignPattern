package creational.builder;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private int graduationYear;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.graduationYear = builder.graduationYear;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public static  StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private int graduationYear;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public Student build() {
            if(this.age<18){
                throw new IllegalArgumentException("Age must be at least 18");
            }
            if(this.graduationYear < 2023) {
                throw new IllegalArgumentException("Graduation year must be 2023 or later");
            }
            return new Student(this);
        }
    }
}
