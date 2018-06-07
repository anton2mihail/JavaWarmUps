
/*StartEnd
Programmer: Toni
Date: November 2015*/
import java.io.*;

public class StartEnd {
    public static void main(String[] args) throws IOException {
        String temp;
        int startNum, endNum;
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Please enter a number: ");
        startNum = Integer.parseInt(input.readLine());
        System.out.print("Please enter higher number: ");
        endNum = Integer.parseInt(input.readLine());
        for (int x = startNum; x <= endNum; x++) {
            System.out.println(x);
        }
    } // main method
} // StartEnd class