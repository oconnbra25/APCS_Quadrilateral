import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // Import the ArrayList utilities

class Quadrilateral
{
	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	public Quadrilateral(int sideA, int sideB, int sideC, int sideD)
	{
		side1 = sideA;
		side2 = sideB;
		side3 = sideC;
		side4 = sideD;
	}
	
	public int getPerimeter()
	{
		return side1 + side2 + side3 + side4;
	}
}

class Rectangle extends Quadrilateral
{
	public Rectangle(int sideL, int sideW)
	{
		super(sideL, sideL, sideW, sideW);
	}
	
	public int getArea(int sideL, int sideW)
	{
		return sideL * sideW;
	}
	
	public String print(int sideL, int sideW)
	{
		private String temp = "";
		for (int i = 0; i < sideW; i++)
		{
			for (int j = 0; j < sideL; j++)
			{
				temp = temp + "*";
			}
			temp = temp + "\n";
		}
	}
}

class Square extends Rectangle
{
	public Square(int side)
	{
		super(side, side);
	}
}

class Parallelogram extends Quadrilateral
{
	public Parallelogram(int sideS, int sideB)
	{
		super(sideS, sideS, sideB, sideB);
	}
	
	public int getArea()
	{
		return sideS * sideB;
	}
	
	public String print(int sideS, int sideB)
	{
		private String temp = "";
		for (int k = 0; k < sideS; k++)
		{
			temp = temp + " ";
		}
		
		for (int i = 0; i < sideB; i++)
		{
			for (int j = 0; j < sideS; j++)
			{
				temp = temp + "*";
			}
			temp = temp + "\n";
			for (int g = 0; g < sideS - B; g++)
			{
				temp = temp + " ";
			}
		}
	}
}

public class Tester
{
	public static void main(String[] args)
	{
		int length = 0;
		int height = 0;
		int side = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which type of quadrilateral you want: /n1.) Rectangle/n2.)Square/n3.)parallelogram");
		
		int choice = scan.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Enter a side length");
			
			length = scan.nextInt();
			
			System.out.println("Enter a side length");
			
			height = scan.nextInt();
			
			Rectangle Q1 = new Rectangle(length, height);
		}
		else if (choice == 2)
		{
			System.out.println("Enter a side");
			
			side = scan.nextInt();
			
			Sqaure Q1 = new Square(side);
		}
		else
		{
			System.out.println("Enter a side length");
			
			length = scan.nextInt();
			
			System.out.println("Enter a side length");
			
			height = scan.nextInt();
			
			Parallelogram Q1 = new Parallelogram(length, height);
		}
		
		while (runner)
		{
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("Enter the number corresponding to what you would like to do:");
			System.out.println("1. Area");
			System.out.println("2. Print");
			System.out.println("3. Perimeter");
			System.out.println("4. Quit");
			
			int loopInput = scan1.nextInt();
			String tempLine = scan1.nextLine(); //clear the buffer
			if (loopInput == 1) //area
			{
				Q1.getArea();
			}
			else if (loopInput == 2) //Print
			{
				Q1.print();
			}
			else if (loopInput == 3) // Perimeter
			{
				Q1.getPerimeter();
			}
			else if (loopInput == 4)
			{
				break;
			}
		}
	}
}
