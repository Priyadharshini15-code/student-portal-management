package StudentForm.Student_Portal_Management.Service;

import StudentForm.Student_Portal_Management.Entity.MarkEntity;
import StudentForm.Student_Portal_Management.Repository.Markrepository;
import StudentForm.Student_Portal_Management.StudentDTO.MarkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Markserviceimpl implements Markservice{
    @Autowired
    private Markrepository markrepository;
    @Override
    public String Markadd(MarkDTO markDTO){
        MarkEntity markEntity = new MarkEntity(markDTO.getReg(),markDTO.getSubject(),markDTO.getMark(),markDTO.getGrade());
        MarkEntity save = markrepository.save(markEntity);
        return String.valueOf(save.getId());
    }
    @Override
    public List<MarkDTO> Markdisplaylogic(String reg){
        List<MarkEntity> getdata = markrepository.findByReg(reg);
        List<MarkDTO> transfer = new ArrayList<>();
        for(MarkEntity getdatas:getdata) {
            MarkDTO setdatas = new MarkDTO();
            setdatas.setReg(getdatas.getReg());
            setdatas.setSubject(getdatas.getSubject());
            setdatas.setMark(getdatas.getMark());
            setdatas.setGrade(getdatas.getGrade());
            transfer.add(setdatas);
        }
        return transfer;

        }

    }



