public class Wine {

	
	//wine object & method 
	private String wineName; 
	private double winePrice;
	private int wineQuantity;
	
	public Wine(String wn, double wp, int wq)
	{
		//constructor name, price, number 
	wineName = wn;
	winePrice = wp;
	wineQuantity = wq; 
	
	}
	
	
	public String getWineName()
	{
		return wineName;
	}
	
	public double getwinePrice()
	{
		return winePrice;
	}
	
	public int getwineQuantity()
	{
		return wineQuantity;
	}
	
	
}
