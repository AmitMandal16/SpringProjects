package com.amit.serilization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		Account account1 = new Account(11111, "Chandan", 100000.231);
		Account account2 = new Account(22222, "Ashwani", 200000.222);

		String fname = "C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\testing.txt";

		System.out.println("Started writing serializable object");

		try (ObjectOutputStream obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fname)))) {

			obj.writeObject(account1);
			obj.writeObject(account2);
		} catch (Exception ec) {

			System.out.println(ec);
		}

		finally {
			System.out.println("Finished writing serializable object");
		}

	}

}
