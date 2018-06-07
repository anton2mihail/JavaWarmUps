
//MovieCost class
// Toni Lachmaniucu: Sep 2012 This program uses multi‐way if statements to check for valid input
import java.io.*;

public class Discount {
    public static void main(String[] args) throws IOException {
        double purchaseCost;
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Please enter purchase cost! ");
        purchaseCost = Double.parseDouble(input.readLine());
        if (purchaseCost < 10)
            System.out.print("Here is your total cost: " + purchaseCost);
        else if (purchaseCost >= 10) {
            System.out.print("Your Total cost will be: " + purchaseCost * 0.9);
        } // Place your code here
    } // main method
} // Discount class
