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
}
