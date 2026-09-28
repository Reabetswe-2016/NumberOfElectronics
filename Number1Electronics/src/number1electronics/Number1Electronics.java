/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number1electronics;


public class Number1Electronics {

    public static void main(String[] args) {

// One-dimensional array containing the city names
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

// Two-dimensional array containing console sales
// Rows = cities
// Columns = PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

// Variables used to find the city with the most sales
        int highestSales = 0;
        String highestCity = "";

        System.out.println("===== NUMBER 1 ELECTRONICS SALES REPORT =====");
        System.out.println();

// Loop through each city
        for (int i = 0; i < cities.length; i++) {

            int totalSales = 0;

            System.out.println("City: " + cities[i]);
            System.out.println("PS5 Sales: " + sales[i][0]);
            System.out.println("XBOX Sales: " + sales[i][1]);
            System.out.println("SWITCH Sales: " + sales[i][2]);

// Calculate total sales for the city
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }

            System.out.println("Total Sales: " + totalSales);
            System.out.println();

// Check if this city has the highest sales
            if (totalSales > highestSales) {
                highestSales = totalSales;
                highestCity = cities[i];
            }
        }

// Display city with the most sales
        System.out.println("===== HIGHEST SALES =====");
        System.out.println("City with the most gaming console sales: "
                + highestCity);
        System.out.println("Total Sales: " + highestSales);
    }
}
