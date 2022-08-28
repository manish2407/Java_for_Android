package Copy_Constructor;

public class ExamClass {
    private Student student;
    private Subject subject;
    private int marks;

    public ExamClass(Student student, Subject subject, int marks) {
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }

    public Student getStudent() {
        return new Student(student);
    }

    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public Subject getSubject() {
        return new Subject(subject);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Exam Paper Information:\n" +
                student +"\n"+ subject + "\n" +
                "marks:" + marks ;
    }
}
