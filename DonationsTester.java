package edu.monmouth.donations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File ("Donations.txt");
		Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to process donations now? (enter 'Yes' to continue): ");
        String response = scanner.nextLine();

        if (!response.equalsIgnoreCase("Yes")) {
            System.out.println("Ending now without processing donations");
            scanner.close();
            return;
	    }
        Donations giveToMe = new Donations();
        Scanner console = new Scanner(inputFile);

        while (console.hasNext()) {
            String category = console.next();
            if (category.equals("<EOF>")) {
                break;
            }
            double donation = console.nextDouble();
            giveToMe.processDonation(category, donation);
        }

        giveToMe.getStatistics();
        scanner.close();
        console.close();
    }
}
