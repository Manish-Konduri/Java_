package com.manish;

import java.time.LocalDate;

public class Data {
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