package com.company;

public class Main {

    public static void main(String[] args) {

        OrangeJuice glas1 = new OrangeJuice(16);
        OrangeJuice glas2 = new OrangeJuice(6);
        OrangeJuice glas3 = new OrangeJuice(12);

        try {
            glas1.buy();
        } catch(TooWarmException e) {
            System.out.println(e.getMessage());
        } catch(TooColdException e) {
            System.out.println(e.getMessage());
        } catch(SoldOutException e) {
            System.out.println(e.getMessage());
        }

        try {
            glas2.buy();
        } catch(TooWarmException e) {
            System.out.println(e.getMessage());
        } catch(TooColdException e) {
            System.out.println(e.getMessage());
        } catch(SoldOutException e) {
            System.out.println(e.getMessage());
        }

        try {
            glas3.buy();
        } catch(TooWarmException e) {
            System.out.println(e.getMessage());
        } catch(TooColdException e) {
            System.out.println(e.getMessage());
        } catch(SoldOutException e) {
            System.out.println(e.getMessage());
        }
    }
}
