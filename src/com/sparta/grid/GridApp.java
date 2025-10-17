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
        StringBuilder starRow = new StringBuilder();
        for (int i = 0; i < columns; i++){
            starRow.append(" *");
        }
        String trimmedRow = starRow.toString().trim() + "\n";
        StringBuilder starGrid = new StringBuilder();
        for (int j = 0; j < rows; j++){
            starGrid.append(trimmedRow);
        }
        return starGrid.toString();
    }
}
