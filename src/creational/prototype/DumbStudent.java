package creational.prototype;

public class DumbStudent extends Student {
    private int iq;

    public DumbStudent() {
    }

    public DumbStudent(DumbStudent student) {
        super(student);
        this.iq = student.iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Student copy() {
        return new DumbStudent(this);
    }
}
