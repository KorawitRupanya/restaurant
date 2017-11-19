package code;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class example {

	
	public static void main(String[] args) {
		ClassLoader loader = example.class .getClassLoader();
		InputStream input = loader.getResourceAsStream("data/sample.txt");
		Scanner reader = new Scanner(input);
		
		ArrayList<String> items = new ArrayList<>();
		ArrayList<String> prices = new ArrayList<>();
		
		
		
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(line);
			String[]array=line.split(":");
			
			String name =array[0];
			int id = Integer.parseInt(array[1]);
			
	
					
		
		}
	}
}

