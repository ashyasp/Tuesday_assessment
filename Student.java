public class Student extends Customer{
    public static long getStudentID() {
        return studentID;
    }

    public static void setStudentID(long studentID) {
        Student.studentID = studentID;

    }

    public static long studentID=0;


    private double DISCOUNT=.5d;
    public Student(String size) {
        super(size);
    }
    public void printUniqueStudentID(){
        studentID++;
        System.out.println(studentID);
    }
}
