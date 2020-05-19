package project1;
/** the class of Corn extends from the calss of Crop */
public class Corn extends Crop{
	
	/** construct the Cron
	 *  @param sName  set the name to  Cron
	 *  @param sPurchasePrice   set the purchase price to 1.0
	 *  @param sSellingPrice  set the selling price to 10.0 
	 *  @param sHeigth   set the heigth to 2.0
	 *  @param sHarvestTime set the harvest time to 2.0*/
	public Corn()
	{
		super("Corn", 1.0, 10.0, 2.0,2.0);
	}
	
	public String toString() {
		
		System.out.print("sow a Corn seed");
		return ("sow a Corn seed");
		
	}

}
