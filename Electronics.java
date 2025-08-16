package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
public class Electronics extends Products {
    private String type;

    public Electronics(String name, String brand, double price, Currency currency, String type){
        super(name, brand, price, currency);
        this.type = type; 
    }

    public double getTotalCost(){
        double priceInCAD = currency.toCAD(price);
        priceInCAD += price*0.07;
        priceInCAD += price*0.05;
        if (currency == currency.USD){
            priceInCAD += priceInCAD*0.25;
        }
        return priceInCAD;
    }
}
