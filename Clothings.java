package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
public class Clothings extends Products {
    private String type;
    private String size;

    public Clothings(String name, String brand, double price, Currency currency, String type, String size){
        super(name, brand, price, currency);
        this.type = type;
        this.size = size;
    }

    public double getTotalCost(){
        double priceInCAD = currency.toCAD(price);
        priceInCAD += price*0.07;
        priceInCAD += price*0.05;
        
        return priceInCAD;
    }

    public String toString(){
        return name + " " + size; 
    }
}
