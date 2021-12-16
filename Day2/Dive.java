package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dive {
	
	public static void main(String[] args) {
		
		int position = 0;
		int depth = 0;
		String filename = "diveInput.txt";
		readFile(filename, position, depth);
		
	}
	
	public static void readFile(String filename, int position, int depth) {
		
		try {
			Scanner fileReader = new Scanner(new File(filename));
			while(fileReader.hasNextLine()) {
				String tempMovement = fileReader.next();
				int tempPlaces = fileReader.nextInt();
				
				if(tempMovement.equalsIgnoreCase("forward")) {
					position += tempPlaces;
				}
				else if(tempMovement.equalsIgnoreCase("up")) {
					depth += tempPlaces; 
				}
				else if(tempMovement.equalsIgnoreCase("down")) {
					depth -= tempPlaces;
				}
			}
			System.out.println("The Horizontal position is: " + position);
			System.out.println("The Depth position is: " + depth);
			System.out.println();
			System.out.println("Calculate the horizontal position and depth you would be: " + (position * depth));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
