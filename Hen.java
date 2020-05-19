package project1;
/** the class of Hen  extends from the calss of Animal */
public class Hen extends Animal{
	/** the class of Hen  extends from the calss of Animal */
	/** construct the Hen 
	 *  @param sname  set the name to  Hen 
	 *  @param spurchasePrice   set the purchase price to 2.0
	 *  @param shealth set the selling price to 1.0 
	 *  @param shappiness set the happiness to 1.0 */
	public Hen()
	{
		super("Hen", 2.0, 1.0, 1.0);
	}
	
	public String toString() {
		
		System.out.print("buy a hen");
		return ("buy a hen");
		
	}
	
}