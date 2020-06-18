package org.otu.account.project;

import java.io.FileWriter;
import java.io.IOException;

class Print{
	public static void file(String output) {
		String directory = System.getProperty("user.home");
		String fileName = "journal.txt";
		try(FileWriter fileWriter = new FileWriter(fileName, true)) {
		    String fileContent = output;
		    fileWriter.write(fileContent);
		    fileWriter.close();
		} catch (IOException e) {
		    // Cxception handling
		}
	}

	public static void screen(String output) {
		System.out.println(output);
	}
}