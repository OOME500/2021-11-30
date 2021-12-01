package tw.com.fcb.mimosa.workshop.vaccine.ddd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {
  List<ResidentEntity> findByNhiNo(String nhiNo);

}
