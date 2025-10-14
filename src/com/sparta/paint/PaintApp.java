package com.sparta.paint;

public class PaintApp {
    public static void main(String[] args){
        double paintPerCan = 5.1d;
        double canDiameter = 0.15d;
        double canHeight = 0.3d;
        double boxLength = 0.6d;
        double boxWidth = 0.3d;
        double boxHeight = 0.35d;
        double hallLength = 40f;
        double hallWidth = 30f;
        double hallHeight = 3.4f;

        double hallSurfaceArea = hallHeight * 2 * (hallLength + hallWidth);
        int paintNeeded = (int) Math.ceil(hallSurfaceArea / paintPerCan);

        int cansPerBox = (int) Math.floor(boxLength / canDiameter) * (int) Math.floor(boxWidth / canDiameter) * (int) Math.floor(boxHeight / canHeight);
        int fullBoxes = paintNeeded / cansPerBox;
        int extraCans = paintNeeded % cansPerBox;

        System.out.println("Minimum number of cans required: " + paintNeeded);
        System.out.println("Number of full boxes: " + fullBoxes);
        System.out.println("Number of cans not packed: " + extraCans);
    }
}
