
public class RandomNumber1 
{
	public int computerNum1;
	public int high1;
	public int high2;
	
	public RandomNumber1(int high2)
	{
		 high1 = high2;
	}
	public int GetANumber()
	{
		computerNum1 = 1 + (int) (Math.random()*high1);
		return computerNum1;
	}
	public int SetHighNumber(int high)
	{
		high1 = 1 + (int) (Math.random()*high);
		return high1;
	}
}


