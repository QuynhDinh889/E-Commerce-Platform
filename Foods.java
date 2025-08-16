package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
import java.util.ArrayList;
public class Foods extends Products {
    private double weights;
    private boolean processedFoods;

    public Foods(String name, String brand, double price, Currency currency, double weights, boolean processedFoods){
        super(name, brand, price, currency);
        this.weights = weights;
        this.processedFoods = processedFoods;
    }


    public double getTotalCost(){
        double priceInCAD = currency.toCAD(price);
        if (processedFoods){
            priceInCAD += price*0.07;
            priceInCAD += price*0.05;
        }
        return priceInCAD;

    }

    

}
