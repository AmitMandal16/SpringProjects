package com.amit.ioexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = null;
		FileOutputStream fo = null;

		try {

			fi = new FileInputStream("C:\\Temp\\FMOUserSwitch.log");
			fo = new FileOutputStream("C:\\Temp\\FMOUserSwitch_out.log");
			int a;

			while ((a = fi.read()) != -1) {

				fo.write(a);
				System.out.println("Reading and writing sucessfully..");

			}

		}

		finally {

			if (fi != null) {
				
				fi.close();
				
			}
			
			if (fo != null) {

				fo.close();

			}

		}

	}

}
