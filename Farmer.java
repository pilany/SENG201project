package project1;

import java.io.IOException;

import lab5.LandingException;
/**  Farmers have a name and a type. Four types will be enough. The type deter-
mines which bonuses the farmer will have during the game, such as crop growing
speed, or animal happiness bonuses.  */
public class Farmer {
	private String name = "";
	private int age = 18;
	/** constructs a Farmer */
	public Farmer(String farmerName) {
		name = farmerName;
	}
	/** create a setName(String name) method and get the farmer's name */
	public void setName(String name) {
		this.name = name;
	}
	/** create a setAge(int n) method and get the farmer's age */
	public void setAge(int n) {
		age = n;
	}
	/** create a getName() method and return the farmer's name */
	public String getName() {//return name
		return name;
	}
	/** create a getAge() method and return the farmer's age */
	public int getAge() {//return age
		return age;
	}
	/** create a buySeed(String seedName, Farm myFarm) method 
	 * try to do five cases 
	 * each case create a new object
	 * calls decreaseMoney(corn.getPurchasePrice()) from Farm
	 * calls startObserving(myFarm) method from farm
	 * add each crop to it's list*/
	public void buySeed(String seedName, Farm myFarm) throws IOException{
		try {//the farmer can do the buySeed action
		switch (seedName) {
		case "Corn"://the corn case
			Corn corn = new Corn();//create	 a new Cron object which extends the class of crop		
			myFarm.decreaseMoney(corn.getPurchasePrice());//call the decreaseMoney from farm class
			corn.startObserving(myFarm);//
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			myFarm.decreaseMoney(carrot.getPurchasePrice());
			carrot.startObserving(myFarm);
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			myFarm.decreaseMoney(eggplant.getPurchasePrice());
			eggplant.startObserving(myFarm);
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			myFarm.decreaseMoney(tomato.getPurchasePrice());
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
		}
		catch (Exception  e) {
			throw new IOException(e.getMessage());
		}

	}
   /** create addConfigureSeed(String s, Farm myFarm) method 
    * there are five cases to switch 
    * each case calls setHeigth(Double.parseDouble(paraments[0])) method
    * calls setHarvestTime(Double.parseDouble(paraments[1])) method
    * calls setLeftTimeToHarvest(Double.parseDouble(paraments[2])) method
    * calls setPurchasePrice(Double.parseDouble(paraments[3])) method  
    * calls startObserving(myFarm) method
    * add each crop to it's list*/
	public void addConfigureSeed(String s, Farm myFarm)
	{
		//String t = "Carrot:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
		String[] sTemp = s.split(":");
		String[] paraments = sTemp[1].split(",");
		switch (sTemp[0]) {
		case "Corn":
			Corn corn = new Corn();			
			corn.setHeigth(Double.parseDouble(paraments[0]));
			corn.setHarvestTime(Double.parseDouble(paraments[1]));
			corn.setLeftTimeToHarvest(Double.parseDouble(paraments[2]));
			corn.setPurchasePrice(Double.parseDouble(paraments[3]));
			corn.startObserving(myFarm);
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			carrot.setHeigth(Double.parseDouble(paraments[0]));
			carrot.setHarvestTime(Double.parseDouble(paraments[1]));
			carrot.setLeftTimeToHarvest(Double.parseDouble(paraments[2]));
			carrot.setPurchasePrice(Double.parseDouble(paraments[3]));
			carrot.startObserving(myFarm);
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			eggplant.setHeigth(Double.parseDouble(paraments[0]));
			eggplant.setHarvestTime(Double.parseDouble(paraments[1]));
			eggplant.setLeftTimeToHarvest(Double.parseDouble(paraments[2]));
			eggplant.setPurchasePrice(Double.parseDouble(paraments[3]));
			eggplant.startObserving(myFarm);
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			kiwifruit.setHeigth(Double.parseDouble(paraments[0]));
			kiwifruit.setHarvestTime(Double.parseDouble(paraments[1]));
			kiwifruit.setLeftTimeToHarvest(Double.parseDouble(paraments[2]));
			kiwifruit.setPurchasePrice(Double.parseDouble(paraments[3]));
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			tomato.setHeigth(Double.parseDouble(paraments[0]));
			tomato.setHarvestTime(Double.parseDouble(paraments[1]));
			tomato.setLeftTimeToHarvest(Double.parseDouble(paraments[2]));
			tomato.setPurchasePrice(Double.parseDouble(paraments[3]));
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
	}
	/** create a buyAnimal(String animalName, Farm myFarm) method 
	 * try to do three cases 
	 * each case create a new object
	 * calls decreaseMoney(object.getPurchasePrice()) from Farm
	 * add each animal to it's list
	 * calls startObserving(myFarm) method from farm
	 */
	public void buyAnimal(String animalName, Farm myFarm) throws IOException {
		try {
			switch (animalName) {
			case "Pig":
				Pig p = new Pig();
				myFarm.decreaseMoney(p.getPurchasePrice());
				myFarm.pigList.add(p);
				p.startObserving(myFarm);
				break;
			case "Hen":
				Hen h = new Hen();
				myFarm.decreaseMoney(h.getPurchasePrice());
				myFarm.henList.add(h);
				h.startObserving(myFarm);
				break;
			case "Cow":
				Cow c = new Cow();
				myFarm.decreaseMoney(c.getPurchasePrice());
				myFarm.cowList.add(c);
				c.startObserving(myFarm);
				break;
			}
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
	}
	 /** create addConfigureAnimal(String s, Farm myFarm) method 
	    * there are three cases to switch 
	    * each case calls setHappiness(Double.parseDouble(paraments[0])) method
	    * calls setHealth(Double.parseDouble(paraments[1])) method
	    * add each animal to it's list 
	    * calls startObserving(myFarm) method
	    * */
	public void addConfigureAnimal(String s, Farm myFarm) {
		//String t = "Hen:" + h.getHappiness()+ ","+h.getHealth()+"\n";
		String[] sTemp = s.split(":");
		String[] paraments = sTemp[1].split(",");
		switch (sTemp[0]) {
		case "Pig":
			Pig p = new Pig();
			p.setHappiness(Double.parseDouble(paraments[0]));
			p.setHealth(Double.parseDouble(paraments[1]));
			myFarm.pigList.add(p);
			p.startObserving(myFarm);
			break;
		case "Hen":
			Hen h = new Hen();
			h.setHappiness(Double.parseDouble(paraments[0]));
			h.setHealth(Double.parseDouble(paraments[1]));
			myFarm.henList.add(h);
			h.startObserving(myFarm);
			break;
		case "Cow":
			Cow c = new Cow();
			c.setHappiness(Double.parseDouble(paraments[0]));
			c.setHealth(Double.parseDouble(paraments[1]));
			myFarm.cowList.add(c);
			c.startObserving(myFarm);
			break;
		}
	}
	
	/** create a buyItems(String itemsName, Farm myFarm) method 
	 * try to do three cases 
	 * each case create a new object
	 * calls decreaseMoney(object.getPurchasePrice()) from Farm
	 * add each animal to it's list
	 */
	public void buyItems(String itemsName, Farm myFarm) throws IOException{
		try {
			switch (itemsName) {
			case "AnimalFeedItems":
				AnimalFeedItems p = new AnimalFeedItems();
				myFarm.decreaseMoney(p.getPurchasePrice());
				myFarm.animalFeedItemsList.add(p);				
				break;
			case "TimeAgentItems":
				TimeAgentItems h = new TimeAgentItems();
				myFarm.decreaseMoney(h.getPurchasePrice());
				myFarm.timeAgentitemsList.add(h);
				break;
			case "HappyAgentItems":
				HappyAgentItems c = new HappyAgentItems();
				myFarm.decreaseMoney(c.getPurchasePrice());
				myFarm.happyAgentItemsList.add(c);				
				break;
			}
		} catch (Exception  e) {
			throw new IOException(e.getMessage());
		}
	}
	/** create addConfigureItems(String s, Farm myFarm) method
	 *  if the second element of the string is 0 return noting 
	 *  else set the string to count
	    * there are three cases to switch 
	    * each case traverses the count 
	    * creates a new object 
	    * add each item to it's list 
	    * */
	public void addConfigureItems(String s, Farm myFarm) {
		String[] sTemp = s.split(":");
		if(sTemp[1].equals(" 0"))
				return;
		int count = Integer.parseInt(sTemp[1].trim());
		switch (sTemp[0]) {
		case "AnimalFeedItems":
			for (int i =0; i < count;i++)
			{
			AnimalFeedItems p = new AnimalFeedItems();
			myFarm.animalFeedItemsList.add(p);		
			}
			break;
		case "TimeAgentItems":
			for (int i =0; i < count;i++)
			{
			TimeAgentItems h = new TimeAgentItems();
			myFarm.timeAgentitemsList.add(h);
			}
			break;
		case "HappyAgentItems":
			for (int i =0; i < count;i++)
			{
			HappyAgentItems c = new HappyAgentItems();
			myFarm.happyAgentItemsList.add(c);		
			}
			break;
		}
	}
	/** create a countCrops(String seedName, Farm myFarm)  
	 * initialise count to 0
	 * five cases to get each size*/
	public int countCrops(String seedName, Farm myFarm) {
		int count = 0;
		switch (seedName) {
		case "Corn":
			count = 0;
			count = myFarm.cornList.size();
			break;
		case "Carrot":
			count = 0;
			count = myFarm.carrotList.size();
			break;
		case "Eggplant":
			count = 0;
			count = myFarm.eggplantList.size();
			break;
		case "KiwiFruit":
			count = 0;
			count = myFarm.kiwifruitList.size();
			break;
		case "Tomato":
			count = 0;
			count = myFarm.tomatoList.size();
			break;
		}
		return count;

	}
    /** create countAnimal(String animalName, Farm myFarm) method
     * initialise the count to 0
     * three cases
     * three cases get each size */
	public int countAnimal(String animalName, Farm myFarm) {
		int count = 0;
		switch (animalName) {
		case "Pig":
			count = 0;
			count = myFarm.pigList.size();
			break;
		case "Hen":
			count = 0;
			count = myFarm.henList.size();
			break;
		case "Cow":
			count = 0;
			count = myFarm.cowList.size();
			break;
		}
		return count;

	}
    /**  create countItems(String itemsName, Farm myFarm) method 
     * initialise count to 0
     * three cases get each size */
	public int countItems(String itemsName, Farm myFarm) {
		int count = 0;
		switch (itemsName) {
		case "AnimalFeedItems":
			count = 0;
			count = myFarm.animalFeedItemsList.size();
			break;
		case "TimeAgentItems":
			count = 0;
			count = myFarm.timeAgentitemsList.size();
			break;
		case "HappyAgentItems":
			count = 0;
			count = myFarm.happyAgentItemsList.size();
			break;
		}
		return count;
	}

	
	public  void checkCropStore(int index, Farm myFarm) {
		
	}
	
	
	
	public void SoldCrop(String seedName) {
		
	}

	public void SoldAnimal(String animalName) {

	}

	
	
	/** create feedAnimal(String animalName, Farm myfarm) method 
	 * try to do 
	 * if there is no animal throw an exception
	 * switch three cases
	 * traverses each size
	 * get it's own index 
	 * calls consumeFeedItems() method
	 * calls feed() method
	 * */
	public void feedAnimal(String animalName, Farm myfarm) throws IOException {
		try {
			if(countAnimal(animalName, myfarm) == 0)
				throw new IOException("oops, you do not have animal to feed\n");
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					myfarm.consumeFeedItems();
					p.feed();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					myfarm.consumeFeedItems();
					h.feed();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					myfarm.consumeFeedItems();
					c.feed();
				}
				break;
			}
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}

	}

	
	/** create useHappyAgentItem(String animalName, Farm myfarm) method 
	 * try to do 
	 * if there is no animal throw an exception
	 * switch three cases
	 * traverses each size
	 * get it's own index 
	 * calls consumeHappyAgentItem() method
	 * calls increaseHappiness() method
	 * */
	
	public void useHappyAgentItem(String animalName, Farm myfarm) throws IOException {
		try {
			if (myfarm.happyAgentItemsList.size() == 0 || countAnimal(animalName,myfarm) == 0)
				throw new IOException("oops, you do not have happyAgentItem to use\n");
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					myfarm.consumeHappyAgentItem();
					p.increaseHappiness();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					myfarm.consumeHappyAgentItem();
					h.increaseHappiness();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					myfarm.consumeHappyAgentItem();
					c.increaseHappiness();
				}
				break;
			}
		} catch (IllegalStateException e) {
			throw new IOException(e.getMessage());
		}
	}

	/** create  useTimeAgentItem(String seedName, Farm myfarm)  method 
	 * try to do 
	 * if there is no crops or not enough timeAgentitems  throw an exception
	 * else switch five cases
	 * traverses each size
	 * get it's own index 
	 * calls consumeTimeAgentItem() method
	 * calls decreaseHarvestTime() method
	 * */
	public void useTimeAgentItem(String seedName, Farm myfarm) throws IOException {
		try {
			if(countCrops(seedName,myfarm)==0 || myfarm.timeAgentitemsList.size() == 0)
				throw new IOException("oops, you do not have crops or timeAgentItems to use \n");
			switch (seedName) {
			case "Corn":
				for (int i = 0; i < myfarm.cornList.size(); i++) 
				{
					Corn corn = myfarm.cornList.get(i);			
					myfarm.consumeTimeAgentItem();
					corn.decreaseHarvestTime();
				}
				break;
			case "Carrot":
				for (int i = 0; i < myfarm.carrotList.size(); i++) 
				{
					Carrot c = myfarm.carrotList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "Eggplant":
				for (int i = 0; i < myfarm.eggplantList.size(); i++) 
				{
					Eggplant c = myfarm.eggplantList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "KiwiFruit":
				for (int i = 0; i < myfarm.kiwifruitList.size(); i++) 
				{
					KiwiFruit c = myfarm.kiwifruitList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "Tomato":
				for (int i = 0; i < myfarm.tomatoList.size(); i++) 
				{
					Tomato c = myfarm.tomatoList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			}
			}
			catch (Exception  e) {
				throw new IOException(e.getMessage());
			}
	}
	
	
	/** create  playWithAnimal(String animalName, Farm myfarm)  method 
	 * try to do 
	 * if there is no animal throw an exception
	 * else switch three cases
	 * traverses each size
	 * get it's own index 
	 * calls play() method
	 * */
	public void playWithAnimal(String animalName, Farm myfarm) throws IOException{

			if (countAnimal(animalName, myfarm) ==0 )
			{
				throw new IOException("oops, you do not have " + animalName + " to play\n" );
			}
			
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					p.play();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					h.play();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					c.play();
				}
				break;
			}
		
	}
	
	/** create getItemDetail(Farm myFarm) method  
	 * return a string which list items' detail*/
	public static String getItemDetail(Farm myFarm) {
		String s = "Items-AnimalFeedItems: "+ myFarm.animalFeedItemsList.size()+ "\n";
		s += "Items-HappyAgentItems: "+ myFarm.happyAgentItemsList.size()+ "\n";
		s += "Items-TimeAgentItems: "+ myFarm.timeAgentitemsList.size()+ "\n";
		return s;
	}
	/** create getAniamlDetail(Farm myFarm) method  
	 * return a string which list animals' detail*/
	public static String getAniamlDetail(Farm myFarm) {
		String s= "";
		for(int i = 0 ; i<myFarm.henList.size(); i++)
		{
			Hen h = myFarm.henList.get(i);
			String t = "Animals-Hen:" + h.getHappiness()+ ","+h.getHealth()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.cowList.size(); i++)
		{
			Cow c = myFarm.cowList.get(i);
			String t = "Animals-Cow:" + c.getHappiness()+ ","+c.getHealth()+"\n";
			s += t;
		}
		
		for(int i = 0 ; i<myFarm.pigList.size(); i++)
		{
			Pig p = myFarm.pigList.get(i);
			String t = "Animals-Pig:" + p.getHappiness()+ ","+p.getHealth()+"\n";
			s += t;
		}
		return s;
	}
	/** create getCropDetail(Farm myFarm) method  
	 * return a string which list crops' detail*/
	public static String getCropDetail(Farm myFarm) {
		String s= "";
		for(int i = 0 ; i<myFarm.carrotList.size(); i++)
		{
			Carrot h = myFarm.carrotList.get(i);
			String t = "Crop-Carrot:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.cornList.size(); i++)
		{
			Corn h = myFarm.cornList.get(i);
			String t = "Crop-Corn:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		
		for(int i = 0 ; i<myFarm.eggplantList.size(); i++)
		{
			Eggplant h = myFarm.eggplantList.get(i);
			String t = "Crop-Eggplant:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.kiwifruitList.size(); i++)
		{
			KiwiFruit h = myFarm.kiwifruitList.get(i);
			String t = "Crop-KiwiFruit:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.tomatoList.size(); i++)
		{
			Tomato h = myFarm.tomatoList.get(i);
			String t = "Crop-Tomato:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		return s;
	}
	
}