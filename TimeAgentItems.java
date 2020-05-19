package project1;
/** class of TimeAgentItems  extends from the calss of Items 
 * */
public class TimeAgentItems extends Items{
	/** construct the AnimalFeedItems 
	 * @param   sName   name to items 
	 * @param   sPurchasePrice  set the purchaseprice to 20
	 * @param   sFunctionDetail set the function to make crops havested*/
	public TimeAgentItems()
	{
		super("TimeAgentItems",20.0,"decrease harvest time 2 days");
	}

}