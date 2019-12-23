package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainExtended{
    public static void main(String args[])
    {
        ArrayList<Data> ar =new ArrayList<Data>();
        Scanner sc = new Scanner((System.in));
        TaskManager t = new TaskManager();
        while (true) {
            System.out.println("1-Add Data, 2-Print Data, 3-Search, 4-Delete, 5-Quit");
            int inputq = sc.nextInt();
            if (inputq == 1) {
                System.out.println("Enter Name, Description");
                String name = sc.next();
                String description = sc.nextLine();
                LocalDate date= LocalDate.parse("2019-12-23");
                t.adding(ar,name,description,date);
            } else if (inputq == 2) {
                t.display(ar);
            }
            else if(inputq==4){
                System.out.println("Enter id to be deleted");
                int q = sc.nextInt();
                t.delete(ar,q);
            }
            else if(inputq==3){
                t.search(ar);
            }
            else if(inputq>=5){
                break;
            }
        }
    }
}
