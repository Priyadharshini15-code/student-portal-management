package StudentForm.Student_Portal_Management.Controller;

import StudentForm.Student_Portal_Management.StudentDTO.StudentDto;
import StudentForm.Student_Portal_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin("http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;// object -> studentService

    @PostMapping(path = "/reg")
    public String Register(@RequestBody StudentDto studentDto) {

        return studentService.Registerlogin(studentDto);
    }

    @PostMapping(path = "/log")
    public ResponseEntity<String> Login(@RequestBody StudentDto studentDto) {
        if (studentService.Loginlogic(studentDto.getReg(), studentDto.getPassword())) {
            return ResponseEntity.ok("Login successfully");
        }
        return ResponseEntity.ok("Your Data not present in the Database");
    }

    @GetMapping(path = "/pdisplay/{reg}")
    public List<StudentDto> ParticularDisplay(@PathVariable("reg") String reg) {
        return studentService.Display(reg);

    }

    @PutMapping(path = "/update")
    public ResponseEntity<String> updateStudent(@RequestBody StudentDto studentDto) {
        String response = studentService.updateRegister(studentDto);
        if (response.equals("Student data updated successfully!")) {
            return ResponseEntity.ok(response);

        } else {
            return ResponseEntity.ok(response);
        }

    }
}
