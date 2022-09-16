/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingtime;


//Corbin Lazarone
//CSC-1350, Kundu

import java.util.*;

public class ParkingTime 
{ public static void main(String[] args)
  { Scanner scan = new Scanner(System.in);
    int numQuartersObtained, numDimesObtained, numNickelsObtained,
    numPenniesGiven, numPenniesUsed, numPenniesRemaining, numMaxParkingMinutes;
    //processing 1st numPennesGiven
    System.out.print("\nEnter number of pennies given (>= 0): ");
    numPenniesGiven = scan.nextInt();
    scan.nextLine();
    numQuartersObtained = numPenniesGiven / 25;
    numPenniesRemaining = numPenniesGiven % 25;
    numDimesObtained = numPenniesRemaining / 10;
    numPenniesRemaining %= 10;
    numNickelsObtained = numPenniesRemaining / 5;
    numPenniesRemaining %= 5;
    numPenniesUsed = numPenniesGiven - numPenniesRemaining;
    numMaxParkingMinutes = 30 * numQuartersObtained + 11 
    * numDimesObtained + 5 * numNickelsObtained;
    System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " +
                       numDimesObtained + "x10 + " + numNickelsObtained + 
                       "x5 = " + numPenniesUsed);
    System.out.println("Max. #(parking minutes) = " + numQuartersObtained + 
                       "x30 + " + numDimesObtained + "x11 + " + 
                       numNickelsObtained + 
                       "x5 = " + numMaxParkingMinutes + " (using " + 
                       numPenniesUsed + " pennies out of " + numPenniesGiven 
                       + ")");
    
    //processing 2nd numPenniesGiven
    System.out.print("\nEnter number of pennies given (>= 0): ");
    numPenniesGiven = scan.nextInt();
    scan.nextLine();
    numQuartersObtained = numPenniesGiven / 25;
    numPenniesRemaining = numPenniesGiven % 25;
    numDimesObtained = numPenniesRemaining / 10;
    numPenniesRemaining %= 10;
    numNickelsObtained = numPenniesRemaining / 5;
    numPenniesRemaining %= 5;
    numPenniesUsed = numPenniesGiven - numPenniesRemaining;
    numMaxParkingMinutes = 30 * numQuartersObtained + 11 
    * numDimesObtained + 5 * numNickelsObtained;
    System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " + 
                       numDimesObtained + "x10 + " + numNickelsObtained + 
                       "x5 = " + numPenniesUsed);
    System.out.println("Max. #(parking minutes) = " + numQuartersObtained + 
                       "x30 + " + numDimesObtained + "x11 + " + 
                       numNickelsObtained + "x5 = " + numMaxParkingMinutes + 
                       " (using " + numPenniesUsed + " pennies out of " + 
                       numPenniesGiven + ")");
    
    //processing 3rd numPenniesGiven
    System.out.print("\nEnter number of pennies given (>= 0): ");
    numPenniesGiven = scan.nextInt();
    scan.nextLine();
    numQuartersObtained = numPenniesGiven / 25;
    numPenniesRemaining = numPenniesGiven % 25;
    numDimesObtained = numPenniesRemaining / 10;
    numPenniesRemaining %= 10;
    numNickelsObtained = numPenniesRemaining / 5;
    numPenniesRemaining %= 5;
    numPenniesUsed = numPenniesGiven - numPenniesRemaining;
    numMaxParkingMinutes = 30 * numQuartersObtained + 11 
    * numDimesObtained + 5 * numNickelsObtained;
    System.out.println("#(pennies used) = " + numQuartersObtained + "x25 + " + 
                       numDimesObtained + "x10 + " + numNickelsObtained +
                       "x5 = " + numPenniesUsed);
    System.out.println("Max. #(parking minutes) = " + numQuartersObtained + 
                       "x30 + " + numDimesObtained + "x11 + " + 
                       numNickelsObtained + "x5 = " + numMaxParkingMinutes + 
                       " (using " + numPenniesUsed + " pennies out of " + 
                       numPenniesGiven + ")");
  }
}

