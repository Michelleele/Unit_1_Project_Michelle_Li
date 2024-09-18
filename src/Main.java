import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        //Welcoming User
        System.out.println("Welcome to Tip calculator!");

        //Taking inputs from user of bill amount, number of people. and tip percentage
        System.out.print("Please enter your bill amount: $");
        double billAmount = k.nextDouble();
        System.out.print("Please enter the total amount of people in your party: ");
        int peopleCount = k.nextInt();
        System.out.print("Please enter the percentage you would wish to tip: ");
        double tipPercent = k.nextInt();
        System.out.println("-----------------------------------------------------------------");

        //Calculations of tips, total bill, and amounts needs to be paid per person
        double convertTipPercent = tipPercent / 100;
        double totalTips = billAmount * convertTipPercent;
        double totalBill = billAmount + totalTips;
        double tipsPerPerson = totalTips / peopleCount;
        double totalPerPerson = totalBill / peopleCount;

        //Prints out all the values as receipt
        System.out.print("The amount each person has to pay is: $");
        System.out.printf("%.2f", totalPerPerson);
        System.out.println();
        System.out.print("The total bill amount is: $");
        System.out.printf("%.2f", totalBill);
        System.out.println();
        System.out.print("The tip amount each person pay is : $");
        System.out.printf("%.2f", tipsPerPerson);
        System.out.println();
        System.out.print("The total tip amount is: $");
        System.out.printf("%.2f", totalTips);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        //Indication to the end of program
        System.out.print("Thank you for using the Tip Calculator!");
        }
    }