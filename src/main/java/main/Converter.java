package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		//global variables;
		int menuSelection = 0;
		int unit;
		
		
		//continue loop until user selects the last option (4);
		while(menuSelection != 4) {
			System.out.println("Please select an option: ");
			System.out.println("1. Liters to Mlliters");
			System.out.println("2. Pounds to Kilograms");
			System.out.println("3. Amps to Milliamps");
			System.out.println("4. Quit");
			menuSelection = collectUnit();
			
			switch (menuSelection) {
			case 1: {
				System.out.println("How many liters?");
				unit = collectUnit();
				litersToMilliters(unit);
				break;
			}
			case 2: {
				System.out.println("How many pounds?");
				unit = collectUnit();
				poundsToKilograms((float) unit);
				break;
			}
			case 3: {
				System.out.println("How many amps?");
				unit = collectUnit();
				ampsToMilliamps(unit);
				break;
				
			}
			case 4: {
				System.out.println("Thanks for using this converter!");
				break;
			} 
			default: {
				System.out.println("Please choose a valid selection");
			}
			}
		}
		
	}
	//methods for conversions
	public static void litersToMilliters(int liters) {
		System.out.println("Milliters: " + (liters * 1000));
	}
	
	public static void poundsToKilograms( float pounds) {
		System.out.println("Kiligrams: " + (pounds * 0.453592));
	}
	public static void ampsToMilliamps(int amps) {
		System.out.println("Milliamps: " + (amps * 1000));
	}
	
	//method for collection
	public static int collectUnit() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
		
	}
}
