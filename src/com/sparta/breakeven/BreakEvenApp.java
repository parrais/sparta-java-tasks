package com.sparta.breakeven;

public class BreakEvenApp {
    public static void main(String[] args) {
        float itemCost = 20.00f;
        float salePrice = 40.00f;
        float fixedCosts = 50000.00f;

        float profitPerItem = salePrice - itemCost;
        int breakeven = (int) Math.ceil(fixedCosts / profitPerItem);

        System.out.println("Sale price for each item: " + salePrice);
        System.out.println("Fixed costs: " + fixedCosts);
        System.out.println("Profit per item: " + profitPerItem);
        System.out.println("Breakeven: " + breakeven);
    }
}
