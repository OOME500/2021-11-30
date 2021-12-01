package tw.com.fcb.mimosa.workshop.vaccine.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudResidentRepository
    extends JpaRepository<CrudResidentEntity, Long> {

}
