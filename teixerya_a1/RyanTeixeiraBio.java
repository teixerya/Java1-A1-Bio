/*
* Name: Ryan Teixeira
* Assignment: Assignment 1
Program: Computer Systems Technology: Information Systems Engineering

Allows user to input their name and user receives my bio in return.
*/
import java.util.Scanner;

public class RyanTeixeiraBio  {
public static void main (final String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Kindly enter your full name: ");

    String name1 = scan.nextLine();
    System.out.println(" ");
    System.out.println("Welcome to my bio! ");
    System.out.println(" ");

    System.out.println(" ");
    System.out.println("Press any key and hit enter to see the Bio");
    System.out.println(" ");
    String name2 = scan.nextLine();

    System.out.println("Name: Ryan Teixeira");
    System.out.println("Programming Experience: I have been programming " +
    "for a 2 months in HTML5, CSS3, Javascript, and Java.");
    System.out.println("Favourite Subject: Food Science, Exercise Science");
    System.out.println("Least Favourite Subject: Geography.");
    System.out.println("Interests: Computer music, gaming and working out.  ");
    System.out.println("I studied Broadcasting TV at Mohawk and " +
    "achieved a Red seal Truck and coach mechanic license.  ");
    System.out.println(" ");
    }    
}
