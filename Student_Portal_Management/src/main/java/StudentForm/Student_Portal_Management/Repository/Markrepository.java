package StudentForm.Student_Portal_Management.Repository;

import StudentForm.Student_Portal_Management.Entity.MarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;



    @EnableJpaRepositories
    @Repository
    public interface Markrepository extends JpaRepository<MarkEntity, Long>{
        List<MarkEntity> findByReg(String reg);
    }

