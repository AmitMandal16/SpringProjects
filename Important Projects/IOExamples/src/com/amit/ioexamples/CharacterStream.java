package com.amit.ioexamples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		FileWriter fw = null;

		try {
			String s = "C:\\apps\\Testing.txt";

			fr = new FileReader(s);
			fw = new FileWriter("C:\\apps\\Testing_Out.txt");
			int a;
			
			while((a= fr.read())!=-1) {
				fw.write(a);
				System.out.print((char)a);
			}

		} finally {
			if (fr != null) {
				fr.close();
			}
			if (fw != null) {
				fw.close();
			}

		}

	}
}