package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

// this solution doesn't work the way I wanted to originally have it work... changing this after I am done all the challenges :)
public class BinaryDiagnostic {
	
	public static void main(String[] args) {
		
		String filename = "binaryInput.txt";
		String[] tempBinaryNumbers = new String[12];
		
		String leastCommonBit = "";
		String mostCommonBit = "";
		
		int[] zeroCount = new int[12];
		int[] oneCount = new int[12];
		
		try {
			Scanner fileReader = new Scanner(new File(filename));
			while(fileReader.hasNextLine()) {
				String temp = fileReader.next();
				for(int i = 0; i < temp.length(); i++ ) {
					tempBinaryNumbers = temp.split("(?!^)");
				}
				int j = 0;
			for (String s : tempBinaryNumbers) {
                    		if (s.equals("1")) {
                        		oneCount[j]++;
                    		} else {
                        		zeroCount[j]++;
                    		}
                    		j++;
                }
			for (int i = 0; i < oneCount.length; i++) {
	                	if (oneCount[i] > zeroCount[i]) {
	                		mostCommonBit += "1";
	                		leastCommonBit += "0";
	                	} else {
	                    		mostCommonBit += "0";
	                    		leastCommonBit += "1";
	                }
	            }
			System.out.println(mostCommonBit);
			System.out.println(leastCommonBit);
			BigInteger mostNumber = new BigInteger(mostCommonBit, 2);
	        	BigInteger leastNumber = new BigInteger(leastCommonBit, 2);
	        	System.out.println(mostNumber.intValue() * leastNumber.intValue());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
