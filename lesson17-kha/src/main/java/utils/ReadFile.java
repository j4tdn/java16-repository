package utils;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.List;

import persistence.ItemGroup;

public class ReadFile {
	public static List<ItemGroup> Readfile(String fileName) {
		List<ItemGroup> listIg = new ArrayList();
		try {
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] dataSplit = data.split(",");
		        ItemGroup ig = new ItemGroup(Integer.parseInt(dataSplit[0].strip()), dataSplit[1], dataSplit[2]);
		        listIg.add(ig);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return listIg;
	}
}
