package tw.com.fcb.mimosa.workshop.vaccine.ddd.web;

import java.util.List;

import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Data
public class MakeAppointment {
  String nhiNo;
  String phoneNo;
  List<Vaccine> chooses;
}
