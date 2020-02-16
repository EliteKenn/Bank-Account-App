package Utilities;
import java.io.*;
import java.util.*;
public class CSV {

	//This method will read data from CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<>();
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
		
		}catch(FileNotFoundException e) {
			System.out.println("Can't find file");
			e.printStackTrace();
		}catch(IOException ex) {
			System.out.println("Can't read file");
			ex.printStackTrace();
		}
		return data;
	}
}
