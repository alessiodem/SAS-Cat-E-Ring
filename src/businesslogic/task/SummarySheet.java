package businesslogic.task;

import businesslogic.user.User;
import java.util.ArrayList;

public class SummarySheet{

    private ArrayList<Task> tasks;
    private Service serviceAssigned;

    //Operation methods
    public void addTask(KitchenDuty kitchenDuty){

    }
    public void removeTask(Task task){

    }
    public void addTask(Task task){

    }
    public void addTask(Task task, int position);
    public void assignTask(Task task, PreparatoryShift preparatoryShift, User cook);
    public void setTaskCompleted(Task task);
    public void setCookAssigned(User cook);
    public void editShiftAssigned(Task task, PreparatoryShift preparatoryShift);
    public void editTaskInfo(Task task, Time estimatedTime, Integer quantity);


}