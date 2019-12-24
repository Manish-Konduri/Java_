package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;

class InMemoryTaskRepository implements TaskRepository{
     ArrayList<Task> arrayList = new ArrayList<>();
    public void adding(int id,String name, String description, LocalDate date) {
        Task d = new Task();
        d.setId(id);
        d.setName(name);
        d.setDescription(description);
        d.setDate(date);
        arrayList.add(d);
    }

    public ArrayList<Task> display() {
        if (arrayList.size() > 0) {
            return arrayList;
        } else {
            return null;
        }

    }

    public int delete(int q) {
        if (arrayList.size() > 0) {
            for(int i=0;i<arrayList.size();i++) {
                if(q==arrayList.get(i).getId()){
                    arrayList.remove(i);
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public ArrayList<Task> search() {
        if(arrayList.size()>0)
        {
            return arrayList;
        }
        else{
            return null;
        }
    }
    boolean changeStatusCheck(){
        return arrayList.size() > 0;
    }

   public void changeStatus(int s, int i) {

       if (s == 1) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setSta(status.Initial);
               }
           }
       }
       else if (s == 2) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setSta(status.IN_PROGRESS);
               }
           }
       }
       if (s == 3) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setSta(status.Done);
               }
           }
       }

    }
    public ArrayList<Task> listByStatus(int er){
        ArrayList<Task> arl = new ArrayList<>();
        if(er==1) {
            for (Task task : arrayList) {
                String qw = task.getSta().toString();
                if (qw.equals("Initial")) {
                    arl.add(task);
                }
                else if (qw.equals("IN_PROGRESS")) {
                    arl.add(task);
                }
                else if (qw.equals("Done")) {
                    arl.add(task);
                }
            }
            return arl;
        }
        return null;
    }
}
