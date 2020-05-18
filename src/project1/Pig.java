package project1;
/** the class of Pig  extends from the calss of Animal */
public class Pig extends Animal{
	
	/** construct the Pig 
	 *  @param sname  set the name to  Pig 
	 *  @param spurchasePrice   set the purchase price to 2.0
	 *  @param shealth set the selling price to 1.0 
	 *  @param shappiness set the happiness to 1.0 */
	public Pig()
	{
		super("Pig", 2.0, 1.0, 1.0);
	}
	
	public String toString() {
		
		System.out.print("buy a pig");
		return ("buy a pig");
		
	}

}
