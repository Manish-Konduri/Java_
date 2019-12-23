package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
        public void adding(ArrayList<Data> ar, String name, String description, LocalDate date) {
            ar.add(new Data(name, description, date));
        }

        public void display(ArrayList<Data> ar) {
            if (ar.size() > 0) {
                for (int i = 0; i < ar.size(); i++)
                    System.out.println(i + " " + ar.get(i).name + " " + ar.get(i).description + " " + ar.get(i).Date);
            } else {
                System.out.println("No Data");
            }
        }

        public void delete(ArrayList<Data> ar, int q) {
            if (ar.size() > 0) {
                ar.remove(q);
            } else {
                System.out.println("No Data");
            }
        }

        public void search(ArrayList<Data> ar) {
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
    }
