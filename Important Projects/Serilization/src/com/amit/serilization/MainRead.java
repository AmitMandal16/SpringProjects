package com.amit.serilization;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainRead {

	public static void main(String[] args) {
		
		System.out.println("Start reading serializable object");
		
		String fname = "C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\testing.txt";
		
		try (ObjectInputStream obj = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fname)))) {
			
			Account account1 = (Account) obj.readObject();
			System.out.println("First Account details "+ account1);
			
			Account account2 = (Account) obj.readObject();
			System.out.println("Second Account details "+ account2);
			
		} catch (Exception ec) {

			System.out.println(ec);
		}

		finally {
			System.out.println("Finished reading serializable object");
		}

	}

}
