import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Welcome to Tip calculator!");
        System.out.print("Please enter your bill amount: ");
        double billAmount = k.nextDouble();
        System.out.print("Please enter the total amount of people in your party: ");
        int peopleCount = k.nextInt();
        System.out.print("Please enter the percentage you would wish to tip: ");
        double tipPercent = k.nextInt();
        System.out.println("-----------------------------------------------------------------");

        double convertTipPercent = tipPercent / 100;
        double totalTips = billAmount * convertTipPercent;
        double totalBill = billAmount + totalTips;
        double tipsPerPerson = totalTips / peopleCount;
        double totalPerPerson = totalBill / peopleCount;

        System.out.print("The amount each person has to pay is: ");
        System.out.printf("%.2f", totalPerPerson);
        System.out.println();
        System.out.print("The total bill amount is: ");
        System.out.printf("%.2f", totalBill);
        System.out.println();
        System.out.print("The tip amount each person pay is : ");
        System.out.printf("%.2f", tipsPerPerson);
        System.out.println();
        System.out.print("The total tip amount is: ");
        System.out.printf("%.2f", totalTips);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Thank you for using the Tip Calculator!");

        }
    }