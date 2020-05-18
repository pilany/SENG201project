package project1;
/** the class of Eggplant extends from the calss of Crop */
public class Eggplant extends Crop{
	/** construct the Eggplant
	 *  @param sName  set the name to  Eggplant
	 *  @param sPurchasePrice   set the purchase price to 1.0
	 *  @param sSellingPrice  set the selling price to 10.0 
	 *  @param sHeigth   set the heigth to 2.0
	 *  @param sHarvestTime set the harvest time to 2.0*/
	public Eggplant()
	{
		super("Eggplant", 1.0, 10.0, 2.0,2.0);
	}
	
	public String toString() {
		
		System.out.print("sow a Eggplant seed");
		return ("sow a Eggplant seed");
		
	}

}