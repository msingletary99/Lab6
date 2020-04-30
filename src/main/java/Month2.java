/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Month2 {

    private int monthNumber;
    String month;

    public Month2() {
        monthNumber = 1;
    }

    public Month2(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Month2(String month) {
        this.month = month;

        if (this.month.equalsIgnoreCase("January")) {
            this.monthNumber = 1;
        } else if (this.month.equalsIgnoreCase("February")) {
            this.monthNumber = 2;
        } else if (this.month.equalsIgnoreCase("March")) {
            this.monthNumber = 3;
        } else if (this.month.equalsIgnoreCase("April")) {
            this.monthNumber = 4;
        } else if (this.month.equalsIgnoreCase("May")) {
            this.monthNumber = 5;
        } else if (this.month.equalsIgnoreCase("June")) {
            this.monthNumber = 6;
        } else if (this.month.equalsIgnoreCase("July")) {
            this.monthNumber = 7;
        } else if (this.month.equalsIgnoreCase("August")) {
            this.monthNumber = 8;
        } else if (this.month.equalsIgnoreCase("September")) {
            this.monthNumber = 9;
        } else if (this.month.equalsIgnoreCase("October")) {
            this.monthNumber = 10;
        } else if (this.month.equalsIgnoreCase("November")) {
            this.monthNumber = 11;
        } else if (this.month.equalsIgnoreCase("December")) {
            this.monthNumber = 12;
        } else {
            this.monthNumber = 1;
        }
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            monthNumber = 1;
        }

    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String month = "";
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "January";
        }
        return month;
    }
    
    public String toString(){
        return getMonthName();
    }
    
    public boolean Equals(Month2 m){
        return m.getMonthNumber()==this.monthNumber;
    }
    
    public boolean greaterThan(Month2 m){
        return m.getMonthNumber()<this.monthNumber;
    }
    
    public boolean lessThan(Month2 m){
        return m.getMonthNumber()>this.monthNumber;
    }

}
