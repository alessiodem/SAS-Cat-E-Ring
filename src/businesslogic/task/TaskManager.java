package businesslogic.task;

import businesslogic.user.User;
import java.util.ArrayList;

public class TaskManager{

    //attributes
    private SummarySheet currentSummarySheet;
    private ArrayList<TaskEventReceiver> eventReceivers;
    //event sender attributes

    //methods
    public SummarySheet createSummarySheet(Service service) throws UseCaseLogicException{
        User user = userMngr.getCurrentUser();
        if (!user.isChef() || service == null)
            throw new UseCaseLogicException();

        SummarySheet newSummarySheet= new Summarysheet(service, user);
        notifySummarySheetCreated(newSummarySheet);
    }

    public void assignSummarySheet(SummarySheet summarySheet){
        //TBI
    }

    public SummarySheet openSummarySheet(SummarySheet summarySheet) {
        // TBI
    }

    public void resetSummarySheet(SummarySheet summarySheet) {
        // TBI
    }

    public Task addTask(KitchenTask kt) {
        // TBI
    }

    public void deleteTask(Task task) {
        // TBI
    }

    public void sortTask(Task task, int position) {
        // TBI
    }

    public void assignTask(Task toAssign, Shift shift, User cook) {
        // TBI
    }

    public void assignTask(Task toAssign, Shift shift) {
        // TBI
    }

    public void setTaskCompleted(Task task) {
        // TBI
    }

    public void editCookAssigned(Task toChange, User toAssign) {
        // TBI
    }

    public void editShiftAssigned(Task toChange, Shift toAssign) {
        // TBI
    }

    public void removeCookAssigned(Task toChange) {
        // TBI
    }

    public void setTaskDetails(Task toDetail, int timeEstimate, int quantity) {
        // TBI
    }

    public void setTaskDetails(Task toDetail, int timeEstimate) {
        // TBI
    }

    public void setTaskDetails(Task toDetail, int quantity) {
        // TBI
    }

    public void editTaskTimeEstimate(Task toChange, int timeEstimate) {
        // TBI
    }

    public void editTaskQuantity(Task toChange, int quantity) {
        // TBI
    }

    public void setCurrentSummarySheet(SummarySheet currentSummarySheet) {
        // TBI
    }

    //event sender methods
    private void notifySummarySheetCreated(SummarySheet summarySheet) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateSummarySheetCreated(summarySheet);
        }
    }

    private void notifyTaskAdded(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskAdded(task);
        }
    }

    private void notifyTaskRemoved(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskRemoved(task);
        }
    }

    private void notifyTaskSorted(SummarySheet summarySheet) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskSorted(summarySheet);
        }
    }

    private void notifyTaskAssigned(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskAssigned(task);
        }
    }

    private void notifyTaskCompleted(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskCompleted(task);
        }
    }

    private void notifyCookChanged(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateCookChanged(task);
        }
    }

    private void notifyCookDeleted(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateCookDeleted(task);
        }
    }

    private void notifyShiftEdited(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateShiftEdited(task);
        }
    }

    private void notifyTaskSorted(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskSorted(task);
        }
    }

    private void notifyTaskInfoAdded(Task task) {
        for (TaskEventReceiver receiver : eventReceivers) {
            receiver.updateTaskInfoAdded(task);
        }
    }

}