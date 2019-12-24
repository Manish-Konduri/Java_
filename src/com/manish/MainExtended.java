package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainExtended{

    public static void main(String []args)
    {
        Scanner sc = new Scanner((System.in));
        TaskManager taskManager = new TaskManager();
        int id=1;
        while (true) {
            System.out.println("1-Add Data, 2-Print Data, 3-Search, 4-Delete, 5-Change Status, 6-View by status, 7-Quit");
            int inputq = sc.nextInt();
            String spaceHandler = sc.nextLine();
            if (inputq == 1) {
                System.out.println("Enter Name");
                String name = sc.nextLine();
                System.out.println("Enter Description");
                String description = sc.nextLine();
                System.out.println("Enter the Date in format of 'yyyy-mm-dd'");
                try {
                    String dateInput = sc.next();
                    LocalDate date = LocalDate.parse(dateInput);
                    taskManager.adding(id,name,description,date);
                    id=id+1;
                }
                catch (Exception e){
                    System.out.println("Enter correct format of date");
                }
            } else if (inputq == 2) {
                ArrayList<Task> returnDisplay;
                if(taskManager.display()==null){
                    System.out.println("No Data");
                }
                else {
                    returnDisplay = taskManager.display();
                    for (Task task : returnDisplay) {
                        System.out.println(task);
                    }
                }
            }
            else if(inputq==4) {
                if (taskManager.changeStatusCheck()) {

                    System.out.println("Enter id to be deleted");
                    int q = sc.nextInt();
                    if (taskManager.delete(q) == 1) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("No Data");
                    }
                }
                else{
                    System.out.println("No Data");
                }
            }
            else if(inputq==3){
                ArrayList<Task> returnSearch;
                returnSearch=taskManager.search();
                if (taskManager.changeStatusCheck()) {
                    for (Task search : returnSearch) {
                        System.out.println(search.getId() + " " + search.getName());
                    }
                    System.out.println("Enter the id");
                    int searchIndex = sc.nextInt();
                    for (Task search : returnSearch) {
                        if(search.getId()==searchIndex)
                            System.out.println(search);
                        else
                            System.out.println("No such Id Found");
                    }
                } else {
                    System.out.println("No Data");
                }
            }
            else if(inputq==5){
                if(taskManager.changeStatusCheck()) {
                    System.out.println("Do you want to change the status 1-Yes, 2-No:");
                    ArrayList<Task> ArrayListDisplay;
                    int inp = sc.nextInt();
                    if (inp == 1) {
                        ArrayListDisplay=taskManager.search();
                        for (Task task : ArrayListDisplay) System.out.println(task.getId() + " " + task.getName());
                        System.out.println("Enter the id to be changed:");
                        int i = sc.nextInt();
                        System.out.println("What status do you want to modify to:");
                        System.out.println("1.Initial, 2.In_progress, 3.Done");
                        int s = sc.nextInt();
                        taskManager.changeStatus(s, i);
                    } else {
                        System.out.println("1-Add Data, 2-Print Data, 3-Search, 4-Delete, 5-Change Status, 6-View by status, 7-Quit");
                    }
                }
                else{
                    System.out.println("No Data");
                }
            }
            else if(inputq==6) {
                try {
                    ArrayList<Task> arl1;
                    System.out.println("1.Initial, 2.In_progress, 3.Done");
                    int er = sc.nextInt();
                    arl1 = taskManager.listByStatus(er);
                    if (arl1.size() > 0) {
                        for (Task task : arl1) {
                            System.out.println(task);
                        }
                    } else {
                        System.out.println("No Data");
                    }
                }
                catch(Exception e){
                    System.out.println("No Data");
                }
            }
            else if(inputq>=7){
                break;
            }
        }
    }
}
