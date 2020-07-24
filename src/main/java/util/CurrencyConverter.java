package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double dollar;
    public static double quantityDollar;

    public static double priceInReais(){
        return dollar*quantityDollar+((dollar*quantityDollar)*IOF);
    }

//        System.out.println("What is the dollar price?");
//    CurrencyConverter.dollar = scanner.nextDouble();
//        System.out.println("How many dollars will be bought?");
//    CurrencyConverter.quantityDollar = scanner.nextDouble();
//        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.priceInReais());
}
