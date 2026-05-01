package StudentForm.Student_Portal_Management.Repository;

import StudentForm.Student_Portal_Management.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository

public interface Studentrepository extends JpaRepository<StudentEntity,Long> {
    Optional<StudentEntity> findByRegAndPassword(String reg,String password);
    List<StudentEntity> findByReg(String reg);
}

