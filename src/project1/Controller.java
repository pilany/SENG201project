package project1;

import java.io.BufferedReader; //read text from file input stream
import java.io.BufferedWriter; //write text to output stream
import java.io.FileInputStream;//obtains a file 
import java.io.FileReader;     //read text from file
import java.io.FileWriter;     //write text to file
import java.io.IOException;    // provide exception
import java.io.InputStreamReader;//read bite and decode them into charactor
import java.util.Random;       //random class

import lab7.Observable;

import java.lang.Math;
/**create a controller class to manage farm and farmer
 * when player want to create a farm,which need input 
 * some charaters or numbers.Thus the game need provide 
 * some function that can record some information for 
 * the player.
 * */
public class Controller {
	/**initialise myFarm
	 * initialise myFarmer
	 * initialise playDays
	 * initialise currentDay 
	 * initialise farmType
	 * initialise crops to "Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"
	 * initialise animals to "Pig", "Hen", "Cow"
	 * initialise items to "AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"
	 * create a Items's variable   */
	static Farm myFarm ;   //manage the farm class
	static Farmer myFarmer;//manage the farmer class
	static int playDays;   //when the game fisrt start it should ask the player how many days 
	                       //they would like the game to last(5 -10days)
	static int currentDay; 
	static int farmType;   //four types of farm 
	static String[] crops = {"Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};//five crops
	static String[] animals = {"Pig", "Hen", "Cow"};//three animals
	static String[] items = {"AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"};//three items
	
	/**(a) The wells have dried up, and the crops are thirsty.
	 * (b) The player loses half of their growing crops. The
	 *     exact crops are determined randomly.*/
	public  void drought() {
		Random random = new Random(); 
		int i = random.nextInt(5);
		myFarm.lostCrop(crops[i - 1]);
		
	}
	
	/** (a) One or more of your animals have escaped through a
	 *      broken fence.
	 *  (b) The player loses one or more of their 
	 *      animals, the exact number	determined randomly.
	 *  (c) The remaining animals lose a substantial amount of happiness.*/
	public static void brokenfence() {
		Random random = new Random();
		int i2 = random.nextInt(3);
		
		
	}
	/**(a) Your farm has won the top award at the annual county fair.
	 * (b) The player earns a reasonable sum of money.
	 * (c) The amount of money earned should be scaled by the 
	 * 	   number of crops and animals the farm contains.*/
	public static void countyFair() {
		Random random = new Random();
		int i2 = random.nextInt(100);
		
	}
		
	/**creating the farm,give the farm a name*/
	public static void createFarm(int typeId, String farmerName, String farmName, int nPlayDays)
	{
		/**create a new Farm object to myFarm
		 * print the name of myFarme 
		 * create a new Farmer obeject to myFarmer
		 * initialise PlayDays
		 * initialise farmType
		 * initialise currentDay to one */
		myFarm = new Farm(typeId,farmName.toUpperCase() ); //name the farm ,the length of name (3-15characters)
		System.out.print(myFarm.toString());//print the name of farm
		myFarmer = new Farmer(farmerName);//name the farmer
		playDays = nPlayDays; // initialise playdays
		farmType = typeId; //initialise farmtype
		currentDay = 1; //initialise the currentday
		
	}
	
	
	/** create a moveToNextDay() method
	 * calculate the cureentday  which is based on the last day plus 1
	 * call setIsChangeDay() method from farm
	 *@param  boolean isChanged  parse the boolean to check it is change or not*/
	public static void moveToNextDay()
	{
		currentDay ++; 
		myFarm.setIsChangeDay(true); 	
	}
	/**create a playWithAnimal(int index) method 
	 * Select the type of farm you would like to own.
	 * create one action for the farmer
	 * try call playWithAnimal(animals[index-1], myFarm) from calss of Farmer
	 * print a string "You have played with  " + animals[index-1] + " for a while\n"
	 * catch a exception
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void playWithAnimal(int index)//action 1,player should be able to
	                                            //perform the following activities
	{
		try {
			
				myFarmer.playWithAnimal(animals[index-1], myFarm);//play with animals,decrease one to the index 
				System.out.print("You have played with  " + animals[index-1] + " for a while\n");
			
		} catch (IOException e) {
			// return the string of throwable
			System.out.print(e.getMessage());
		}
		
	}
	/**create a feedAnimal(int index) method 
	 * try call feedAnimal(animals[index-1], myFarm) from calss of Farmer
	 * print a string "You have played with  " + animals[index-1] + " for a while\n"
	 * catch a exception
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void feedAnimal(int index)//action2 ,feed animals
	{
		try {		
			myFarmer.feedAnimal(animals[index-1], myFarm);
			System.out.print("You have played with  " + animals[index-1] + " for a while\n");		
		} catch (IOException e) {
		
		System.out.print(e.getMessage());
		}
	}
	/**create a useTimeAgent(int index) method 
	 * try call useTimeAgent(animals[index-1], myFarm) from calss of Farmer
	 * print a string "You have played with  " + animals[index-1] + " for a while\n"
	 * catch a exception
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void useTimeAgent(int index)//action3,use timeagent,to increase the crops growth
	{
		try {		
			myFarmer.useTimeAgentItem(crops[index-1], myFarm);
			System.out.print("You have used the timeAgentItem to " + crops[index-1] + "\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}
	/**create a useHappyAgent(int index) method 
	 * try call useHappyAgent(animals[index-1], myFarm) from calss of Farmer
	 * print a string "You have played with  " + animals[index-1] + " for a while\n"
	 * catch a exception
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void useHappyAgent(int index) {    //action4, use happy agent to make animal happier
		try {		
			myFarmer.useHappyAgentItem(animals[index-1], myFarm);
			System.out.print("You have used happyAgentItem to   " + animals[index-1] + "\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}
	
	/**create a buySeed(int index, int count) method 
	 * try  print "need to buy " + count + " seeds\n" first
	 * trverse each number of count
	 * call buySeed(crops[index-1], myFarm) from calss of Farmer
	 * print a string "you bought " + crops[index - 1] + " count:" 
	 * + count + ", there are " + myFarm.getMoney()+ " dollars left\n"
	 * catch a exception
	 * @param count    parse to decreaseMoney() method from Farm to 
	 * count the left money  
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void buySeed(int index, int count) {	// action 5,start the game ,there are 8 options to choose,
		                        //the first thing that the player have to do is purchasing the crops seed 
		try {
			System.out.print("need to buy " + count + " seeds\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buySeed(crops[index - 1], myFarm);
			}
			System.out.print("you bought " + crops[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
	/**create a buyAnimal(int index, int count) method 
	 * try  print "need to buy " + count + "animals\n" first
	 * trverse each number of count
	 * call buyAnimal(animals[index - 1], myFarm) from calss of Farmer
	 * print a string "you bought " + animals[index - 1] + " count:" 
	 * + count + ", there are " + myFarm.getMoney()+ " dollars left\n"
	 * catch a exception
	 * @param count    parse to decreaseMoney() method from Farm to 
	 * count the left money  
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void buyAnimal(int index, int count) {//action 6
		try {
			System.out.print("need to buy " + count + "animals\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyAnimal(animals[index - 1], myFarm);
			}
			System.out.print("you bought " + animals[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
	/**create a buyItems(int index, int count) method 
	 * try  print "need to buy " + count + "items\n" first
	 * trverse each number of count
	 * call buyAnimal(items[index - 1], myFarm) from calss of Farmer
	 * print a string "you bought " + items[index - 1] + " count:" 
	 * + count + ", there are " + myFarm.getMoney()+ " dollars left\n"
	 * catch a exception
	 * @param count    parse to decreaseMoney() method from Farm to 
	 * count the left money  
	 * @param index-1  the index of animal's name,need minus 1  */
	public static void buyItems(int index, int count) { //action7
		try {
			System.out.print("need to buy " + count + "items\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyItems(items[index - 1], myFarm);
			}
			System.out.print("you bought " + items[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

	
	/** Show what items the player currently owns, their amounts, and the
	 * amount of money the player has.*/
	public static void showStore()
	{
		/** show the amount of crops*/
		System.out.print( "You have\n crops:  ");
		for(int i = 0; i<5; i++)
		{
			System.out.print( crops[i] + ":"+ myFarmer.countCrops(crops[i], myFarm) +"   " );
			//writeToFile(crops[i]+ "-"+ myFarmer.countCrops(crops[i], myFarm));
		}
		System.out.print( "\n");
		/** show the amount of animals*/
		System.out.print("animals:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(animals[i] + ":"+ myFarmer.countAnimal(animals[i], myFarm) +"   " );
			//writeToFile(animals[i]+ "-"+ myFarmer.countAnimal(animals[i], myFarm));
		}
		System.out.print( "\n");
		/** show the amount of items*/
		System.out.print("items:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(items[i] + ":" + myFarmer.countItems(items[i], myFarm) + "  " );
			//writeToFile(items[i]+ "-"+ myFarmer.countItems(items[i], myFarm));
		}
		System.out.print( "\n");
		
	}


	
	/** create a readFromFile() method 
	 * try to create a new FileReader object
	 * while the character is not the last one 
	 * read each character
	 * close readFromFile() 
	 * catch  exception 
	 * return the file as a string*/
 	public static String readFromFile() {
		String s ="";
		 try {
			 	
	            FileReader reader = new FileReader("farm.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                s += (char)character;
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return s;
		 
	}
	/**write  play configure to a new file
	 * get a string  of left money from farm  
	 * get a string  of the detail of three items from farmer 
	 * get a string  of the detail of animal  from farmer
	 * get a string  of the detail of crop from farmer 
	 * try to do:
	 * construct a FileWriter given a file name and a boolean 
	 * indicating whether to append the data written,using the 
	 * platfom's default charset */
	public static void writePlayConfigureToFile() {
		String s ="";
		s= "money-" + myFarm.getMoney()+"\n";
		s+= myFarmer.getItemDetail(myFarm);
		s+= myFarmer.getAniamlDetail(myFarm);
		s+= myFarmer.getCropDetail(myFarm);
		 System.out.println(s);
		try {
            FileWriter writer = new FileWriter("play.txt", false);//write to the play file
            BufferedWriter bufferWritter = new BufferedWriter(writer);//create a output stream
            bufferWritter.write(s);
            bufferWritter.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	/** create a  readPlayConfigureFromFile() method 
	 * create a FileInputStream by opening a connection to an actual file
	 * the file named by the path name in the file System. A new FileDescriptor object is created
	 * to represent this file connection.first,if there is a security manager,its checkRead method 
	 * is called with the name argument as its argument
	 * if the named file does not exist,is a directoty rather than a regular file,or for some other 
	 * reason cannot be opened for reading then a FileException is thrown
	 * read line by line 
	 * if the line contains "money" ,call setMoney(Double.parseDouble(line[1]))
	 * from the class of Farm  */
	public static void readPlayConfigureFromFile() {//read  play configure from file
		try {
		FileInputStream inputStream = new FileInputStream("play.txt");//open the play file
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
		String str = null;
		while((str = bufferedReader.readLine()) != null)//read line by line
		{
			//System.out.println(str);
			String[] line = str.split("-");
			if(line[0].equals("money"))
			{
				//System.out.println("money");
				myFarm.setMoney(Double.parseDouble(line[1]));//return a new initialised money to set as money
			}
			if(line[0].equals("Items")) {
				//System.out.println("Items");
				myFarmer.addConfigureItems(line[1], myFarm);//add configure items 
			}
			if(line[0].equals("Animals")) {
				//System.out.println("Animals");
				myFarmer.addConfigureAnimal(line[1], myFarm);//add configure animals
			}
			if(line[0].equals("Crop")) {
				//System.out.println("Crop");
				myFarmer.addConfigureSeed(line[1], myFarm);//add configure crops
			}
			
		}
			
		//close
		inputStream.close();
		bufferedReader.close();
		}
		catch(IOException e)
		{
			System.out.print(e.getMessage());
		}
	}
	/** create a writeToFile(String s) method 
	 * try to do 
	 * */
	public static void writeToFile(String s) {
		try {
            FileWriter writer = new FileWriter("farm.txt", false);
            writer.write(s);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}