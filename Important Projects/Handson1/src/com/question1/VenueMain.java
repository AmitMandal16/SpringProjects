package com.question1;

import java.util.Scanner;

public class VenueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the venue name : ");
		String name = sc.nextLine();

		System.out.print("Enter the city name : ");
		String city = sc.nextLine();

		Venue venue = new Venue(name, city);

		System.out.println("Verify and Update Venue Details  \nMenu");

		System.out.println("\n1.Update Venue Name  " + "\n2.Update City Name  \n3.All informations Correct/Exit "
				+ "\nType 1 or 2 or 3");

		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.print("Your input is : " + a);
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Update the venue name : ");
			String vn = sc1.nextLine();
			venue.setName(vn);
			System.out.println("Venue Name : " + venue.getName());

			break;

		case 2:
			System.out.print("Your input is : " + a);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Update the City name :");
			String c = sc2.nextLine();
			venue.setCity(c);
			System.out.println("City Name : " + venue.getCity());
			break;

		case 3:
			System.out.print("Your input is : " + a);

			System.out.println("All the informations are correct..");

			break;

		default:
			System.out.println("Venue details are given below : \n" + venue);

		}

		sc.close();

	}

}
