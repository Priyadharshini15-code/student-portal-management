package StudentForm.Student_Portal_Management.StudentDTO;

public class StudentDto {
    private String name;
    private String reg;
    private String age;
    private String clg;
    private String password;

    public StudentDto(String name, String reg, String age, String clg, String password) {
        this.name = name;
        this.reg = reg;
        this.age = age;
        this.clg = clg;
        this.password = password;
    }
    public StudentDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
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
}
