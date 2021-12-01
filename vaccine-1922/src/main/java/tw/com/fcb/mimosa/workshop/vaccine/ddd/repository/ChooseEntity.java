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

@Table(name = "CHOOSE")
@Entity
@Data
public class ChooseEntity {

  @Id
  @GeneratedValue
  Long id;
  LocalDateTime chooseTime;
  @Enumerated(EnumType.STRING)
  Vaccine vaccine;

}
