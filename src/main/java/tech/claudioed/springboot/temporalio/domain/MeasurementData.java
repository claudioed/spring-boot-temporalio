package tech.claudioed.springboot.temporalio.domain;

import java.util.List;

public class MeasurementData {
  private String equipmentCode;
  private String equipmentName;
  private String locationCode;
  private List<Metadata> measures;

  public MeasurementData() {
  }

  public MeasurementData(String equipmentCode, String equipmentName, String locationCode,
      List<Metadata> measures) {
    this.equipmentCode = equipmentCode;
    this.equipmentName = equipmentName;
    this.locationCode = locationCode;
    this.measures = measures;
  }

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

  public void setEquipmentCode(String equipmentCode) {
    this.equipmentCode = equipmentCode;
  }

  public void setEquipmentName(String equipmentName) {
    this.equipmentName = equipmentName;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public void setMeasures(List<Metadata> measures) {
    this.measures = measures;
  }
}
