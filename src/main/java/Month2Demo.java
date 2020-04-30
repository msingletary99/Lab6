/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Month2Demo {

    public static void main(String[] args) {
        Month2 month1 = new Month2(6);
        Month2 month2 = new Month2(10);

        System.out.println("Month 1 is actually " + month1.getMonthName());
        System.out.println("Month 2 is acutally " + month2.getMonthName());

        System.out.println("True or False");
        System.out.println("=================================================");

        System.out.println("Month 1 and Month 2 are the same month");
        System.out.println(month1.equals(month2));

        System.out.println("=================================================");

        System.out.println("Month one happens after month two.");
        System.out.println(month1.greaterThan(month2));

        System.out.println("=================================================");

        System.out.println("Month one happens before month 2.");
        System.out.println(month1.lessThan(month2));
                
    }
}
