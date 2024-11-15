package businesslogic.task;

import businesslogic.user.User;
import java.util.ArrayList;
//TUTTO TBT
public interface TaskEventReceiver{

    public void updateSummarySheetCreated(SummarySheet summarySheet);
    public void updateTaskAdded(Task task);
    public void updateTaskRemoved(Task task);
    public void updateTaskSorted(SummarySheet summarySheet);
    public void updateTaskAssigned(Task task);
    public void updateTaskCompleted(Task task);
    public void updateCookChanged(Task task);
    public void updateCookRemoved(Task task);
    public void updateTaskDetailed(Task task);
    public void updateShiftChanged(Task task);
    public void updateTaskInfoAdded(Task task);

}