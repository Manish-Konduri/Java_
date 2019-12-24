package com.manish;

import java.time.LocalDate;

public class Task {
        private String name;
        private String description;
        private LocalDate Date;
        private int id;
        private status Sta;

    String getName() {
        return name;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }

//    public String getDescription() {
//        return description;
//    }

    void setDescription(String description) {
        this.description = description;
    }

//    public LocalDate getDate() {
//        return Date;
//    }

    void setDate(LocalDate date) {
        Date = date;
    }

    status getSta() {
        return Sta;
    }

    void setSta(status sta) {
        Sta = sta;
    }

    Task()
        {
            this.Sta = status.Initial;
        }


    @Override
    public String toString() {
        return ("Id : "+id+'\n'+"name : "+name+'\n'+"Description : "+description+'\n'+"Date : "+Date+'\n'+"Status : "+Sta+'\n');
    }
}