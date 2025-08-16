package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
public abstract class Products {
    protected String name; 
    protected String brand;
    protected double price; 
    protected Currency currency;

    public Products(){
        this.name = this.brand =  "unknown";
        this.price = 0.0;
    }

    public Products(String name, String brand, double price, Currency currency){
        assert (price <=0) : "Price need to be greater than 0";
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.currency = currency;
        
    }

    public abstract double getTotalCost();
    /*
    public String getName(){return name;}
    public String getBrand(){return brand;}
    public double getPrice(){return price;}
    public String getCurrency(){return currency;}

    public double calculateTotalCost(){
        double totalCost = price;
        totalCost += price*0.07;
        totalCost += price*0.05;
        return totalCost;
    }
        */
    
    public String toString(){
        return name;
    }
}
