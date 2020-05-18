package project1;
/** the class of Tomato extends from the calss of Crop */
public class Tomato extends Crop{

	/** construct the Tomato
	 *  @param sName  set the name to  Tomato
	 *  @param sPurchasePrice   set the purchase price to 1.0
	 *  @param sSellingPrice  set the selling price to 10.0 
	 *  @param sHeigth   set the heigth to 2.0
	 *  @param sHarvestTime set the harvest time to 2.0*/
	public Tomato()
	{
		super("Tomato", 1.0, 10.0, 2.0,2.0);
	}
	
	public String toString() {
		
		System.out.print("sow a Tomato seed");
		return ("sow a Tomato seed");
		
	}
}