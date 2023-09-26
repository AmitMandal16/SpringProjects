package com.amit.ioexamples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

	public static void main(String[] args) throws IOException {

		DataOutputStream dataWrite = null;
		DataInputStream dataRead = null;

		try {
			dataWrite = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\apps\\Testing.txt")));

			for (int i = 0; i < prices.length; i++) {

				dataWrite.writeDouble(prices[i]);
				dataWrite.writeInt(units[i]);
				dataWrite.writeUTF(descs[i]);
				System.out.println("Written Sucessfull..");
			}

		}

		finally {

			if (dataWrite != null) {
				dataWrite.close();
			}

		}

		double total = 0.0;
		try {

			dataRead = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\apps\\Testing.txt")));
			while (true) {
				double price = dataRead.readDouble();
				int unit = dataRead.readInt();
				String desc = dataRead.readUTF();
				System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
				total += unit * price;
			}
		} catch (EOFException e) {

		}
		System.out.format("For a TOTAL of: $%.2f%n", total);

		dataRead.close();

	}

}
