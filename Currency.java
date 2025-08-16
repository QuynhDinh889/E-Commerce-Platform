package Ass2;
/**
 * Assignment 2 ACS-1904
 * @author Anh Q.Dinh (#3194617)
 * @version 4th Mar 2025
 */
public enum Currency {
    CAD(1), USD(0.71), AUD(1.11), NZD(1.23), GBP(0.56), EUR(0.67);

    private final double rate;
    Currency(double rate){this.rate = rate;}
    public double toCAD(double amount){return amount/rate;}
    public double fromCAD(double amount){return amount*rate;}
}
