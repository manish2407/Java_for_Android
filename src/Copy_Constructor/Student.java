package Copy_Constructor;

import java.util.Objects;

public class Student {
    private String studentName;
    private long studentnumber;

    public Student(String studentName, long studentnumber) {
        this.studentName = studentName;
        this.studentnumber = studentnumber;
    }

    public Student(Student student) {
        this.studentName = student.studentName;
        this.studentnumber = student.studentnumber;
    }

    public boolean equals(Student object) {
        return (this.studentName.equals(object.studentName) && (this.studentnumber == (object.studentnumber)));

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(long studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String toString() {
        return "Student Information---" + "\n"+"Student: " + studentName + "\n"+
                "studentnumber:" + studentnumber;
    }
}
