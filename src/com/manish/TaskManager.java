package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager extends Data{
    protected static  ArrayList<Data> ar = new ArrayList<Data>();
        public static void adding() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name, Description");
            String name = sc.next();
            String description = sc.nextLine();
            LocalDate date= LocalDate.parse("2019-12-23");
            Data d = new Data();
            d.setName(name);
            d.setDescription(description);
            d.setDate(date);
            ar.add(d);
        }

        public static void display() {
            if (ar.size() > 0) {
                for (int i = 0; i < ar.size(); i++)
                    System.out.println(i + " " + ar.get(i));
            } else {
                System.out.println("No Data");
            }
        }

        public static void delete() {
            System.out.println("Enter id to be deleted");
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            if (ar.size() > 0) {
                ar.remove(q);
            } else {
                System.out.println("No Data");
            }
        }

        public static int search() {
            if (ar.size() > 0) {
                for (int i = 0; i < ar.size(); i++)
                    System.out.println(i + " " + ar.get(i).getName());
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter the id");
                int i = sc1.nextInt();
                System.out.println(ar.get(i));
                return i;
            } else {
                System.out.println("No Data");
                return 0;
            }
        }
        public static void changeStatus()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to change the status 1-Yes, 2-No:");
            int inp = sc.nextInt();
            if(inp==1){
                int i = search();
                System.out.println("Enter the id to be changed:");
                System.out.println("What status do you want to modify to:");
                System.out.println("1.Initial, 2.In_progress, 3.Done");
                int s = sc.nextInt();
                if(s==1){
                    ar.get(i).setSta(status.Initial);
                }
                else if(s==2){
                    ar.get(i).setSta(status.IN_PROGRESS);
                }
                else if(s==3){
                    ar.get(i).setSta(status.Done);
                }
            }

        }
        public static void listByStatus(){
            Scanner sc = new Scanner(System.in);
            ArrayList<Data> ar1 = new ArrayList<Data>();
            System.out.println("Enter the id of status");
            System.out.println("1.Initial, 2.In_progress, 3.Done");
            int er = sc.nextInt();
            if(er==1) {
                for (int i = 0; i < ar.size(); i++) {
                    String qw = ar.get(i).getSta().toString();
                    if(qw.equals("Initial"))
                    {
                        System.out.println(ar.get(i));
                    }
                }
            }
            if(er==2) {
                for (int i = 0; i < ar.size(); i++) {
                    String qw = ar.get(i).getSta().toString();
                    if(qw.equals("IN_PROGRESS"))
                    {
                        System.out.println(ar.get(i));
                    }

                }
            }
            if(er==3) {
                for (int i = 0; i < ar.size(); i++) {
                    String qw = ar.get(i).getSta().toString();
                    if(qw.equals("Done"))
                    {
                        System.out.println(ar.get(i));
                    }
                }
            }
        }
    }
