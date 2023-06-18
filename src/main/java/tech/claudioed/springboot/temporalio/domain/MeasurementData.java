package tech.claudioed.ports;

import java.util.List;
import java.util.Set;
import org.apache.kafka.common.protocol.types.Field.Str;
import tech.claudioed.domain.equipment.Equipment;
import tech.claudioed.domain.equipment.Location;
import tech.claudioed.domain.equipment.Measurement;
import tech.claudioed.domain.equipment.Metadata;

public class MeasurementData {
  private String equipmentCode;
  private String equipmentName;
  private String locationCode;
  private List<Metadata> measures;
  public String getEquipmentCode() {
    return equipmentCode;
  }
  public String getEquipmentName() {
    return equipmentName;
  }
  public String getLocationCode() {
    return locationCode;
  }
  public List<Metadata> getMeasures() {
    return measures;
  }
  public Measurement newMeasurement(){
    var measure =new Measurement();
    measure.addEquipment(new Equipment(this.equipmentCode,this.equipmentName,new Location(this.locationCode)));
    measure.addMetadata(Set.copyOf(this.measures));
    return measure;
  }

}
