package edu.monmouth.arrays;

public class ArrayAssignment {
	
	public static void main(String[] arg) {
	
	double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};{
	for (double i : values) {
	System.out.print(i+" ");
	}
	double max = values[0];
	for (double i=0 ; i < values.length; i++ );{
	if (values[i] > max) {
		max = values[i];
	  }
    }
	System.out.println("The largest element in the array is: " + max);
	}
	int negNum = 0;
	for (double i = 0; i<values.length; i++) {
		if (values[i] < 0) {
			negNum++;
		}
	}
	System.out.println("There are " + negNum + "in the array");
}
}
