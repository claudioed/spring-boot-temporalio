package tech.claudioed.springboot.temporalio.activities;

import io.temporal.spring.boot.ActivityImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tech.claudioed.springboot.temporalio.domain.MeasurementData;

@Component
@ActivityImpl(taskQueues = "MeasurementWorkflowQueue")
public class DefaultSendMetricActivity implements  SendMetricActivity{

  private final RestTemplate restTemplate;

  public DefaultSendMetricActivity(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public void accept(MeasurementData measure) {
    System.out.println("measure = " + measure);
  }

}
