package com.Staff;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateClass {
    String dateInput;
    Date dateOut;

    public int day;
    public int month;
    public int year;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    DateClass(String dateInput) {
        this.dateInput = dateInput;

        String datePart[] = dateInput.split("/");

        this.day = Integer.parseInt(datePart[0]);
        this.month = Integer.parseInt(datePart[1]);
        this.year = Integer.parseInt(datePart[2]);

        this.dateOut = new Date(year - 1900, month - 1, day);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String strDate = dateFormat.format(dateOut);
        return strDate;
    }
}
