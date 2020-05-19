package project1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/** Create a MainEntrance which contains a main method 
 * It Prints out a list of options the player may choose, 
 * with numbers next to the options. Give 8 options here */
public class MainEntrance {
	/** create isNumeric(String s) method 
	 * if the string is not null 
	 * return the string which tells whether 
	 * the charater maches the given or not 
	 * else return false  */
	public static boolean isNumeric(String s) {
		if (s != null && !"".equals(s.trim()))
			return s.matches("^[0-9]*$");
		else
			return false;
	}
	/** create isCharacter(String s) method 
	 * if the string is not null 
	 * return the string which tells whether 
	 * the charater maches the given or not
	 * else return false  */
	public static boolean isCharacter(String s) {
		if ((s != null) && !"".equals(s.trim()))
			return s.matches("^[a-zA-Z]*$");
		else
			return false;
	}
	/** print the  options of crops*/
	public static void printCrop() {

		System.out.print("welcome aboard, there are 5 types crop seeds:\n 1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato each $2 \n"
						+ "please type the crop code number(other number will exit this step):\n");
	}
	/** create a buyCrop() method  Read the serial number of crops, 
	 * purchase crop and select the correct option
	 * Prompt the player to enter a number to select an option.
	 * input the number of crop options
	 * get the index and skip this line
	 * while (isOutLoop == false) command line of buyCrop 
	 * if select the correct option and the number is between 1 and 5(include 1 and 5)
	 * Prompt the player to enter a number to complete an option 
	 * parse the option number and skip the input line  
	 * if the number is correct 
	 * call buySeed(Integer.parseInt(index), Integer.parseInt(number)) method */
	public static void buyCrop() {
		printCrop();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) {
			if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 1)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine(); 
				if (isNumeric(number)) {
					Controller.buySeed(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}
	/** print the options of animals */
	public static void printAnimal() {
		System.out.print("there are 3 types animals:\n 1:Pig, 2:Hen, 3:Cow) each $2 \n"
				+ "please type the animal number\n");
	}
	/** create a buyAnimal() method  Read the serial number of animals, 
	 * purchase animal and select the correct option
	 * Prompt the player to enter a number to select an option.
	 * input the number of animal options
	 * get the index and skip this line
	 * while (isOutLoop == false) command line of buyAnimal 
	 * if select the correct option and the number is between 1 and 3(include 1 and 3)
	 * Prompt the player to enter a number to complete an option 
	 * parse the option number and skip the input line  
	 * if the number is correct 
	 * call buyAnimal(Integer.parseInt(index), Integer.parseInt(number)) method */
	public static void buyAnimal() {
		printAnimal();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) { 
			if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 1)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();//input the quantity number
				if (isNumeric(number)) {
					Controller.buyAnimal(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}
	/** print the options of items*/
	public static void printItem() {
		System.out.print("there are 3 types items:\n 1:AnimalFeedItems, 2:HappyAgentItems, 3:TimeAgentItems each $20 \n"
						+ "please type the items number \n");
	}
	/** create a buyItems()method  Read the serial number of items, 
	 * purchase item and select the correct option
	 * Prompt the player to enter a number to select an option.
	 * input the number of item options
	 * get the index and skip this line
	 * while (isOutLoop == false) command line of buyItems 
	 * if select the correct option and the number is between 1 and 3(include 1 and 3)
	 * Prompt the player to enter a number to complete an option 
	 * parse the option number and skip the input line  
	 * if the number is correct 
	 * call buyAnimal(Integer.parseInt(index), Integer.parseInt(number)) method */
	public static void buyItems() {

		printItem();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) {
			if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();
				if (isNumeric(number)) {
					Controller.buyItems(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}
	/** create playWithAnimals() method
	 * Prompt the player to enter a number to select an option.
	 * input the number of animal options
	 * get the index 
	 * if select the correct option and the number is between 1 and 3(include 1 and 3)
	 * call feedAnimal(Integer.parseInt(index)) method */
	public static void playWithAnimals() {
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.playWithAnimal(Integer.parseInt(index));
		}

	}
	/** create feedAnimals()method
	 * Prompt the player to enter a number to select an option.
	 * input the number of animal options
	 * get the index 
	 * if select the correct option and the number is between 1 and 3(include 1 and 3)
	 * call feedAnimal(Integer.parseInt(index)) method */
	public static void feedAnimals() {
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.feedAnimal(Integer.parseInt(index));
		}
	}
	/** create usingHappyAgent() method
	 * Prompt the player to enter a number to select an option.
	 * input the number of animal options
	 * get the index 
	 * if select the correct option and the number is between 1 and 3(include 1 and 3)
	 * call useHappyAgent(Integer.parseInt(index)) method */
	public static void usingHappyAgent() { 
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  ,you can using this agent " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.useHappyAgent(Integer.parseInt(index));
		}
	}
	/** create usingTimeAgent() method
	 * Prompt the player to enter a number to select an option.
	 * input the number of crop options
	 * get the index 
	 * if select the correct option and the number is between 1 and 5(include 1 and 5)
	 * call useTimeAgent(Integer.parseInt(index)) method */
	public static void usingTimeAgent() {
		System.out.print("there are 5 types crop seeds:  1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato " + "please type the crop number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 0)) {
			Controller.useTimeAgent(Integer.parseInt(index));
		}
	}
    /** the main funtion 
     * get string from file 
     * if the file is empty
     * prompt the player to enter a number of playdays
     * input the number of playdays
     * get the playdays
     * while (isOutLoop == false) command line of main fuction
     * if select the correct playdays and the number is between 5 and 10(include 5 and 10)
     * print the playdays
     * else prompt the player and back to the fisrt step until select the correct number*/
	public static void main(String[] args) {
		
		String s = Controller.readFromFile();
		boolean isOutLoop = false;
		if (s == "") {
			System.out.print("please input how many days do you want to play(5-10 days)：");
			Scanner input1 = new Scanner(System.in);
			String playDays = input1.nextLine();

			while (isOutLoop == false) {
				if (isNumeric(playDays) && (Integer.parseInt(playDays) <= 10 && Integer.parseInt(playDays) >= 5)) {
					System.out.println("Thanks you select play " + playDays + " days \n");
					break;
				} else {
					System.out.print("please input how many days do you want to play(5-10 days)：");
					playDays = input1.nextLine();

				}
			}
			/** prompt the player to give the farmer a name 
			 *  input a name with (3-15 characters)
			 *  while (isOutLoop == false) 
			 *  if farmer's name is correct , the name must matches the given length and charater\
			 *  print the farmer's name
			 *  else back to the fisrt step,until input the correct name*/
			System.out.print("what's your farmer's name?(3-15 characters)");
			String farmerName = input1.nextLine();
			while (isOutLoop == false) {

				if (isCharacter(farmerName) && (farmerName.length() <= 15 && farmerName.length() >= 3)) {
					System.out.println("Your farmer's name is " + farmerName);
					break;
				} else {
					System.out.print("what's your farmer's name?(3-15 characters)");
					farmerName = input1.nextLine();
				}
			}
			/** diffrent types of farm have diffrent characteristics
			 *  Prompt the player to enter a number to select a type of farm.
			 *  normal farm
			 *  faster crop growth
			 *  more happiness animal
			 *  larger cash bonus
			 *  get the typeId
			 *  command line should choose a type from four types
			 *  */ 
			
			System.out.print("please select which types of farm do you like： \n");
			System.out.print("1： normal \n");
			System.out.print("2： crop which gorwth 20% than the noraml \n");
			System.out.print("3： animal's happiness 20% more than normal \n");
			System.out.print("4： base money 20% more than normal\n");
			String typeId = input1.nextLine();
			while (isOutLoop == false) {

				if (isNumeric(typeId) && (Integer.parseInt(typeId) <= 4 && Integer.parseInt(typeId) >= 1)) {
					System.out.println("You choose the " + typeId + " type farm");
					break;
				} else {
					System.out.print("please select which types of farm do you like： \n");
					System.out.print("1： normal \n");
					System.out.print("2： crop which gorwth 20% than the noraml \n");
					System.out.print("3： animal's happiness 20% more than normal \n");
					System.out.print("4： base money 20% more than normal\n");
					typeId = input1.nextLine();
				}

			}

			/** prompt the player to give the farm a name 
			 *  input a name with (3-15 characters)
			 *  while (isOutLoop == false) 
			 *  if farm's name is correct , the name must matches the given length and charater\
			 *  print the farm's name
			 *  else back to the fisrt step,until input the correct name*/
			System.out.print("what's your farm's name?(3-15 characters)\n");
			String farmName = input1.nextLine();
			while (isOutLoop == false) {//command line should give the farm a name which mathces  ischaracter and the length

				if (isCharacter(farmName) && (farmName.length() <= 15 && farmName.length() >= 3)) {
					System.out.println("Your farm  name is " + farmName);
					break;
				} else {
					System.out.print("what's your farm's name?(3-15 characters)");
					farmName = input1.nextLine();
				}
			}
			/** write the "typeId + "-" + farmerName + "-" + farmName + "-" + playDays" string
			 * to file */
			String ss = typeId + "-" + farmerName + "-" + farmName + "-" + playDays;
			Controller.writeToFile(ss);
		    /** print the above string*/
			System.out.print(s);
			/** call createFarm(Integer.parseInt(typeId), farmerName.toUpperCase(), 
			 * farmName.toUpperCase(),Integer.parseInt(playDays))  method start adventrue
			 * Prompt the player to enter a seria number to choose an option.
			 * get the */
			Controller.createFarm(Integer.parseInt(typeId), farmerName.toUpperCase(), farmName.toUpperCase(),
					Integer.parseInt(playDays));
			
			/** prompt the player to enter an action from the following nine options
			 * input the number that the player would like to 
			 * while (isOutLoop == false) command line application  
			 * there are nine conditions 
			 */
			String sprint= "1:check store   2: buy items for farm 3: buy animals 4: buy crop seeds 5: play with animals 6: feed animal 7: decrease crop harvest time 8: make animals happier Other: Save and Exit\n";
			System.out.print(sprint);
			Scanner scanner = new Scanner(System.in);
			String strInput = scanner.nextLine();
			while (isOutLoop == false) {
				/** if the entered number is one,parse one
				 * call showStore() method
				 * print detail of store 
				 * get the number*/
				if (Integer.parseInt(strInput) == 1) {
					Controller.showStore(); 
					System.out.print(sprint);
					strInput = scanner.nextLine();
					
				/** if the entered number is two,parse two
				 * call buyItems() method
				 * print detail of buyItems
				 * get the number*/
				} else if (Integer.parseInt(strInput) == 2) {
					buyItems();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				/** if the entered number  is three ,parse three
				  * call buyAnimal() method
				  * print detail of buyItems
				  * get the number*/
				} else if (Integer.parseInt(strInput) == 3) {
					buyAnimal();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				/** if the enter number is four, parse four
				  * call buyCrop() method
				  * print detail of buyCrop
				  * get the number*/	
				} else if (Integer.parseInt(strInput) == 4) {
					buyCrop();
					System.out.print(sprint);
					strInput = scanner.nextLine();
					
				/** if the enter number is five, parse five
				  * call playWithAnimals() method
				  * print detail of playWithAnimals
				  * get the number*/
				} else if (Integer.parseInt(strInput) == 5) {
					playWithAnimals();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				/** if the enter number is six, parse six
				  * call feedAnimals() method
				  * print detail of feedAnimals
				  * get the number*/
				else if (Integer.parseInt(strInput) == 6) {
					feedAnimals();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				}
				/** if the enter number is seven, parse seven
				  * call usingTimeAgent() method
				  * print detail of usingTimeAgent
				  * get the number*/
				else if (Integer.parseInt(strInput) == 7) {
					usingTimeAgent();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				/** if the enter number is eight, parse eight
				  * call usingHappyAgent() method
				  * print detail of usingHappyAgent
				  * get the number*/
				else if (Integer.parseInt(strInput) == 8) {
					usingHappyAgent();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				/** else the enter number is not the above , parse this number
				  * call writePlayConfigureToFile() method
				 */
				else {
					Controller.writePlayConfigureToFile();
					break;
				}	
			}
			/** once finish the game,print a sentence*/
			System.out.print("thanks for your time to play games");
		/** if the file is not empty
		 * read the file as a string  parse the first element and set to type id
		 * set the second element to farmername 
		 * set the third element to farmname
		 * parse the fourth element to playdays 
		 * call createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays)
		 * call readPlayConfigureFromFile() method
		 */
		} else {
			String[] p = s.split("-");
			int typeId = Integer.parseInt(p[0].trim());
			String farmerName = p[1];
			String farmName = p[2];
			int playDays = Integer.parseInt(p[3].trim());
			Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
			Controller.readPlayConfigureFromFile();
			
			/** prompt the player to enter an action from the following nine options
			 * input the number that the player would like to 
			 * while (isOutLoop == false) command line application  
			 * there are nine conditions 
			 * do the following actions as above
			 */

			String sprint= "1:check store   2: buy items for farm 3: buy animals 4: buy crop seeds 5: play with animals 6: feed animal 7: decrease crop harvest time 8: make animals happier Other: Save and Exit\n";
			System.out.print(sprint);
			Scanner scanner = new Scanner(System.in);
			String strInput = scanner.nextLine();
			while (isOutLoop == false) {
		
				if (Integer.parseInt(strInput) == 1) {
					Controller.showStore();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} else if (Integer.parseInt(strInput) == 2) {
					buyItems();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} else if (Integer.parseInt(strInput) == 3) {
					buyAnimal();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} else if (Integer.parseInt(strInput) == 4) {
					buyCrop();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 5) {
					playWithAnimals();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 6) {
					feedAnimals();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 7) {
					usingTimeAgent();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 8) {
					usingHappyAgent();
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else {
					Controller.writePlayConfigureToFile();
					break;
				}	
			}
			
			System.out.print("thanks for your time to play games");
		}
		

	}

}
