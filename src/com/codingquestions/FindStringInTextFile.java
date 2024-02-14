package com.codingquestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\DummyData\\UserService.txt";
		String word = "Certification";
		System.out.println(findStringInFile(path,word));
	}

	public static boolean findStringInFile(String path,String word) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			if(line.contains(word)) {
				sc.close();
				return true;
			}
		}
		sc.close();
		return false;
	}
}
