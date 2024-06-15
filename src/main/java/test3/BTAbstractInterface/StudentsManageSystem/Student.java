package main.java.test3.BTAbstractInterface.StudentsManageSystem;

public class Student implements IStudent{
    private int id;
    private String fullName;
    private String dateOfBirth;
    private String studentNative;
    private String studentClass;
    private String phoneNo;
    private int mobile;
    private int nextId = 1;

    public Student() {
    }

    public Student(String fullName, String dateOfBirth, String studentNative, String studentClass, String phoneNo, int mobile) {
        this.id = nextId;
        nextId++;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.studentNative = studentNative;
        this.studentClass = studentClass;
        this.phoneNo = phoneNo;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentNative() {
        return studentNative;
    }

    public void setStudentNative(String studentNative) {
        this.studentNative = studentNative;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public void display() {
        System.out.println("------");
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Student Native: " + studentNative);
        System.out.println("Student Class: " + studentClass);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("-------");
    }
}
