package Copy_Constructor;

public class Driver {
    public static void main(String[] args) {
        Subject subject1 = new Subject("BSCE0903","Machine Learning");
        Student student1 = new Student("Jeremy",523789056);
        ExamClass exam = new ExamClass(student1,subject1,100);
        System.out.println(exam);
    }
}
