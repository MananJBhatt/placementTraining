package placement.training.day4;

//Child class or subclass
public class Student extends Citizen {

    private int rollNo;
    private String collegeName;

    public Student(String name, long aadharNo, String city, long phone,int rollNo, String collegeName) {
        super(name, aadharNo, city, phone);
        this.rollNo=rollNo;
        this.collegeName=collegeName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public Student() {
        super();
    }
}
