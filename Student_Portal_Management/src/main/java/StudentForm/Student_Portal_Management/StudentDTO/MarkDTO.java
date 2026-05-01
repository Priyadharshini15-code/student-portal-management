package StudentForm.Student_Portal_Management.StudentDTO;

public class MarkDTO {

    private String reg;      // Registration number
    private String subject;  // Subject name
    private String mark;        // Marks obtained
    private String grade;    // Grade based on marks

    // Default constructor
    public MarkDTO() {}

    // Constructor with parameters to initialize all fields
    public MarkDTO(String reg, String subject, String mark, String grade) {
        this.reg = reg;
        this.subject = subject;
        this.mark = mark;
        this.grade = grade;
    }

    // Getters and Setters
    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
