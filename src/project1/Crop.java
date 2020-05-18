package project1;
/** There five type of crops which has the same contributes,such as
 * crop's name,sellingprice,purchasePrice,heigth and three Time.
 * The fisrt time is to set a harvesttime,the second time is to set
 * a left time to harvest and the third time is to set a seed time 
 * The crops class inplements observer and overides methods from 
 * observer.The farmer can receive the crops state from farm and
 * can play some activities with crops.    */
import lab7.Observable;
import lab7.Observer;

public class Crop implements Observer{
	/**initialise crops's name
	 * initialise crops's purchaseprice
	 * initialise crops's heigth
	 * initialise crops's happiness  
	 * initialise crops's harvestTime  
	 * initialise crops's leftTimeToHarvest
	 * initialise crops's seedTime  
	 * create a Items' variable   */
	private String name = "";
	private double sellingPrice = 0.0;
	private double purchasePrice = 0.0;
	private double heigth = 0.0;
	private double harvestTime = 0.0;
	private double leftTimeToHarvest = 0.0;
	private double seedTime = 0.0;
	Items item ;
	
	/**This method is called whenever the crop is changed. 
     *An application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.*/
	@Override
	  public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.leftTimeToHarvest -= 5;
		this.heigth += 5;
	  }
	/** Adds a crop observer to the set of observers for this farm, provided
     * that it is not the same as some observer already in the set.
     * @param  farm   start the observing from farm.
     * @param  this   a crop observer to be added.
	 * */
	public void startObserving(Farm farm)
	  {
		 farm.addObserver(this);
	  }
	/**
     * Deletes an observer from the set of observers of this object.
     * Passing <CODE>null</CODE> to this method will have no effect.
     * @param   farm  stop observering from farm
     * @param   this  the observer to be deleted.
     */
	  public void stopObserving(Farm farm) 
	  {
		  farm.deleteObserver(this);
		  
	  }
	
	public Crop(String sName, double sPurchasePrice,  double sSellingPrice,double sHeigth,double sHarvestTime) {
		/** Construct a name with empty string.
		 *  Construct a purchasePrice with zero price.
		 *  Construct a sellingPrice with zero ellingprice.
		 *  Construct a heigth with zero heigth.
		 *  Construct a harvestTime with zero harvestTime
		 *  Construct a leftTimeToHarvest with harvestTime
		 *  Construct a seedTime with System.currentTimeMillis  .*/
		name = sName;
		purchasePrice = sPurchasePrice;
		sellingPrice = sSellingPrice;
		heigth = sHeigth;
		harvestTime = sHarvestTime;
		leftTimeToHarvest = harvestTime;
		seedTime = System.currentTimeMillis();
	}
	/** create a decreaseHarvestTime method,set the crops's harvestTime to minus 2 */
	public void decreaseHarvestTime( ) {
		this.harvestTime -= 2.0;
	}
    /**create a setSellingPrice method to set the sellingPrice*/	
	public void setSellingPrice(double sellingPrice)
	{
	    this.sellingPrice = sellingPrice;
	}
	/**create a getSellingPrice method and return the sellingPrice*/
	public double getSellingPrice()
	{
		return sellingPrice;
	}
	/**create a setPurchasePrice method to set the purchasePrice*/
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	/**create a getPurchasePrice method and return the getPurchasePrice*/
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	/**create a setHeigth method to set the Heigth*/
	public void setHeigth(double heigth)
	{
		 this.heigth = heigth;
	}
	/**create a getHeigth method and return the heigth*/
	public double getHeigth()
	{
		return heigth;
	}
	/**create a setHarvestTime method to set the harvestTime*/
	public void setHarvestTime(double harvestTime)
	{
		 this.harvestTime = harvestTime;
	}
	/**create a getHarvestTime method and return the harvestTime*/
	public double getHarvestTime()
	{
		return harvestTime;
	}
	
	//public void setLeftTimeToHarvest(double leftTimeToHarvest)
	//{
		// this.leftTimeToHarvest = leftTimeToHarvest;
	//}
	/**create a getLeftTimeToHarvest  method and return the leftTimeToHarvest*/
	public double getLeftTimeToHarvest()
	{
		return leftTimeToHarvest;
	}
	/**create a setLeftTimeToHarvest  method to set the leftTimeToHarvest  */
	public void setLeftTimeToHarvest(double t)
	{
		leftTimeToHarvest = t;
		
	}

}
