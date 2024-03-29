package squad25.comercioFacil.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import squad25.comercioFacil.enums.AccesLevel;
import squad25.comercioFacil.models.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
	 @Query
	 (value = "SELECT * FROM user WHERE acces_level='EMPLOYER'",nativeQuery = true)
     public List<Employer> findByAccesLevel(AccesLevel accesLevel); 
}