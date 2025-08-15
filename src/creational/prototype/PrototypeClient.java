package creational.prototype;

public class PrototypeClient {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student batch2018 = new Student();
        batch2018.setBatch(2018);
        batch2018.setAvgMarks(85.5);
        batch2018.setUniversityName("XYZ University");
        studentRegistry.registerStudent("2018", batch2018);

        Student batch2019 = new Student();
        batch2019.setBatch(2019);
        batch2019.setAvgMarks(90.0);
        batch2019.setUniversityName("XYZ University");
        studentRegistry.registerStudent("2019", batch2019);

        IntelligentStudent intelliJentStu = new IntelligentStudent();
        intelliJentStu.setBatch(2020);
        intelliJentStu.setAvgMarks(95.0);
        intelliJentStu.setUniversityName("ABC University");
        intelliJentStu.setIq(139);
        studentRegistry.registerStudent("intelligentStudents", intelliJentStu);

        DumbStudent dumbStu = new DumbStudent();
        dumbStu.setBatch(2021);
        dumbStu.setAvgMarks(60.0);
        dumbStu.setUniversityName("DEF University");
        dumbStu.setIq(70);
        studentRegistry.registerStudent("dumbStudents", dumbStu);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student Jhon = studentRegistry.getStudent("2018").copy();
        Jhon.setName("Jhon");
        Jhon.setAge(22);

        Student Alice = studentRegistry.getStudent("2019").copy();
        Alice.setName("Alice");
        Alice.setAge(21);

        Student lim = studentRegistry.getStudent("intelligentStudents").copy();
        lim.setName("Lim");
        lim.setAge(20);
        Student mauro = studentRegistry.getStudent("dumbStudents").copy();
        mauro.setName("mauro");
        mauro.setAge(19);

        System.out.println("Jhon: " + Jhon);
        System.out.println("Alice: " + Alice);
        System.out.println("lim: " + lim);
        System.out.println("Mauro: " + mauro);
    }
}
