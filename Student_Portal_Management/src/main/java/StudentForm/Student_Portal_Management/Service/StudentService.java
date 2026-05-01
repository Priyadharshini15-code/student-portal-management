package StudentForm.Student_Portal_Management.Service;

import StudentForm.Student_Portal_Management.StudentDTO.StudentDto;

import java.util.List;

public interface StudentService {
    String Registerlogin(StudentDto studentDto);
    public boolean Loginlogic(String reg, String Password);

    List<StudentDto> Display(String reg);

    String updateRegister(StudentDto studentDto);
}
