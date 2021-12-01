package tw.com.fcb.mimosa.workshop.vaccine.ddd.web;

import java.util.List;
import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Data
public class CancelVaccine {

  List<Vaccine> vaccines;

}
