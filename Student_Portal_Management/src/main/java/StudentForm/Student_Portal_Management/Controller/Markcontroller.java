package StudentForm.Student_Portal_Management.Controller;

import StudentForm.Student_Portal_Management.Service.Markservice;
import StudentForm.Student_Portal_Management.StudentDTO.MarkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Studentmark")
@CrossOrigin("http://localhost:3000")

public class Markcontroller {
    @Autowired
    private Markservice markservice;
    @PostMapping("/Addmark")
    public String Addmark(@RequestBody MarkDTO markDTO){
        return markservice.Markadd(markDTO);

    }
    @GetMapping(path = "/markdisplay/{reg}")
    public List<MarkDTO> Markdisplay(@PathVariable(name="reg") String reg){
        return markservice.Markdisplaylogic(reg);
    }

}
