package com.manish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainExtended{

    public static void main(String args[])
    {
        ArrayList<Data> ar =new ArrayList<Data>();
        Scanner sc = new Scanner((System.in));
        while (true) {
            System.out.println("1-Add Data, 2-Print Data, 3-Search, 4-Delete, 5-Change Status, 6-View by status, 7-Quit");
            int inputq = sc.nextInt();
            if (inputq == 1) {

                TaskManager.adding();
            } else if (inputq == 2) {
                TaskManager.display();
            }
            else if(inputq==4){

                TaskManager.delete();
            }
            else if(inputq==3){
                TaskManager.search();
            }
            else if(inputq==5){
                TaskManager.changeStatus();
            }
            else if(inputq==6){
                TaskManager.listByStatus();
            }
            else if(inputq>=7){
                break;
            }
        }
    }
}
