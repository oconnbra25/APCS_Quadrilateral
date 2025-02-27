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
}
