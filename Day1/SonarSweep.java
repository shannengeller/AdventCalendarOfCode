package day1;

public class SonarSweep {
	
	
	public static void main(String[] args) {
	
		// declaring array with set values for the discovered depth
		int[] depthValues = {199, 200, 208, 210, 200, 207, 240, 269, 260, 263};
		int previous = depthValues[0];
		int count = 0;
	
	// loop to run through the array and check if its increased from previous
		for(int i = 0; i < depthValues.length; i++) {
			if(depthValues[i] > previous) {
				count++;
				previous = depthValues[i];
				System.out.println(depthValues[i] + "(Increased)");
			}
			else if(depthValues[i] == previous){
				System.out.println(depthValues[i] + " (N/A - no previous measurement)");
				previous = depthValues[i];
			}
			else {
				previous = depthValues[i];
				System.out.println(depthValues[i] + "(Decreased)");
			}
		}
		System.out.println("There are " + count + " measurements that are larger than the previous measurement.");
	}
}

