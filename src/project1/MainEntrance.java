package project1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEntrance {//1.Prints out a list of options the player may choose, with numbers next to
	                       //the options. Give 8 options here

	public static boolean isNumeric(String s) {
		if (s != null && !"".equals(s.trim()))
			return s.matches("^[0-9]*$");//tells whether or not the string matches the given
		else
			return false;
	}

	public static boolean isCharacter(String s) {
		if ((s != null) && !"".equals(s.trim()))
			return s.matches("^[a-zA-Z]*$");//tells whether or not the charater maches the given
		else
			return false;
	}

	public static void printCrop() {//print the  options of crops

		System.out.print("welcome aboard, there are 5 types crop seeds:\n 1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato each $2 \n"
						+ "please type the crop code number(other number will exit this step):\n");
	}

	public static void buyCrop() {//Read the numberof crops, purchase one crop and select the correct option
		printCrop();//2.Prompt the player to enter a number to complete an option.
		Scanner input1 = new Scanner(System.in);//input the number of crop options
		String index = input1.nextLine();//return the input and skip this line
		boolean isOutLoop = false;
		while (isOutLoop == false) {//command line of buyCrop
			if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 1)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();//parse the option number and skip the input  
				if (isNumeric(number)) {//parse the quantity number and skip the line
					Controller.buySeed(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}

	public static void printAnimal() {//print the options of animals
		System.out.print("there are 3 types animals:\n 1:Pig, 2:Hen, 3:Cow) each $2 \n"
				+ "please type the animal number\n");
	}

	public static void buyAnimal() {//read the number of animals,and select a number
		printAnimal();//2.Prompt the player to enter a number to complete an option.
		Scanner input1 = new Scanner(System.in);//input the number of animal options
		String index = input1.nextLine();//skip the input line
		boolean isOutLoop = false;//set isoutloop to false
		while (isOutLoop == false) { //commond line  of buyAnimals while isoutloop is false
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

	public static void printItem() {//print the options of items
		System.out.print("there are 3 types items:\n 1:AnimalFeedItems, 2:HappyAgentItems, 3:TimeAgentItems each $20 \n"
						+ "please type the items number \n");
	}

	public static void buyItems() {//read the number of items 

		printItem();//2.Prompt the player to enter a number to complete an option.
		Scanner input1 = new Scanner(System.in);// input the the number of item options
		String index = input1.nextLine();//skip the input line
		boolean isOutLoop = false;
		while (isOutLoop == false) {//command line of buyItems
			if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();//input the quantity number
				if (isNumeric(number)) {//the same as above 
					Controller.buyItems(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}

	public static void playWithAnimals() {//play with animals method,print first 
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);//2.Prompt the player to enter a number to complete an option.
		String index = input1.nextLine();//input the number of animal options

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.playWithAnimal(Integer.parseInt(index));//call  playWithAnimal from controller to parse the input number
		}

	}
	
	public static void feedAnimals() {//feed animals method,print animals firstly
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();//input the number of animal options

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.feedAnimal(Integer.parseInt(index));//call feedAnimal from controller to parse the number
		}
	}
	
	public static void usingHappyAgent() { //using happy agent method,print animals firstly
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  ,you can using this agent " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);//input the number of animal options
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.useHappyAgent(Integer.parseInt(index));//call useHappyAgent from controller to  parse the number
		}
	}
	
	public static void usingTimeAgent() {//using time agent method,print crops firstly
		System.out.print("there are 5 types crop seeds:  1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato " + "please type the crop number \n");
		Scanner input1 = new Scanner(System.in);//input the number of crop options
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 0)) {
			Controller.useTimeAgent(Integer.parseInt(index));//call usetTimeAgent from controller to parse the number
		}
	}

	public static void main(String[] args) {//main function 
		// TODO Auto-generated method stub
		String s = Controller.readFromFile();//read file 
		boolean isOutLoop = false;
		if (s == "") {//if the file is empty
			System.out.print("please input how many days do you want to play(5-10 days)：");
			Scanner input1 = new Scanner(System.in);
			String playDays = input1.nextLine();

			while (isOutLoop == false) {//command line of playdays
				if (isNumeric(playDays) && (Integer.parseInt(playDays) <= 10 && Integer.parseInt(playDays) >= 5)) {
					System.out.println("Thanks you select play " + playDays + " days \n");
					break;//selet a given play days from 5 to 10 days
				} else {
					System.out.print("please input how many days do you want to play(5-10 days)：");
					playDays = input1.nextLine();// choose a given play days from 5 to 10 days

				}
			}

			System.out.print("what's your farmer's name?(3-15 characters)");
			String farmerName = input1.nextLine();//give a farmer's name
			while (isOutLoop == false) {//command line  name the farmer , must matches the given length and charater

				if (isCharacter(farmerName) && (farmerName.length() <= 15 && farmerName.length() >= 3)) {
					System.out.println("Your farmer's name is " + farmerName);
					break;
				} else {
					System.out.print("what's your farmer's name?(3-15 characters)");
					farmerName = input1.nextLine();
				}
			}
			// diffrent types of farm have diffrent characteristics
			//2.Prompt the player to enter a number to complete an option.
			System.out.print("please select which types of farm do you like： \n");
			System.out.print("1： normal \n");
			System.out.print("2： crop which gorwth 20% than the noraml \n");//faster crop growth
			System.out.print("3： animal's happiness 20% more than normal \n");//more happiness animal
			System.out.print("4： base money 20% more than normal\n");//larger cash bonus
			String typeId = input1.nextLine();
			while (isOutLoop == false) {//command line should choose a type from four types

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
			String ss = typeId + "-" + farmerName + "-" + farmName + "-" + playDays;
			Controller.writeToFile(ss);//write the string to file 

			System.out.print(s);
			Controller.createFarm(Integer.parseInt(typeId), farmerName.toUpperCase(), farmName.toUpperCase(),
					Integer.parseInt(playDays));//start to adventure a farm. create a farm and parse the typeid,farmername,farmname and the play days
			//2.Prompt the player to enter a number to complete an option.
			// System.out.print(myFarm.toString());
			String sprint= "1:check store   2: buy items for farm 3: buy animals 4: buy crop seeds 5: play with animals 6: feed animal 7: decrease crop harvest time 8: make animals happier Other: Save and Exit\n";
			System.out.print(sprint);
			Scanner scanner = new Scanner(System.in);
			String strInput = scanner.nextLine();
			while (isOutLoop == false) {//command line application
				//2.Prompt the player to enter a number to complete an option.
				if (Integer.parseInt(strInput) == 1) {//(c) Parse the number and complete the action.
					Controller.showStore(); //4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered

				} else if (Integer.parseInt(strInput) == 2) {//(c) Parse the number and complete the action..
					buyItems();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} else if (Integer.parseInt(strInput) == 3) {//(c) Parse the number and complete the action.
					buyAnimal();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} else if (Integer.parseInt(strInput) == 4) {//(c) Parse the number and complete the action.
					buyCrop();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} 
				else if (Integer.parseInt(strInput) == 5) {//(c) Parse the number and complete the action.
					playWithAnimals();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} 
				else if (Integer.parseInt(strInput) == 6) {//(c) Parse the number and complete the action.
					feedAnimals();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} 
				else if (Integer.parseInt(strInput) == 7) {//(c) Parse the number and complete the action.
					usingTimeAgent();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} 
				else if (Integer.parseInt(strInput) == 8) {//(c) Parse the number and complete the action.
					usingHappyAgent();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} 
				else {//choose other numbers will write play configure to a file
					Controller.writePlayConfigureToFile();//4.Call the method relating to the option
					break;
				}	
			}
			
			System.out.print("thanks for your time to play games");
		} else {//else the file is not empty
			String[] p = s.split("-");
			int typeId = Integer.parseInt(p[0].trim());//parse the first number and set to type id
			String farmerName = p[1];//set the second element to farmername 
			String farmName = p[2];//set the third element to farmname
			int playDays = Integer.parseInt(p[3].trim());//parse the fourth element to playdays 
			Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
			Controller.readPlayConfigureFromFile();//create a farm and read play configure from file
			// System.out.print(myFarm.toString());
			String sprint= "1:check store   2: buy items for farm 3: buy animals 4: buy crop seeds 5: play with animals 6: feed animal 7: decrease crop harvest time 8: make animals happier Other: Save and Exit\n";
			System.out.print(sprint);
			Scanner scanner = new Scanner(System.in);
			String strInput = scanner.nextLine();
			while (isOutLoop == false) {//2.Prompt the player to enter a number to complete an option.

				if (Integer.parseInt(strInput) == 1) {//(c) Parse the number and complete the action
					Controller.showStore();//4.Call the method relating to the option
					System.out.print(sprint);// (a)Print out any information for that option
					strInput = scanner.nextLine();//(b)Read in the number for the information offered
				} else if (Integer.parseInt(strInput) == 2) {//(c) Parse the number and complete the action
					buyItems();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} else if (Integer.parseInt(strInput) == 3) {//(c) Parse the number and complete the action
					buyAnimal();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} else if (Integer.parseInt(strInput) == 4) {//(c) Parse the number and complete the action
					buyCrop();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 5) {//(c) Parse the number and complete the action
					playWithAnimals();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 6) {//(c) Parse the number and complete the action
					feedAnimals();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 7) {//(c) Parse the number and complete the action
					usingTimeAgent();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else if (Integer.parseInt(strInput) == 8) {//(c) Parse the number and complete the action
					usingHappyAgent();//4.Call the method relating to the option
					System.out.print(sprint);
					strInput = scanner.nextLine();
				} 
				else {
					Controller.writePlayConfigureToFile();//4.Call the method to write play configure  to file
					break;
				}	
			}
			
			System.out.print("thanks for your time to play games");
		}
		

	}

}
