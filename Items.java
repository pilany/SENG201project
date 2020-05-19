package project1;
/** create a class of Items 
 * initialise the name to empty
 * initialise the purchasePrice to zero
 * initialise the functionDetail to empty
 */
public class Items {
	private String name = "";
	private double purchasePrice = 0.0;
	private String functionDetail = "";
	/**construct Items,set name,purchasePrice and functionDetail*/
	public Items(String sName, double sPurchasePrice, String sFunctionDetail) {
		
		name = sName;
		purchasePrice = sPurchasePrice;
		functionDetail = sFunctionDetail;
	}
	/**call setPurchasePrice(double purchasePrice) method 
	 * get purchasePrice */
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	/** call getPurchasePrice() method and return PurchasePrice*/
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	
	
}