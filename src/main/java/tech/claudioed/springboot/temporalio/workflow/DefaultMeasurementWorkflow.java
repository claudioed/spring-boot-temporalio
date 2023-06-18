package tech.claudioed.springboot.temporalio.workflow;

import io.temporal.activity.ActivityOptions;
import io.temporal.spring.boot.WorkflowImpl;
import io.temporal.workflow.Workflow;
import java.time.Duration;
import tech.claudioed.springboot.temporalio.activities.CollectMetricActivity;
import tech.claudioed.springboot.temporalio.activities.SendMetricActivity;
import tech.claudioed.springboot.temporalio.domain.MeasurementData;

@WorkflowImpl(taskQueues = "MeasurementWorkflowQueue")
public class DefaultMeasurementWorkflow implements MeasurementWorkflow{

  private final CollectMetricActivity collectMetricActivity =
      Workflow.newActivityStub(CollectMetricActivity.class,
          ActivityOptions.newBuilder()
              .setStartToCloseTimeout(Duration.ofSeconds(2))
              .build());

  private final SendMetricActivity sendMetricActivity =
      Workflow.newActivityStub(SendMetricActivity.class,
          ActivityOptions.newBuilder()
              .setStartToCloseTimeout(Duration.ofSeconds(2))
              .build());

  @Override
  public void collect() {
    MeasurementData metrics = this.collectMetricActivity.collect();
    this.sendMetricActivity.accept(metrics);
  }

}
