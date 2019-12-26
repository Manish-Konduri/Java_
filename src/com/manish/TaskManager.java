package com.manish;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

class TaskManager{
    TaskRepository tr = new TaskManagerRepository();

    public void adding(int id, String name, String description, Date date) {
        tr.adding(id,name,description,date);
        }

        public ArrayList<Task> display() {
          return tr.display();
        }

        public int delete(int q) {
          return tr.delete(q);
        }

        public ArrayList<Task> search() {
          return tr.search();
        }
    public boolean changeStatusCheck(){
        return tr.changeStatusCheck();
    }

        public void changeStatus(int s, int i)
        {
        tr.changeStatus(s,i);
        }
        public ArrayList<Task> listByStatus(){
           return tr.listByStatus();
        }
        public ArrayList<Task> dueToday(){
            return tr.dueToday();
        }
    }
