package lesson4.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile 
{
	public  String readFromFile() throws IOException
	
	//public static void main(String[] args) throws IOException
	{
		//Specify path to your file
		File file = new File("E:\\�����\\TestClub\\Automation\\DataBase\\Select.txt");
				
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
		//br.close();
		
		
		return line;
	}
	
	//public static void main(String[] args)throws IOException
	//{
	//	ReadFromFile readFromFile = new ReadFromFile();
	//	readFromFile.readFromFile();
	//}
}
 