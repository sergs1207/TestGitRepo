package Intermediate_level;

public class Task_02 
{
	public static void main(String[] args) 
	{		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 999999; i++)
		{
			int b = i % 1000; // �������� ������� �� ������� �� ������.(�� ����, ������� ����� ����� �������, 
								//� ����� ����� ������� �� ��������).
			int b1 = b % 10;
			int b2 = b / 10;			
			int b3 = b2 % 10;			
			int b4 = b2 / 10;			
			sum2 = b1 + b3 + b4;
			
			int a = i / 1000; /* �������� �������� ����� ����� � ������� �������� �������. ��� ��� 
								���������� � � ��� INT, �� ������� ������ ����� ����� ��� ����������.
								(�� ����, ������� ����� ����� �������, � ����� ����� ������� ����������).*/
			int a1 = a % 10;
			int a2 = a / 10;
			int a3 = a2 % 10;
			int a4 = a2 / 10;			
			sum1 = a1 + a3 + a4;
						
			if(sum2 == sum1)
			{
				System.out.println("This is lucky number: " + a4 + a3 + a1 + b4 + b3 + b1);
			}
			else
			{
				//System.out.println("This is NOT lucky number: " + a4 + a3 + a1 + b4 + b3 + b1);
			}			
		}		
	}	
}