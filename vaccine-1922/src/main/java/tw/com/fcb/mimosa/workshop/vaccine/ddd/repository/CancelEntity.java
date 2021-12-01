package tw.com.fcb.mimosa.workshop.vaccine.ddd.repository;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Table(name = "CANCEL")
@Entity
@Data
public class CancelEntity {

  @Id
  @GeneratedValue
  Long id;
  LocalDateTime cancelTime;
  @Enumerated(EnumType.STRING)
  Vaccine vaccine;

}
