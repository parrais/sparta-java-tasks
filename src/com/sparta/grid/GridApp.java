package com.sparta.grid;

import java.util.Scanner;

public class GridApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int noOfColumns = getIntEntry("Please input a number of columns: ", scanner);
        int noOfRows = getIntEntry("Please input a number of rows: ", scanner);
        scanner.close();
        String grid = buildGrid(noOfColumns, noOfRows);
        System.out.print(grid);
    }

    private static int getIntEntry(String message, Scanner scan) {
        System.out.print(message);
        int userInt = scan.nextInt();
        return userInt;
    }

    private static String buildGrid(int columns, int rows) {
        String starRow = "";
        for (int i = 0; i < columns; i++){
            starRow += " *";
        }
        String trimmedRow = starRow.trim() + "\n";
        String starGrid = "";
        for (int j = 0; j < rows; j++){
            starGrid += trimmedRow;
        }
    return starGrid;
    }
}
