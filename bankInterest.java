
/*BankInterest
Programmer: Toni
Date: Sept 2015
This program calculates avg marked
*/
import java.io.*;

public class Student2 {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        double firstM, secondM, thirdM, fourthM, avg;
        String firstName;
        System.out.print("Please enter your first name: ");
        firstName = input.readLine();
        System.out.println(" ");
        String lastName;
        System.out.print("Please enter your last name: ");
        lastName = input.readLine();
        System.out.println(" ");
        System.out.print("Please enter your first mark: ");
        firstM = Double.parseDouble(input.readLine());
        System.out.print("Please enter your second mark: ");
        secondM = Double.parseDouble(input.readLine());
        System.out.print("Please enter your third mark: ");
        thirdM = Double.parseDouble(input.readLine());
    }
}