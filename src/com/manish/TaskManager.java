package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;

class TaskManager{
    InMemoryTaskRepository imr = new InMemoryTaskRepository();
        void adding(int id,String name, String description, LocalDate date) {
          imr.adding(id,name,description,date);
        }

        ArrayList<Task> display() {
          return imr.display();
        }

        int delete(int q) {
          return imr.delete(q);
        }

        ArrayList<Task> search() {
          return imr.search();
        }
    boolean changeStatusCheck(){
        return imr.changeStatusCheck();
    }

        void changeStatus(int s, int i)
        {
        imr.changeStatus(s,i);
        }
        ArrayList<Task> listByStatus(int er){
           return imr.listByStatus(er);
        }
    }
