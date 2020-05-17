package project1;

import java.util.ArrayList;

import lab7.Observable;






public class Farm extends Observable{//the farm calss as a subject need extend observable
    // the farm keeps track of the amount of the money,the amount of the animals ,the amount
	//of crops and the amount of  items.  it informs observers of changes.               
	
	private String name ;//give the farm a name
	private int type ; //there are four types of farm
	private double money;//initialise the money
	static boolean isChangeDay = false; //set the ischangeday to false
	
	
	static ArrayList <Pig> pigList = new ArrayList<Pig> ();//three different type of animals
	static ArrayList <Hen> henList = new ArrayList<Hen> ();//each aniaml has a list 
	static ArrayList <Cow> cowList = new ArrayList<Cow> ();
	static ArrayList <Carrot> carrotList = new ArrayList<Carrot> ();//five different type of crops
	static ArrayList <Corn> cornList = new ArrayList<Corn> ();//each crop has a list
	static ArrayList <Eggplant> eggplantList = new ArrayList<Eggplant> ();
	static ArrayList <KiwiFruit> kiwifruitList = new ArrayList<KiwiFruit> ();
	static ArrayList <Tomato> tomatoList = new ArrayList<Tomato> ();
	//three type of items,each item has a list
	static ArrayList <AnimalFeedItems> animalFeedItemsList = new ArrayList<AnimalFeedItems> ();
	static ArrayList <HappyAgentItems> happyAgentItemsList = new ArrayList<HappyAgentItems> ();
	static ArrayList <TimeAgentItems> timeAgentitemsList = new ArrayList<TimeAgentItems> ();
	

	/**
	 * 
	 */
	public Farm( int typeId, String farmName) {
	    // initialise the farm
		type = typeId;    //initilise the type,there are four types of farm
		name = farmName;  //initilise the farm name
		 money = 2000;    //set the initial money to 2000
		 if (type == 4)   //if the type is the fourth of farm
			 money = 2400;//set the initial money to 2400
		 
	}
	
	public void setType(int n)
	{
		type = n;//set n to the type of farm
	}
	public void setMoney(double leftMoney)
	{
		money = leftMoney;//set  the left money 
	}
	
	public void setName(String name)
	{
		this.name = name;//set a name to farm
	}
	public double getMoney() {
		return this.money;//get money from farm
	}
		
	public void decreaseMoney(double m)
	{
		if(this.money >= m)
			this.money -=m ;// decrease the money
		else
			throw new IllegalArgumentException("oops, you do not have enough money to buy");//else throw an exception
	}
	
	public void increaseMoney(double m)//increase the money
	{
		this.money += m;
	}
	
	public void consumeFeedItems() {//consume the  feed item
		if( animalFeedItemsList.size() >= 1) //once choose an animal option to consume
			animalFeedItemsList.remove(0);   //need remove from this item of list
		else
			throw new IllegalArgumentException("oops, you do not have enough food to feed animal");
			
	}//else throw an exception
	
	public void consumeHappyAgentItem() {//consume the happy agent item
		if( happyAgentItemsList.size() >= 1)//once choose an an animal option to consume
			happyAgentItemsList.remove(0);//need remove from this item of list
		else
			throw new IllegalArgumentException("oops, you do not have happy agent to use");
	}//else throw an exception
	
	public void consumeTimeAgentItem() {//consume the time agent item
		if( timeAgentitemsList.size() >= 1)//once choose an crop option to consume
			timeAgentitemsList.remove(0);//need remove from this item of list
		else
			throw new IllegalArgumentException("oops, you do not have time agent to use");
	}//else throw an exception
	
	public String getName()
	{
		return name;//get the farm of farm
	}
	public int getType()
	{
		return type;//get the type of farm
	}
	public void lostCrop(String seedName) {//lost crops from the farm
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
	
	
	public void setIsChangeDay(boolean isChangeDay)
	{
		if(isChangeDay)
		{
			this.isChangeDay = isChangeDay;//set is change day to this farm 
		
			super.setChanged();//set change day
			super.notifyObservers("move to next day");//if the day has changed,as indicated by the haschanged method
			
			money += moveToNextDayBouns();//calculate the money  and move to the next day
		}
		else
			this.isChangeDay = isChangeDay;//else return false
	}

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
	
	public String toString()//print a welcome string
	{
		
		String outString = "Welcome to " + name +" Farm, "+" you have "+ money +" dollars \n";
		return outString;
	}
	
}