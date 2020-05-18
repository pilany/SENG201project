package project1;
/** the class of Carrot extends from the calss of Crop */
public class Carrot extends Crop{

	/** construct the Carrot 
	 *  @param sName  set the name to  Carrot
	 *  @param sPurchasePrice   set the purchase price to 1.0
	 *  @param sSellingPrice  set the selling price to 10.0 
	 *  @param sHeigth   set the heigth to 2.0
	 *  @param sHarvestTime set the harvest time to 2.0*/
	public Carrot()
	{
		super("Carrot", 1.0, 10.0, 2.0,2.0);
	}
	/** */
	public String toString() {
		
		System.out.print("sow a Carrot seed");
		return ("sow a Carrot seed");
		
	}

}