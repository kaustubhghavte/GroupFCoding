package com.questionsmeet;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * I have text file I want to know which word occurred multiple items?
 */
public class Question13 {

	public static void findOccurance(String path) throws IOException {
		FileInputStream fis = null;
		Scanner scanner = null;

		String fullString = "";// to store all string from file
		try {

			fis = new FileInputStream(path);
			scanner = new Scanner(fis);
			while (scanner.hasNext()) {
				String fromFile = scanner.nextLine();
				System.out.println(fromFile);

				fullString = fullString + fromFile + " ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			scanner.close();
		}

		// to store Result
		List<String> lresult = new ArrayList<String>();

		String wordarr[] = fullString.split(" ");

		for (int k = 0; k < wordarr.length; k++) {
			for (int l = k + 1; l < wordarr.length; l++) {
				
				if (wordarr[k].equalsIgnoreCase(wordarr[l])) {
					
					String temp = wordarr[k].toLowerCase();
					
					if (!lresult.contains(temp)) {
						
						lresult.add(temp);
					}
				}
			}
		}
		System.out.println(lresult);
	}

	public static void main(String[] args) throws IOException {

		findOccurance("Question13.txt");

	}

}
