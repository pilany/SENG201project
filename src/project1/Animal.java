package project1;
/** There three type of animals which has the same contributes,such as
 * animal's name,price,happiness and healthness. The Animal class inplements
 * observer and overides methods from observer.The farmer can receive the 
 * animals state from farm and can play some activities with animals.    */

import lab7.Observable;
import lab7.Observer;

public class Animal implements Observer{
	
	/**initialise animal's name
	 * initialise animal's purchaseprice
	 * initialise animal's health
	 * initialise animal's happiness  
	 * create a Items's variable   */
	private String name = "";
	private double purchasePrice = 0.0;
	private double health = 0.0;
	private double happiness = 0.0;
	Items item ;
	
	/**This method is called whenever the animal is changed. 
     *An application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.*/
	@Override
	public void update(Observable o, Object arg) {
	    System.out.println("Received move to next day update!");
	    this.happiness += 10;
	    this.health += 10;
	  }
	
	/** Adds a animal observer to the set of observers for this farm, provided
     * that it is not the same as some observer already in the set.
     *
     * @param  farm   start the observing from farm.
     * @param  this   an animal observer to be added.
	 * */
	public void startObserving(Farm farm)
	  {
		 farm.addObserver(this);
	  }
	
	
	/**
     * Deletes an observer from the set of observers of this object.
     * Passing <CODE>null</CODE> to this method will have no effect.
     * @param   o   the observer to be deleted.
     */
	public void stopObserving(Farm farm) 
	  {
		  farm.deleteObserver(this);
		  
	  }
	

	
	public Animal(String sname, double spurchasePrice, double shealth, double shappiness) {
		/** Construct a name with empty string.
		 *  Construct a purchasePrice with zero price.
		 *  Construct a health with zero health.
		 *  Construct a happiness with zero happiness.*/
		name = sname;
		purchasePrice = spurchasePrice;
		health = shealth;
		happiness = shappiness;
	}
	
	/** Create a feed method to calculate the animal's health* */
	public void feed()
	{
		this.health *= 2;
	}
	
	/** Create a play method to calculate the animal's happiness */
	public void play() {
		this.happiness += 10;
	}
	
	/** Create a increaseHappiness method to calculate the animal's happiness */
	public void increaseHappiness() {
		this.happiness += 20;
	}
	
	/** Create a setPurchasePirce method to set the purchasePrice */
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	
	/** Create a getPurchasePrice method and return the purchasePrice */
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	/** Create a setHealth method to set the health*/
	public void setHealth(double health)
	{
		 this.health = health;
	}
	/** Create a getHealth method and return the health*/
	public double getHealth()
	{
		return health;
	}
	/** Create a setHppiness method to set the happiness*/
	public void setHappiness(double happiness)
	{
		 this.happiness = happiness;
	}
	/** Create a getHappiness method and return the happiness */
	public double getHappiness()
	{
		return happiness;
	}
}