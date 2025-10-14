package com.sparta.breakeven;

public class BreakEvenApp {
    public static void main(String[] args) {
        double itemCost = 20.00d;
        double salePrice = 40.00d;
        double fixedCosts = 50000.00d;

        double profitPerItem = salePrice - itemCost;
        int breakeven = (int) Math.ceil(fixedCosts / profitPerItem);

        System.out.println("Sale price for each item: " + salePrice);
        System.out.println("Fixed costs: " + fixedCosts);
        System.out.println("Profit per item: " + profitPerItem);
        System.out.println("Breakeven: " + breakeven);
    }
}
