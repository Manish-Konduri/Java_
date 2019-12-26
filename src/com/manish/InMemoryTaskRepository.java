package com.manish;

import java.util.ArrayList;
import java.util.Date;

class InMemoryTaskRepository implements TaskRepository{
     ArrayList<Task> arrayList = new ArrayList<>();
    public void adding(int id,String name, String description, Date date) {
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
    public boolean changeStatusCheck(){
        return arrayList.size() > 0;
    }

   public void changeStatus(int s, int i) {

       if (s == 1) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setStatus(Status.Initial);
               }
           }
       }
       else if (s == 2) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setStatus(Status.IN_PROGRESS);
               }
           }
       }
       if (s == 3) {
           for (int j = 0; j < arrayList.size(); j++) {
               if (arrayList.get(j).getId() == i) {
                   arrayList.get(j).setStatus(Status.Done);
               }
           }
       }

    }
    public ArrayList<Task> listByStatus(){
        ArrayList<Task> arl = new ArrayList<>();
        int er=1;
        if(er==1) {
            for (Task task : arrayList) {
                String qw = task.getStatus().toString();
                if (qw.equals("Initial") || qw.equals("IN_PROGRESS")) {
                    arl.add(task);
                }

            }
            return arl;
        }
        return null;
    }
    public ArrayList<Task> dueToday(){
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");
        ArrayList<Task> arl = new ArrayList<>();
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        for (Task task : arrayList) {
            Date qw = task.getDate();
            if((qw.compareTo(date)==0)){
                arl.add(task);
            }
        }
        return arl;
    }
}
