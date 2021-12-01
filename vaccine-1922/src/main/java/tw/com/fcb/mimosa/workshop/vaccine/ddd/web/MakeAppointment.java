package tw.com.fcb.mimosa.workshop.vaccine.ddd.web;

import java.util.List;

import javax.validation.constraints.Size;

import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Data
public class MakeAppointment {
  String nhiNo;
  String phoneNo;
  
  @Size(max = 2)
  List<Vaccine> chooses;
}
