package kodlamaio.hrms2.dataAccess.abstracts.cvDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.cv.Education;

public interface EducationDao extends JpaRepository<Education, Integer>{

}
