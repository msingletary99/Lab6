/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class LandTract {
    public double length;
    public double width;
    public double area;
    
    public LandTract(){
        area=0.0;
    }
    public LandTract(double tractLength, double tractWidth){
        length=tractLength;
        width=tractWidth;
    }

public double getArea(double length, double width){
    area=length*width;
    return area;
}

public double getArea(){
    area=this.length*this.width;
    return area;
}

public boolean equals(LandTract tract2){
    return this.area==tract2.area;
}
    public String toString(double area){
        return "Area: " + area;
    }
}
