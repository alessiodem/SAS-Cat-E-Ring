package businesslogic.task;

import businesslogic.user.User;
import java.util.ArrayList;

public class Task{
    private User creator;
    private User cook;
    private boolean completed;
    private Time timeEstimed;
    private int quantity;
    private ArrayList<PreparatoryShift> shiftAssigned;
    private KitchenDuty duty;

    public Task createTask(KitchenDuty kitchenDuty){
        //TBI
    }
}