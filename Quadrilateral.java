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
