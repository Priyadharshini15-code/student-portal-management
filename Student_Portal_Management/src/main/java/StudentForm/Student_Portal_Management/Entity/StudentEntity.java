package StudentForm.Student_Portal_Management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Data")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "Student_name")
    private String name;
    @Column(name = "Student_reg")
    private String reg;
    @Column(name = "Student_age")
    private String age;
    @Column(name = "Student_clg")
    private String clg;
    @Column(name = "Student_password")
    private String password;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public StudentEntity(String name, String reg, String age, String clg, String password) {
        this.name = name;
        this.reg = reg;
        this.age = age;
        this.clg = clg;
        this.password = password;

    }
    public StudentEntity(){

    }
}

