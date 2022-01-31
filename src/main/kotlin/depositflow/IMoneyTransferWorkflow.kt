package depositflow

import io.temporal.workflow.WorkflowInterface
import io.temporal.workflow.WorkflowMethod

@WorkflowInterface
interface IMoneyTransferWorkflow {
    // The Workflow method is called by the initiator either via code or CLI.
    @WorkflowMethod
    fun transfer(fromAccountId: String, toAccountId: String, referenceId: String, amount: Double)
}