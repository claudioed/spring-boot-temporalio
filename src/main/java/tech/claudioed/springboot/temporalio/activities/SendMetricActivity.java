package tech.claudioed.springboot.temporalio.activities;

import io.cloudevents.CloudEvent;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;
import tech.claudioed.springboot.temporalio.domain.MeasurementData;

@ActivityInterface
public interface SendMetricActivity {
  @ActivityMethod(name = "SendMetricData")
  void accept(MeasurementData measure);

}
