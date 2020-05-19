package project1;
/** the class of KiwiFruit extends from the calss of Crop */
public class KiwiFruit extends Crop{
	
	/** construct the KiwiFruit
	 *  @param sName  set the name to  KiwiFruit
	 *  @param sPurchasePrice   set the purchase price to 1.0
	 *  @param sSellingPrice  set the selling price to 10.0 
	 *  @param sHeigth   set the heigth to 2.0
	 *  @param sHarvestTime set the harvest time to 2.0*/
	public KiwiFruit()
	{
		super("KiwiFruit", 1.0, 10.0, 2.0,2.0);
	}
	
	public String toString() {
		
		System.out.print("sow a KiwiFruit seed");
		return ("sow a KiwiFruit seed");
		
	}

}