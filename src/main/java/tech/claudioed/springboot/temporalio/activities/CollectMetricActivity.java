package tech.claudioed.springboot.temporalio.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;
import tech.claudioed.springboot.temporalio.domain.MeasurementData;

@ActivityInterface
public interface CollectMetricActivity {
  @ActivityMethod(name = "CollectMetrics")
  MeasurementData collect();

}
