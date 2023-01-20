package student;

public class StudentList {

    public static void main(String[] args) {
        // Student student1 = new Student("s1", "Randy");
        
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1", "abc");
        studentList[1] = new Student("s2", "def");
        studentList[2] = new Student("s3", "xyz");
        
        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getStudentName());
        }
    }

}
