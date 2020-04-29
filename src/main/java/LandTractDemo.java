/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;
public class LandTractDemo {
    public static void main(String[] args) {
        double tractLength;
        double tractWidth;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the length of Tract 1: ");
        tractLength= keyboard.nextDouble();
        System.out.println("Enter the width of Tract 1: ");
        tractWidth=keyboard.nextDouble();
        
        LandTract tract1 = new LandTract(tractLength, tractWidth);
        
        System.out.println("Enter the length of Tract 2:");
        tractLength = keyboard.nextDouble();
        System.out.println("Enter the width of Tract 2:");
        tractWidth = keyboard.nextDouble();
        
        LandTract tract2 = new LandTract(tractLength, tractWidth);
        
        System.out.println("Tract 1 Area: " + tract1.getArea() );
        System.out.println("Tract 2 Area: " + tract2.getArea());
        
        if(tract1.equals(tract2)){
            System.out.println("The tracts have the same area.");
        }else{
            System.out.println("The Tracts have different areas.");
        }
        
        
        
        
        
    }
    
}
