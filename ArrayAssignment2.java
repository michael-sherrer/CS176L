package edu.monmouth.arrays2;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		int  sumRow = 0;
		   int sumColumn1 = 0;
		   int sumColumn2 = 0;
		   int sumColumn3 = 0;

		   String [] medals = {"Country",
		    "Gold",
		    "Silver",
		    "Bronze",
		    "Total"
		    };

		   String [] countries = {"Canada",
		      "Italy",
		      "Germany",
		      "Japan",
		      "Kazakhstan",
		      "Russia",
		      "South Korea",
		      "United States",
		      "Totals"
		     };

		   int [][] counts = { {0, 3, 0, 0},
		{0, 0, 1, 0},
		{0, 0, 1, 0},
		{1, 0, 0, 0},
		{0, 0, 1, 0},
		{3, 1, 1, 0},
		{0, 1, 0, 0},
		{1, 0, 1, 0},
		{0, 0, 0, 0}
		};

		for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 3; j++) {
		sumRow = sumRow + counts[i][j];
		counts[i][3] = sumRow;
		}
		sumRow = 0;
		//column totals
		sumColumn1 = sumColumn1 + counts[i][0];
		sumColumn2 = sumColumn2 + counts[i][1];
		sumColumn3 = sumColumn3 + counts[i][2];
		
		if (i > 7) {
		counts[8][3] = sumColumn1 + sumColumn2 + sumColumn3; // last column
		}
		}
		counts[8][0] = sumColumn1;
		counts[8][1] = sumColumn2;
		counts[8][2] = sumColumn3;

		//System.out.println(counts[0][3]); first row
		//System.out.println(counts[1][3]); second row
		//System.out.println(counts[2][3]); third row
		//System.out.println(counts[3][3]); fourth row
		//System.out.println(counts[4][3]); fifth row
		//System.out.println(counts[5][3]); sixth row
		//System.out.println(counts[6][3]); seventh row
		//System.out.println(counts[7][3]); eighth row
		//System.out.println(counts[8][0]); first column
		//System.out.println(counts[8][1]); second column
		//System.out.println(counts[8][2]); third column
		//System.out.println(counts[8][3]); fourth and last column
		System.out.printf("%13s %13s %13s %13s %13s %n", medals[0], medals[1], medals[2], medals[3], medals[4]);
		for (int i = 0; i < 9; i++) {
				System.out.printf("%13s %13d %13d %13d %13d %n",countries[i],counts[i][0],counts[i][1], counts[i][2], counts[i][3]);
			}	
		}
		}

		