package tw.com.fcb.mimosa.workshop.vaccine.crud.web;

import java.util.List;
import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Data
public class ResidentDto {

  String nhiNo;
  String phoneNo;
  List<Vaccine> chooses;
}
