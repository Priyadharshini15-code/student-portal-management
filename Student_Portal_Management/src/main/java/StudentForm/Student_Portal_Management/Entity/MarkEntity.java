package StudentForm.Student_Portal_Management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student_mark")
public class MarkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Student_reg")
    private String reg;
    @Column(name="Student_Subject")
    private String subject;
    @Column(name="Student_mark")
    private String mark;
    @Column(name="Student_grade")
    private String grade;

    public MarkEntity(String reg, String subject, String mark, String grade) {
        this.reg = reg;
        this.subject = subject;
        this.mark = mark;
        this.grade = grade;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

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
    public MarkEntity(){

    }


}
