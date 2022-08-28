package Copy_Constructor;

public class Subject {
    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode,String subjectName){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }
    public Subject(Subject subject){
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    public boolean equals(Subject object) {
        if(this.subjectCode.equals(object.subjectCode)  && this.subjectName.equals(object.subjectName)){
            return true;
        }
        else {
            return false;
        }
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject Information----"+"\n"+"SubjectCode: " + subjectCode + "\n" +
                "subjectName: " + subjectName ;
    }
}
