package com.manish;

import java.time.LocalDate;

public class Data {
    enum status{
        Initial,
        IN_PROGRESS,
        Done
    }
        private String name;
        private String description;
        private LocalDate Date;
        private status Sta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public status getSta() {
        return Sta;
    }

    public void setSta(status sta) {
        Sta = sta;
    }

    Data()
        {
            this.Sta = status.Initial;
        }


    @Override
    public String toString() {
        return ('\n'+"name : "+name+'\n'+"Description : "+description+'\n'+"Date : "+Date+'\n'+"Status : "+Sta+'\n');
    }
}