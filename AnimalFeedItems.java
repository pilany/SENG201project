package project1;

/** class of AnimalFeedItems extends from the calss of Items 
 * */
public class AnimalFeedItems extends Items{
	/** construct the AnimalFeedItems 
	 * @param   sName   name to animal feed
	 * @param   sPurchasePrice  set the purchaseprice to 10
	 * @param   sFunctionDetail set the function to make animal health*/
	public AnimalFeedItems()
	{
		super("animal feed",10.0,"make animal health");
	}
}
