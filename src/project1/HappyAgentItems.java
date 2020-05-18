package project1;
/** class of HappyAgentItems extends from the class of Items 
 * */
public class HappyAgentItems extends Items{
	/** construct the HappyAgentItems 
	 * @param   sName   name to HappyAgentItems 
	 * @param   sPurchasePrice  set the purchaseprice to 20.0
	 * @param   sFunctionDetail set the function to increase the animal's happiness*/
	public HappyAgentItems()
	{
		super("HappyAgentItems",20.0,"increase the animal's happiness");
	}
}