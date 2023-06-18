package tech.claudioed.springboot.temporalio.activities;

import io.cloudevents.CloudEvent;
import io.temporal.spring.boot.ActivityImpl;
import java.util.ArrayList;
import org.springframework.stereotype.Component;
import tech.claudioed.springboot.temporalio.domain.MeasurementData;

@Component
@ActivityImpl(taskQueues = "MeasurementWorkflowQueue")
public class DefaultCollectMetricActivity implements CollectMetricActivity{
  @Override
  public MeasurementData collect() {
    return new MeasurementData("ZBC","XYZ","ZBC",new ArrayList<>());
  }

}
