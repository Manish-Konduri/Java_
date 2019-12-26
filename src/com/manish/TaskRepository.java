package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public interface TaskRepository {
    void adding(int id,String name, String description, Date date);
    int delete(int query);
    ArrayList<Task> display();
    ArrayList<Task> search();
    boolean changeStatusCheck();
    void changeStatus(int s, int i);
    ArrayList<Task> listByStatus();
    ArrayList<Task> dueToday();

}
