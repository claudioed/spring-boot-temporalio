package tech.claudioed.springboot.temporalio.workflow;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface MeasurementWorkflow {
  @WorkflowMethod
  void collect();

}
