package edu.monmouth.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {  
	  Scanner scanner = new Scanner(System.in);
      File inputFile = null;
      boolean fileFound = false;
      
      while (!fileFound) {
          try {
              System.out.print("Please enter the path to open the input file (e.g., C:\\Downloads\\lines.txt): ");
              String filePath = scanner.nextLine();
              inputFile = new File(filePath);

              Scanner in = new Scanner(inputFile);
              fileFound = true;

              File outputFile = new File("C:\\Users\\micha\\Downloads\\outlines.txt");
              PrintWriter out = new PrintWriter(outputFile);

              while (in.hasNext()) {
                  String line = in.nextLine();
                  out.println(line);
              }
              in.close();
              out.close();
              System.out.println("File successfully processed.");

          } catch (FileNotFoundException e) {
              System.out.println("File is not found. Please try again.");
          }
      }

      scanner.close();
   }
}
