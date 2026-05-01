package StudentForm.Student_Portal_Management.Service;

import StudentForm.Student_Portal_Management.Entity.StudentEntity;
import StudentForm.Student_Portal_Management.Repository.Studentrepository;
import StudentForm.Student_Portal_Management.StudentDTO.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service


public class StudentServiceImpl implements StudentService {
    @Autowired
    private Studentrepository studentrepository;
    @Override
    public String Registerlogin(StudentDto studentDto){
        StudentEntity studentEntity = new StudentEntity(studentDto.getName(),studentDto.getReg(),studentDto.getAge(),studentDto.getClg(),studentDto.getPassword());
        StudentEntity save = studentrepository.save(studentEntity);
        return String.valueOf(save.getId());

    }
    @Override
    public boolean Loginlogic(String reg, String Password){
        Optional<StudentEntity> checkdata = studentrepository.findByRegAndPassword(reg,Password);
        return checkdata.isPresent() && checkdata.get().getPassword().equals(Password);
    }
    @Override
    public List<StudentDto> Display(String reg) {
        List<StudentEntity> getdata = studentrepository.findByReg(reg);
        List<StudentDto> transfer = new ArrayList<>();
        for (StudentEntity getdatas : getdata) {
            StudentDto setdata = new StudentDto();
            setdata.setName(getdatas.getName());
            setdata.setReg(getdatas.getReg());
            setdata.setAge(getdatas.getAge());
            setdata.setClg(getdatas.getClg());
            setdata.setPassword(getdatas.getPassword());
            transfer.add(setdata);

        }
return transfer;
    }

    @Override
    public String updateRegister(StudentDto studentDto){
        List<StudentEntity> studentList = studentrepository.findByReg(studentDto.getReg());
        if(!studentList.isEmpty()){
            StudentEntity studentEntity = studentList.get(0);
            studentEntity.setName(studentDto.getName());
            studentEntity.setAge(studentDto.getAge());
            studentEntity.setClg(studentDto.getClg());
            studentEntity.setPassword(studentDto.getPassword());

            studentrepository.save(studentEntity);
            return "Student data updated successfully!";
        }
        return "Student with this registration number does not exist.";
    }
}
