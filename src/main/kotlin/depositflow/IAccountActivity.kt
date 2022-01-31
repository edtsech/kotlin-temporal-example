package depositflow

import io.temporal.activity.ActivityInterface
import io.temporal.activity.ActivityMethod

@ActivityInterface
interface IAccountActivity {
    @ActivityMethod
    fun deposit(accountId: String, referenceId: String, amount: Double)

    @ActivityMethod
    fun withdraw(accountId: String, referenceId: String, amount: Double)
}