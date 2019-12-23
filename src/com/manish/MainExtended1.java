package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainExtended1{
    static class Data {
        String name;
        String description;
        LocalDate Date;
        Data(String name, String description, LocalDate Date)
        {
            // initialize the input variable from main
            // function to the global variable of the class
            this.name = name;
            this.description = description;
            this.Date = Date;
        }
    }
    public static void adding(ArrayList<Data> ar, String name, String description, LocalDate date) {
        ar.add(new Data(name, description, date));
    }

    public static void display(ArrayList<Data> ar) {
        if (ar.size() > 0) {
            for (int i = 0; i < ar.size(); i++)
                System.out.println(i + " " + ar.get(i).name + " " + ar.get(i).description + " " + ar.get(i).Date);
        } else {
            System.out.println("No Data");
        }
    }

    public static void delete(ArrayList<Data> ar, int q) {
        if (ar.size() > 0) {
            ar.remove(q);
        } else {
            System.out.println("No Data");
        }
    }

    public static void search(ArrayList<Data> ar) {
        if (ar.size() > 0) {
            for (int i = 0; i < ar.size(); i++)
                System.out.println(i + " " + ar.get(i).name);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the id whose details you want to view");
            int i = sc1.nextInt();
            System.out.println(ar.get(i).name + " " + ar.get(i).description + " " + ar.get(i).Date);
        } else {
            System.out.println("No Data");
        }
    }
    public static void main(String args[])
    {
        ArrayList<Data> ar =new ArrayList<Data>();
        Scanner sc = new Scanner((System.in));
//        TaskManager t = new TaskManager();
        while (true) {
            System.out.println("1-Add Data, 2-Print Data, 3-Search, 4-Delete, 5-Quit");
            int inputq = sc.nextInt();
            if (inputq == 1) {
                System.out.println("Enter Name, Description");
                String name = sc.next();
                String description = sc.nextLine();
                LocalDate date= LocalDate.parse("2019-12-23");
                adding(ar,name,description,date);
            } else if (inputq == 2) {
                display(ar);
            }
            else if(inputq==4){
                System.out.println("Enter id to be deleted");
                int q = sc.nextInt();
                delete(ar,q);
            }
            else if(inputq==3){
                search(ar);
            }
            else if(inputq>=5){
                break;
            }
        }
    }
}
