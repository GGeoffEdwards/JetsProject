package jets;

import java.util.Scanner;

public class Menu {
	Hanger hanger = new Hanger();
	Barracks barracks = new Barracks();
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.menu();

	}

	public void menu() {
		int userInput;
		hanger.createJets();
		barracks.createPilots();

		while (true) {
			System.out.println("1. List fleet");
			System.out.println("2. View fastest jet");
			System.out.println("3. View jet with longest range");
			System.out.println("4. Add jet to fleet");
			System.out.println("5. List Pilots");	
			System.out.println("6. Hire Pilot");				
			System.out.println("7. list Jets with pilots");				
			System.out.println("8. Quit");
			System.out.print("Enter your selection: ");
			userInput = kb.nextInt();

			if (userInput == 8) {
				System.out.println("You have quit the program.");
				break;
			} else if (userInput == 1) {
				listFleet();
			} else if (userInput == 2) {
				fastestJet();
			} else if (userInput == 3) {
				longestRangeJet();
			} else if (userInput == 4) {
				addJet();
			}else if (userInput == 5) {
				listPilots();
			}else if (userInput == 6) {
				hirePilot();
			}else if (userInput == 7) {
				listFleetWithPilots();
			}
		}
	}

	public void listFleet() {
		for (int i = 0; i < hanger.getJets().length; i++) {
			if (hanger.getJets()[i] != null) {
				System.out.println(hanger.getJets()[i].toString());
			}
		}
	}
	public void listPilots() {
		for (int i = 0; i < barracks.getPilots().length; i++) {
			if (barracks.getPilots()[i] != null) {
				System.out.println(barracks.getPilots()[i].toString());
			}
		}
	}
	public void listFleetWithPilots() {
		for (int i = 0; i < hanger.getJets().length; i++) {
			if (hanger.getJets()[i] != null) {
				System.out.println(hanger.getJets()[i].toString() + barracks.getPilots()[(int) Math.floor(Math.random()*barracks.getPilots().length)]);
			}
		}
	}

	
	public void fastestJet() {
		Jet fastest = hanger.getJets()[0];
		for (Jet jet : hanger.jets) {
			if (jet != null) {
				if (fastest.getSpeed() < jet.getSpeed()) {
					fastest = jet;
				}
			}
		}
		System.out.println("The fastest jet is: " + fastest);
	}

	public void longestRangeJet() {
		Jet farthest = hanger.getJets()[0];
		for (Jet jet : hanger.jets) {
			if (jet != null) {
				if (farthest.getRange() < jet.getRange()) {
					farthest = jet;
				}
			}
		}
		System.out.println("the plane with the longest range is: " + farthest);
	}

	public void addJet() {
		String model;
		double speed;
		int range;
		int price;

		System.out.print("Enter model:");
		model = kb.next();
		System.out.print("Enter speed(in MPH):");
		speed = kb.nextDouble();
		System.out.print("Enter range:");
		range = kb.nextInt();
		System.out.print("Enter price: ");
		price = kb.nextInt();
		
		for (int i = 0; i < hanger.getJets().length; i++) {
			if (hanger.getJets()[i] == null) {
				hanger.getJets()[i] = new Jet(model, hanger.mPHtoMach(speed), range, price);
				break;

			}
		}
	}
	public void hirePilot() {
		String firstName;
		String lastName;
	
		System.out.print("Enter Pilot's first name:");
		firstName = kb.next();
		System.out.print("Enter Pilot's Last name:");
		lastName = kb.next();

		for (int i = 0; i < barracks.getPilots().length; i++) {
			if (barracks.getPilots()[i] == null) {
				barracks.getPilots()[i] = new Pilot(firstName, lastName);
				break;
				
			}
		}
	}

}
