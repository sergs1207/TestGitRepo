package lesson4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFormfile 
{
	private static void readFromFile() throws IOException
	{
		//Specify path to your file
		File file = new File("myfile.txt");
				
		//Create special input stream for reading data
		FileInputStream fis = new FileInputStream(file);
		
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		//Print all existing lines from file to the console
		String line = null;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();
	}
}
