package StudentForm.Student_Portal_Management.Service;
import StudentForm.Student_Portal_Management.Entity.MarkEntity;
import StudentForm.Student_Portal_Management.StudentDTO.MarkDTO;

import java.util.List;

public interface Markservice {
    String Markadd(MarkDTO markDTO);
    List<MarkDTO> Markdisplaylogic(String reg);
}
