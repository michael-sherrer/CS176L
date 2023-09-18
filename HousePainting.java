import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter the cost per square foot: ");
	double squareFootCost = sc.nextDouble();
	
	System.out.print("Please enter the length of the house: ");
	double houseLength = sc.nextDouble();
	
	System.out.print("Please enter the width of the house: ");
	double houseWidth = sc.nextDouble();
	
	System.out.print("Please enter the height of the house: ");
	double houseHeight = sc.nextDouble();
	
	System.out.print("Please enter the number of windows: ");
	double windowNum = sc.nextDouble();
	
	System.out.print("Please enter the length of a window: ");
	double windowLength = sc.nextDouble();
	
	System.out.print("Please enter the width of a window: ");
	double windowWidth = sc.nextDouble();
	
	System.out.print("Please enter the number of doors: ");
	double doorNum = sc.nextDouble();
	
	System.out.print("Please enter the length of a door: ");
	double doorLength = sc.nextDouble();
	
	System.out.print("Please enter the width of a door: ");
	double doorWidth = sc.nextDouble();
	
	double totalDoorArea = doorNum*(doorWidth*doorLength);
	
	double totalWindowArea = windowNum*(windowLength*windowWidth);
	
	double normalSide = 2*(houseLength*houseWidth);
	
	double peakSide = 2*((houseLength*houseWidth)+(0.5*(houseLength*(houseHeight-houseWidth))));
	
	double totalHouseArea = (peakSide+normalSide)-(totalWindowArea+totalDoorArea);
	
	double totalCost = totalHouseArea*squareFootCost;
	
	System.out.println("Your total paintable surface area is "+totalHouseArea+" square feet.");
	System.out.println("Your estimate is "+totalCost+" dollars.");
	
	sc.close();

	}

}
