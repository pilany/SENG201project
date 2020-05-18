package project1;

import java.util.ArrayList;

import lab7.Observable;


/**A farm calss as a subject need extend observable
 *the farm keeps track of the amount of the money,the 
 *amount of the animals ,the amountmof crops and the 
 *amount of  items.  It informs observers of changes 
 *and contains a list of observers*/

public class Farm extends Observable{
	/**initialise farm's name
	 * initialise farm's type
	 * initialise farm's money
	 * initialise farm's isChangeDay to false  */
	private String name ;
	private int type ;
	private double money;
	static boolean isChangeDay = false; 
	
	/** animal observers,there are three lists of animal
	 *  crop observers,there are five lists of crop
	 *  item observers,there are three lists of item */
	static ArrayList <Pig> pigList = new ArrayList<Pig> ();
	static ArrayList <Hen> henList = new ArrayList<Hen> ();
	static ArrayList <Cow> cowList = new ArrayList<Cow> ();
	static ArrayList <Carrot> carrotList = new ArrayList<Carrot> ();
	static ArrayList <Corn> cornList = new ArrayList<Corn> ();
	static ArrayList <Eggplant> eggplantList = new ArrayList<Eggplant> ();
	static ArrayList <KiwiFruit> kiwifruitList = new ArrayList<KiwiFruit> ();
	static ArrayList <Tomato> tomatoList = new ArrayList<Tomato> ();
	static ArrayList <AnimalFeedItems> animalFeedItemsList = new ArrayList<AnimalFeedItems> ();
	static ArrayList <HappyAgentItems> happyAgentItemsList = new ArrayList<HappyAgentItems> ();
	static ArrayList <TimeAgentItems> timeAgentitemsList = new ArrayList<TimeAgentItems> ();
	

	/**construct the farm 
	 * initilise the type,there are four types of farm
	 * set the initial money to 2000
	 * if the type is the fourth of farm
	 set the initial money to 2400 */
	public Farm( int typeId, String farmName) {
	   
		type = typeId;    
		name = farmName; 
		 money = 2000;   
		 if (type == 4)   
			 money = 2400;
		 
	}
	/** set n to the type of farm*/
	public void setType(int n)
	{
		type = n;
	}
	/** set  the left money to money */
	public void setMoney(double leftMoney)
	{
		money = leftMoney;
	}
	/** set a name to farm */
	public void setName(String name)
	{
		this.name = name;
	}
	/** get money from farm */
	public double getMoney() {
		return this.money;
	}
	/** create a decreaseMoney(double m) method
	 *  if money is lager than m(includes),set money
	 *   equals  the money to minus 2 
	 *  else shrow a exception */	
	public void decreaseMoney(double m)
	{
		if(this.money >= m)
			this.money -=m ;
		else
			throw new IllegalArgumentException("oops, you do not have enough money to buy");//else throw an exception
	}
	/**create a increaseMoney(double m) set money equals the money to add m */
	public void increaseMoney(double m)
	{
		this.money += m;
	}
	/**create a consumeFeedItems() method. if the size of animalFeedItemsList
	 * is larger than one (includes),remove the first index of the 
	 * animalFeedItemsList. else throw a excpetion*/
	public void consumeFeedItems() {
		if( animalFeedItemsList.size() >= 1) 
			animalFeedItemsList.remove(0);   
		else
			throw new IllegalArgumentException("oops, you do not have enough food to feed animal");
			
	}
	/**create a consumeHappyAgentItem() method. if the size of happyAgentItemsList
	 * is larger than one (includes),remove the first index of the 
	 * happyAgentItemsList. else throw a excpetion*/
	public void consumeHappyAgentItem() {
		if( happyAgentItemsList.size() >= 1)
			happyAgentItemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have happy agent to use");
	}
	/**create a consumeTimeAgentItem method. if the size of timeAgentitemsList
	 * is larger than one (includes),remove the first index of the 
	 * timeAgentitemsList. else throw a excpetion*/
	public void consumeTimeAgentItem() {
		if( timeAgentitemsList.size() >= 1)
			timeAgentitemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have time agent to use");
	}
	/** create a getName() method and  return name */
	public String getName()
	{
		return name;
	}
	/** create a getType() method and  return type */
	public int getType()
	{
		return type;
	}
	/**create a lostCrop(String seedName) method 
	 * there are five type of crops which has a certain length of list
	 * when at each case,read the length of this crop and traverse the 
	 * half length of the crop,remove the half length of the crop */
	public void lostCrop(String seedName) {
		switch(seedName) {
		case "Corn":
			int len = cornList.size();
			for (int i = 0; i< len/2; i ++)
				cornList.remove(i);
			break;
		case "Carrot":
			int lenc = carrotList.size();
			for (int i = 0; i< lenc/2; i ++)
				carrotList.remove(i);
			break;
		case "Eggplant":
			int lene = eggplantList.size();
			for (int i = 0; i< lene/2; i ++)
				eggplantList.remove(i);
			break;
		case "KiwiFruit":
			int lenk = kiwifruitList.size();
			for (int i = 0; i< lenk/2; i ++)
				kiwifruitList.remove(i);
			break;
		case "Tomato":
			int lent = tomatoList.size();
			for (int i = 0; i< lent/2; i ++)
				tomatoList.remove(i);
			break;
		}
	}
	
	/** create a setIsChangeDay(boolean isChangeDay) method 
	 * @param isChangeDay   parse the boolean to check it is a change day or not
	 * if it isChangeDay,call setChanged method from Observable class
	 * call notifyObservers method from Observable
	 * set money equals the money add moveToNextDayBouns()
	 * else set isChangeDay */
	public void setIsChangeDay(boolean isChangeDay)
	{
		if(isChangeDay)
		{
			this.isChangeDay = isChangeDay;
		
			super.setChanged();
			super.notifyObservers("move to next day");
			
			money += moveToNextDayBouns();
		}
		else
			this.isChangeDay = isChangeDay;
	}
	/**create a moveToNextDayBouns() method 
	 * set each size of animal and crop to increace its five times */
	public double moveToNextDayBouns() {// in the next day,all animals and crops will increace to their own amount of five times 
		double b = 0.0;
		b += pigList.size()*5;
		b += henList.size()*5;
		b += cowList.size()*5;
		b += carrotList.size()*5;
		b += cornList.size()*5;
		b += eggplantList.size()*5;
		b += kiwifruitList.size()*5;
		b += tomatoList.size()*5;
		return b;
	}
	/**create toString()method 
	 * set the string to "Welcome to " + name +" Farm, "+" you have "+ money +" dollars \n";
	 * return the string*/
	public String toString()//print a welcome string
	{
		
		String outString = "Welcome to " + name +" Farm, "+" you have "+ money +" dollars \n";
		return outString;
	}
	
}