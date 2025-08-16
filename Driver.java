package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args){
        /*
         * Electronics:
         *   45" TV, $1598.0, USD, hardware
         *   24" Monitor, $118.0, CAD, hardware
         * 
         * Food:
         *   Bananas, $0.35, USD, 150grams, not processed
         *   Aubergines, $1.25, GBP, 450grams, not processed
         *   TimTams, $4.30, AUD, 300, processed
         *   
         *   New Zealand Shirt, $39.99, NZD, Shirt, Small
         *   Manitoba Cap, $24.99, CAD, Hat, One-Size
         *   Jets Toque, $20.99, CAD, Hat, Large
         *   
         *   We've sold: 1 TV, 2 monitors, 3 bananas, 1 timtams, 1 shirt, 1 cap, and 2 toques
         */
        
        // Your code goes here
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Electronics("45\" TV", null, 1589.0, Currency.USD, "hardware")); //0
        products.add(new Electronics("24\" Monitor", null, 118.0, Currency.CAD, "hardware"));//1
        products.add(new Foods("Bananas", null, 0.35, Currency.GBP, 150, false));//2
        products.add(new Foods("Aubergines", null, 1.25,Currency.GBP, 450, false));//3
        products.add(new Foods("TimTams", null, 3.40, Currency.AUD, 300, true));//4
        products.add(new Clothings("Shirt", "New Zealand Shirt", 39.99, Currency.NZD, "Shirt", "Small"));//5
        products.add(new Clothings("Cap", "Manitoba Cap", 24.99, Currency.CAD, "Hat", "One-size"));//6
        products.add(new Clothings("Toque", "Jets Toque", 20.99, Currency.CAD, "Hat", "Large"));//7

        ArrayList<Products> sales = new ArrayList<>();
        sales.add(products.get(0));
        sales.add(products.get(1));
        sales.add(products.get(1));
        sales.add(products.get(2));
        sales.add(products.get(2));
        sales.add(products.get(2));
        sales.add(products.get(4));
        sales.add(products.get(5));
        sales.add(products.get(6));
        sales.add(products.get(7));
        sales.add(products.get(7));

        double totalCost=0;
        for (Products p: sales){
            double cost = p.getTotalCost();
            System.out.println(p + ": $" + cost);
            totalCost += cost;
        }

        System.out.println("The total cost was $" + totalCost);
    }
}
