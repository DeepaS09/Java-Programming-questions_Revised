package javaQuestions;

import java.util.Scanner;

public class HotelTarriff {

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the month number (1-12): ");
	        int month = scanner.nextInt();
	        
	        System.out.print("Enter the room rent per day: ");
	        float roomRentPerDay = scanner.nextFloat();
	        
	        System.out.print("Enter the number of days stayed: ");
	        int daysStayed = scanner.nextInt();

	        
	        float totalTariff = roomRentPerDay * daysStayed;

	        
	        boolean isPeakSeason = false;
	        switch (month) {
	            case 4: case 5: case 6:  
	            case 11: case 12:        
	                isPeakSeason = true;
	                break;
	            default:
	                isPeakSeason = false;
	                break;
	        }

	        
	        if (isPeakSeason) {
	            totalTariff *= 1.20; 
	        }

	       
	        System.out.printf("The hotel tariff to be paid is: %.2f\n", totalTariff);

	       
	        scanner.close();
	    }
	}
