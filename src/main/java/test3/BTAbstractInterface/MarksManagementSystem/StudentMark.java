package main.java.test3.BTAbstractInterface.MarksManagementSystem;

public class StudentMark implements IStudentMark {
    private int id;
    private String fullName;
    private String studentClass;
    private String semester;
    private float averageMark;
    int nextId = 1;

    public StudentMark(String fullName, String studentClass, String semester) {
        this.id = nextId;
        nextId++;
        this.fullName = fullName;
        this.studentClass = studentClass;
        this.semester = semester;
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

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public float getAverageMark() {
        return averageMark;
    }

    float[] subjectMarks = new float[5];

    public void averageCalculateMark() {
        float sum = 0;
        for (float subjectMark : subjectMarks) {
            sum += subjectMark;
        }
        this.averageMark = sum / subjectMarks.length;
    }

    @Override
    public void display() {
        System.out.println("Student ID :" + id);
        System.out.println("Full Name :" + fullName);
        System.out.println("Student Class :" + studentClass);
        System.out.println("Semester :" + semester);
        System.out.println("Average Mark :" + averageMark);
    }

}
