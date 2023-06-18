package tech.claudioed.springboot.temporalio.scheduler;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import java.util.UUID;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tech.claudioed.springboot.temporalio.workflow.MeasurementWorkflow;

@Component
public class WorkflowTrigger {

  private final WorkflowClient workflowClient;

  public WorkflowTrigger(WorkflowClient workflowClient) {
    this.workflowClient = workflowClient;
  }
  @Scheduled(fixedRate = 30000)
	public void collect() {
    MeasurementWorkflow workflow = this.workflowClient.newWorkflowStub(MeasurementWorkflow.class,
        WorkflowOptions.newBuilder()
            .setTaskQueue("MeasurementWorkflowQueue")
            .setWorkflowId(UUID.randomUUID().toString())
            .build());
    workflow.collect();
	}

}
