/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Month {

    public int monthNumber;
    public String monthName = "";

    public Month() {
        monthNumber = 1;
    }

    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }
    }

    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (monthName.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (monthName.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (monthName.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (monthName.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (monthName.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (monthName.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (monthName.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (monthName.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (monthName.equalsIgnoreCase("Ocotber")) {
            monthNumber = 10;
        } else if (monthName.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (monthName.equalsIgnoreCase("December")) {
            monthNumber = 12;
        } else {
            System.out.println("Please enter a valid Calander Month");
        }

    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }
        
        this.monthNumber=monthNumber;
    }
    
    public int getMonthNumber(){
        return monthNumber;
    }
    
    public String getMonthName(){
        
       if(monthNumber==1){
           monthName= "January";
       }
       return monthName;
    }
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Month M){
        return monthNumber == M.monthNumber;
    }
    
    public boolean greaterThan(Month M){
        return monthNumber>M.monthNumber;
    }
    
    public boolean lessThan(Month M){
        return monthNumber<M.monthNumber;
    }
    

}
