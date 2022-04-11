package com.company;

public class OrangeJuice extends Throwable {

    private static int stock = 3;
    private int temp;

    public OrangeJuice(int temp){
        this.temp = temp;
    }

    public void buy() throws TooWarmException, TooColdException, SoldOutException {
        if(this.temp > 15) {
            setStock(stock - 1);
            System.out.println(stock + " glas of orange juice left in stock");
            throw new TooWarmException("The orange juice is too warm!");
        } else if(this.temp < 9) {
            setStock(stock - 1);
            System.out.println(stock + " glas of orange juice left in stock");
            throw new TooColdException("The orange juice is too cold!");
        } else if(stock <= 0) {
            throw new SoldOutException("Out of stock!");
        }
        setStock(stock - 1);
        System.out.println(stock + " glas of orange juice left in stock");
        System.out.println("That was delicious, ideal temperature!");
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        OrangeJuice.stock = stock;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int optimalTemp) {
        this.temp = optimalTemp;
    }
}
