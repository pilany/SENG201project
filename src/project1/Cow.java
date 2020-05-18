package project1;
/** the class of Cow extends from the calss of Animal */
public class Cow  extends Animal{
	/** the class of Cow extends from the calss of Animal */
	/** construct the Cow
	 *  @param sname  set the name to  Cow
	 *  @param spurchasePrice   set the purchase price to 2.0
	 *  @param shealth set the selling price to 1.0 
	 *  @param shappiness  set the happiness to 1.0*/
	public Cow()
	{
		super("Cow", 2.0, 1.0, 1.0);
	}
	
	public String toString() {
		
		System.out.print("buy a cow");
		return ("buy a cow");
		
	}

}