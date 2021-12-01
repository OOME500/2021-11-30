package tw.com.fcb.mimosa.workshop.vaccine.crud;

import java.time.LocalDateTime;
import org.mapstruct.Mapper;
import tw.com.fcb.mimosa.workshop.vaccine.crud.repository.CrudCancelEntity;
import tw.com.fcb.mimosa.workshop.vaccine.crud.repository.CrudChooseEntity;
import tw.com.fcb.mimosa.workshop.vaccine.crud.repository.CrudResidentEntity;
import tw.com.fcb.mimosa.workshop.vaccine.crud.web.ResidentDto;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Mapper
public interface CrudResidentMapper {

  CrudResidentEntity toEntity(ResidentDto dto);

  default CrudChooseEntity toChooseEntity(Vaccine vaccine) {
    var entity = new CrudChooseEntity();
    entity.setChooseTime(LocalDateTime.now());
    entity.setVaccine(vaccine);
    return entity;
  }

  default CrudCancelEntity toCancelEntity(Vaccine vaccine) {
    var entity = new CrudCancelEntity();
    entity.setCancelTime(LocalDateTime.now());
    entity.setVaccine(vaccine);
    return entity;
  }
}
