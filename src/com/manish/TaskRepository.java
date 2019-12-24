package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;

public interface TaskRepository {
    void adding(int id,String name, String description, LocalDate date);
    int delete(int query);
    ArrayList<Task> display();
    ArrayList<Task> search();
    void changeStatus(int s, int i);
    ArrayList<Task> listByStatus(int query);

}
