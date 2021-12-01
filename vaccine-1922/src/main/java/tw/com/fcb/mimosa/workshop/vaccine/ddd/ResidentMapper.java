package tw.com.fcb.mimosa.workshop.vaccine.ddd;

import java.time.LocalDateTime;
import org.mapstruct.Mapper;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.repository.CancelEntity;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.repository.ChooseEntity;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.repository.ResidentEntity;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.web.MakeAppointment;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Mapper
public interface ResidentMapper {

  ResidentEntity toEntity(MakeAppointment command);

  default ChooseEntity toChooseEntity(Vaccine vaccine) {
    var entity = new ChooseEntity();
    entity.setChooseTime(LocalDateTime.now());
    entity.setVaccine(vaccine);
    return entity;
  }

  default CancelEntity toCancelEntity(Vaccine vaccine) {
    var entity = new CancelEntity();
    entity.setCancelTime(LocalDateTime.now());
    entity.setVaccine(vaccine);
    return entity;
  }
}
