package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		while(true)
		{
			String userIn = "";
			userIn = welcome(userIn);
//			System.out.println(newPlayer.getFiftyFifty());
//			System.out.println(newPlayer.getDoubleDip());
//			System.out.println(newPlayer.getSkip());
			
//			enterToContinue();
			
			switch(userIn)
			{
				case "1":
					System.out.println("Enter your name");
					Scanner scan=new Scanner(System.in);
					String name=scan.next();
					Player newPlayer = new Player(name);
					System.out.println(name.toUpperCase()+" you chose: " + userIn);
					ArrayList<Question> Qlist = new ArrayList<>();
					newPlayer = gameDriver(newPlayer , Qlist , 1);
					break;
				case "2":
					rules();
					break;
				case "3":
					System.out.println("Goodbye :)");
					System.exit(0);
			}
			//System.out.println("\n \\\\End");
			//break;
		}

	}

	

	private static String welcome(String userIn) {
		
		System.out.println(" ______ ________ ________ _______ _____");
		System.out.println("|      *        *        *       *     |");
		System.out.println("|  *        *       *        *       * |");
		System.out.println("|    WHO WANTS TO BE A MILLIONAIRE     |");
		System.out.println("|      *        *        *       *     |");
		System.out.println("|  *        *       *        *       * |");
		System.out.println("|______*________*________*_______*_____|\n\n");
		
		System.out.println("Please select from one of the following options:");
		System.out.println("1. New Game");
		System.out.println("2. Rules");
		System.out.println("3. Exit");
		System.out.print("Enter a number for your selection: \n");
		
		userIn = inputHandeling(userIn , 1);
		
		return userIn;
		
	}

	private static String inputHandeling(String userIn, int method) {
		while (true) {
			
			try {
				Scanner in = new Scanner(System.in);
				userIn = in.next().toLowerCase();
				
				//Method calling inputHandeling
				if(method == 1) //Welcome Method
				{
					if(!userIn.equals("1") && 
					   !userIn.equals("2") &&
					   !userIn.equals("3"))
					{
						System.out.println("Please enter either 1 , 2 , or 3 for your selection");
						continue;
					}
					else
					{
						break;
					}
				}
				else if(method == 2) //game driver
				{
					if(!userIn.equals("a") && 
					   !userIn.equals("b") &&
					   !userIn.equals("c") &&
					   !userIn.equals("d") &&
					   !userIn.equals("*"))
					{
						System.out.println("Please enter either A , B , C , D for your answer");
						System.out.println("Enter the astrisks key * for lifelines");
						continue;
					}
					else
					{
						//System.out.println("input success");
						break;
					}
				}
				else if(method == 3) //lifelines
				{
					if(!userIn.equals("1") && 
						!userIn.equals("2") &&
						!userIn.equals("3") &&
						!userIn.equals("*"))
					{
						System.out.println("Please enter either 1 , 2 , or 3 for your selection");
						System.out.println("Enter * to cancel");
						continue;
					}
					else
					{
						//System.out.println("input success");
						break;
					}
				}
				else if(method == 4) //fiftyFify
				{
					if(!userIn.equals("a") && 
					   !userIn.equals("b") &&
					   !userIn.equals("*"))
					{
						System.out.println("Please enter either A , or B for your answer");
						System.out.println("Enter the astrisks key * for lifelines");
						//System.out.println("Enter the astrisks key * for lifelines");
						continue;
					}
					else
					{
						//System.out.println("input success");
						break;
					}
				}
				
				
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("Incorrect input");
			}
		}
		
		/*
		switch(method)
		{
			case 1:
				System.out.println(userIn + " : userIn from Welcome Method : " + method);
				break;
			case 2:
				System.out.println(userIn + " : userIn from gameDriver Method : " + method);
				break;
			case 3:
				System.out.println(userIn + " : userIn from lifeline Method : " + method);
				break;
			case 4:
				System.out.println(userIn + " : userIn from fiftyFifty Method : " + method);
				break;
		}
		*/
		return userIn;
		
	}
	
	private static void enterToContinue() 
	{
		
		System.out.println("Press enter to continue...");
		//inputHandeling(str, 5);
		try{        
			System.in.read();
			
			}
		catch(Exception e){	
			e.printStackTrace();
			}
	}


	
	private static void rules() throws IOException {
		
//		File file = new File("rules.txt");
//		Scanner in = new Scanner(System.in);
//		try (BufferedReader br = new BufferedReader(new FileReader("rules.txt"))) {
//			
//			String str = null;
//			while((str = br.readLine()) != null) 
//			{
//				System.out.println(str);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("rules.txt not found");
//			e.printStackTrace();
//		}
		List<String> list = FileUtils.readTextFromJar("/resources/rules.txt");
	    Iterator<String> it = list.iterator();
	    while(it.hasNext()) 
	    {
	      System.out.println(it.next());
	    }

	    
		//System.out.println("Press any key to continue");
	    enterToContinue();
		
	}

	

	private static Player gameDriver(Player newPlayer, ArrayList<Question> Qlist, int qValue) throws IOException {
		
		
		if(qValue > 15)
		{
			System.out.println("You Won!!!!");
			enterToContinue();
			return newPlayer;
		}
		String questionValue = "";
		String qValueDisplay = "";
		boolean correct = false;
		
//		System.out.println(newPlayer.getFiftyFifty());
//		System.out.println(newPlayer.getDoubleDip());
//		System.out.println(newPlayer.getSkip());
//		
		//enterToContinue();
		
		switch(qValue)
		{
			case 1:
				qValueDisplay = "$100";
				//System.out.println("$100 Question");
				questionValue = "Qlist1.txt";
				break;
			case 2:
				qValueDisplay = "$200";
				//System.out.println("$200 Question");
				questionValue = "Qlist2.txt";
				break;
			case 3:
				qValueDisplay = "$300";
				System.out.println("$300 Question");
				questionValue = "Qlist3.txt";
				break;
			case 4:
				qValueDisplay = "$500";
				//System.out.println("$500 Question");
				questionValue = "Qlist4.txt";
				break;
			case 5:
				qValueDisplay = "$1,000";
				//System.out.println("$1000 Question");
				questionValue = "Qlist5.txt";
				break;
			case 6:
				qValueDisplay = "$2,000";
				//System.out.println("$2000 Question");
				questionValue = "Qlist6.txt";
				break;
			case 7:
				qValueDisplay = "$4,000";
				//System.out.println("$4000 Question");
				questionValue = "Qlist7.txt";
				break;
			case 8:
				qValueDisplay = "$8,000";
				//System.out.println("$8000 Question");
				questionValue = "Qlist8.txt";
				break;
			case 9:
				qValueDisplay = "$16,000";
				//System.out.println("$16000 Question");
				questionValue = "Qlist9.txt";
				break;
			case 10:
				qValueDisplay = "$32,000";
				//System.out.println("$32000 Question");
				questionValue = "Qlist10.txt";
				break;
			case 11:
				qValueDisplay = "$64,000";
				//System.out.println("$64000 Question");
				questionValue = "Qlist11.txt";
				break;
			case 12:
				qValueDisplay = "$125,000";
				//System.out.println("$125000 Question");
				questionValue = "Qlist12.txt";
				break;
			case 13:
				qValueDisplay = "$250,000";
				//System.out.println("$250000 Question");
				questionValue = "Qlist13.txt";
				break;
			case 14:
				qValueDisplay = "$500,000";
				//System.out.println("$500000 Question");
				questionValue = "Qlist14.txt";
				break;
			case 15:
				qValueDisplay = "$1,000,000";
				//System.out.println("$1000000 Question");
				questionValue = "Qlist15.txt";
				break;
		}
		
		loadList(Qlist , questionValue);
		Question selectedQuestion = new Question();
		Random rand = new Random();
		int randomNum = rand.nextInt(Qlist.size());
		selectedQuestion = Qlist.get(randomNum);
		Qlist.remove(randomNum);	//Remove from list for easy "new question" lifeline
		
		while(true)
		{
			System.out.println(qValueDisplay + " question\t Bank: " + newPlayer.getBank()+"\tLife-Lines Left: "+newPlayer.lifeLineLeft()+"\n");
			System.out.println(selectedQuestion.printQuestionAnswers()); //Display the questions with the answers
	
			String userIn = "";
			userIn = inputHandeling(userIn, 2);
			if(userIn.equals("*"))
			{
				
				if((newPlayer.getFiftyFifty()) == 1 ||
				   (newPlayer.getDoubleDip()) == 1 ||	
				   (newPlayer.getSkip()) == 1 )
				{
					userIn = lifelines(newPlayer , userIn);
					if(userIn.equals("1"))
					{
						if(newPlayer.getFiftyFifty() != 0)
						{
							newPlayer.setFiftyFifty(0);
							userIn = fiftyFifty(selectedQuestion);
							if(userIn.equals("*") && 
								((newPlayer.getDoubleDip()) == 1 ||	
							    (newPlayer.getSkip()) == 1 ))
							{
								userIn = lifelines(newPlayer , userIn);
								if(userIn.equals("2"))
								{
									if(newPlayer.getDoubleDip() != 0)
									{
										newPlayer.setDoubleDip(0);
										randomNum = rand.nextInt(Qlist.size());
										selectedQuestion = Qlist.get(randomNum);
										continue;
									}
									else
									{
										System.out.println("You do not have a Double Dip lifeline left.");
										continue;
									}
								}
								else if(userIn.equals("3"))
								{
									if(newPlayer.getSkip() != 0)
									{
										newPlayer = addMoney(newPlayer , qValue);
										newPlayer.setSkip(0);
										qValue += 1;
										Qlist.clear();
										gameDriver(newPlayer , Qlist, qValue);
									}
									else
									{
										System.out.println("You do not have a Skip lifeline left");
										continue;
									}
								}
								else
								{
									continue;
								}
							}
							else
							{
								if(userIn.equals("$"))
								{
									newPlayer = addMoney(newPlayer , qValue);
									qValue += 1;
									Qlist.clear();
									gameDriver(newPlayer , Qlist, qValue);
								}
								else
								{
									System.out.println("Sorry you didn't win! Please Try again.");
									return newPlayer;
								}
							}
							
						}
						else
						{
							System.out.println("You do not have a 50/50 lifeline left.");
							continue;
						}
					}
					else if(userIn.equals("2"))
					{
						if(newPlayer.getDoubleDip() != 0)
						{
							newPlayer.setDoubleDip(0);
							randomNum = rand.nextInt(Qlist.size());
							selectedQuestion = Qlist.get(randomNum);
							continue;
						}
						else
						{
							System.out.println("You do not have a Double Dip lifeline left.");
							continue;
						}
						
					}
					else if(userIn.equals("3"))
					{
						if(newPlayer.getSkip() != 0)
						{
							newPlayer = addMoney(newPlayer , qValue);
							newPlayer.setSkip(0);
							qValue += 1;
							Qlist.clear();
							gameDriver(newPlayer , Qlist, qValue);
						}
						else
						{
							System.out.println("You do not have a Skip lifeline left");
							continue;
						}
					}
					else
					{
						continue;
					}
				}
				else
				{
					System.out.println("You do not have any lifelines left");
					continue;
				}
				
			}
			
			userIn = checkPlayerAnswer(userIn, selectedQuestion, 1);
			if(userIn.equals("$"))
			{
				newPlayer = addMoney(newPlayer, qValue);
				qValue += 1;
				Qlist.clear();
				Scanner scan=new Scanner(System.in);
				System.out.println("Press Enter to continue or press X to walk away with $"+newPlayer.bank);
				String option=scan.nextLine();
				if(option.compareToIgnoreCase("x")==0)
				{
					System.out.println("You have won $"+newPlayer.bank);
					enterToContinue();
				}
				else 
				{
					gameDriver(newPlayer , Qlist, qValue);
				}
			}
			else if(userIn.equals("!"))
			{
				System.out.println("I'm sorry but that was not correct");
				if(newPlayer.bank<1000)
				{
					newPlayer.setBank(0);
					System.out.println("You are walking away with $"+ newPlayer.getBank());
				}
				else if(newPlayer.bank>1000 &&newPlayer.bank<32000)
				{
					newPlayer.setBank(1000);
					System.out.println("You are walking away with $"+ newPlayer.getBank());
				}
				else if(newPlayer.bank>32000 &&newPlayer.bank<1000000)
				{
					newPlayer.setBank(32000);
					System.out.println("You are walking away with $"+ newPlayer.getBank());
					
				}
				enterToContinue();
			}
			break;
		}
		
//		for(Question qObject : Qlist)
//		{
//			System.out.println(qObject.toString());
//		}
		
		return newPlayer;
	}


	private static Player addMoney(Player newPlayer, int qValue) {
		switch(qValue)
		{
			case 1:
				newPlayer.setBank(100);
				break;
			case 2:
				newPlayer.setBank(200);
				break;
			case 3:
				newPlayer.setBank(300);
				break;
			case 4:
				newPlayer.setBank(500);
				break;
			case 5:
				newPlayer.setBank(1000);
				break;
			case 6:
				newPlayer.setBank(2000);
				break;
			case 7:
				newPlayer.setBank(4000);
				break;
			case 8:
				newPlayer.setBank(8000);
				break;
			case 9:
				newPlayer.setBank(16000);
				break;
			case 10:
				newPlayer.setBank(32000);
				break;
			case 11:
				newPlayer.setBank(64000);
				break;
			case 12:
				newPlayer.setBank(125000);
				break;
			case 13:
				newPlayer.setBank(250000);
				break;
			case 14:
				newPlayer.setBank(500000);
				break;
			case 15:
				newPlayer.setBank(1000000);
				break;
		}

		return newPlayer;
	}



	private static String lifelines(Player newPlayer, String userIn) {
		
		
		while(true)
		{
			System.out.println("Select from one of you lifelines");
			System.out.println("1. 50/50\t" + newPlayer.getFiftyFifty());
			System.out.println("2. Double Dip\t" + newPlayer.getDoubleDip());
			System.out.println("3. Skip\t\t" + newPlayer.getSkip());
			System.out.println("Enter * to cancel");
			userIn = inputHandeling(userIn, 3);
			
			switch(userIn)
			{
				case "1":
					if(newPlayer.getFiftyFifty() != 1)
					{
						System.out.println("You do not have a 50/50 left");
						continue;
					}
					else
					{
						return userIn;
					}
				case "2":
					if(newPlayer.getDoubleDip() != 1)
					{
						System.out.println("You do not have a Double Dip left");
						continue;
					}
					else
					{
						return userIn;
					}	
				case "3":
					if(newPlayer.getSkip() != 1)
					{
						System.out.println("You do not have a Skip left");
						continue;
					}
					else
					{
						return userIn;
					}
				case "*":
						return userIn;
					
			}
		}
		
	
		
	}
	
	

	private static String fiftyFifty(Question selectedQuestion) {
		ArrayList<String> answers = new ArrayList<String>(); //initialize ArrayList to hold answers from selectedQuestion
		String userIn = "";
		
		for(int i = 0; i < 5; i++) //pull answer attributes from selectedQuestion 
		{
			switch(i) //index 0 - 4 for answers and correct answer reference at end
			{
				case 0:
					answers.add(selectedQuestion.getAnswer1());//pull attribute answer1 and copy to answer ArrayList of Strings
					break;
				case 1:
					answers.add(selectedQuestion.getAnswer2());
					break;
				case 2:
					answers.add(selectedQuestion.getAnswer3());
					break;
				case 3:
					answers.add(selectedQuestion.getAnswer4());
					break;
				case 4:
					answers.add(selectedQuestion.getCorrect());
					break;
			}
		}
		
		int randomAnswer; //random number for index reference of answers ArrayList
		Random rand = new Random();
		
		while(true)
		{
			//generate a random index number from 0 - size of answer array excluding correct answer
			randomAnswer = rand.nextInt(answers.size()); 
			if(!answers.get(randomAnswer).equals(selectedQuestion.getCorrect())) //Check to see that the possible answer at index randomAnswer is not the correct answer
			{
				answers.remove(randomAnswer); //Answer at index is not the correct answer so delete.Shrink size() by 1
				if(answers.size() == 3) //answer arrayList should have size 3 after successful deletion of... 
				{						//two possible wrong answers(2 possible answers and correct answer reference)
					break;
				}
			}
		}
		
		selectedQuestion.setAnswer1(answers.get(0));
		selectedQuestion.setAnswer2(answers.get(1));
		
		System.out.println(selectedQuestion.getQuestions());
		for(int i = 0; i < 2; i++) //Print all but correct answer reference at end of answer ArrayList
		{
			if(i == 0)
			{
				System.out.print("A)");
			}
			if(i == 1)
			{
				System.out.print("B)");
			}
			
			System.out.println(answers.get(i));
		}
		userIn = inputHandeling(userIn, 4);
		userIn = checkPlayerAnswer(userIn , selectedQuestion , 2);
		return userIn;
		
		
	}


	private static String checkPlayerAnswer(String userIn, Question selectedQuestion, int method) {
		if(method == 1) //gameDriver
		{
			switch(userIn)
			{
			case "a":
				if(selectedQuestion.getAnswer1().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					userIn = "!";
					break;
				}
			case "b":
				if(selectedQuestion.getAnswer2().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					userIn = "!";
					break;
				}
			case "c":
				if(selectedQuestion.getAnswer3().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					userIn = "!";
					break;
				}
			case "d":
				if(selectedQuestion.getAnswer4().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					userIn = "!";
					break;
				}
			}
		}
		else if(method == 2) //  fiftyFifty
		{
			switch(userIn)
			{
			case "a":
				if(selectedQuestion.getAnswer1().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "!";
					break;
				}
			case "b":
				if(selectedQuestion.getAnswer2().equals(selectedQuestion.getCorrect()))
				{
					System.out.println("Correct Answer!!!");
					//enterToContinue();
					userIn = "$";
					break;
				}
				else
				{
					userIn = "!";
					break;
				}
			}
		}
		
		return userIn;
	}



	private static void loadList(ArrayList<Question> Qlist, String questionValue) throws IOException {
		//questionValue = "/QListQuestions/" + questionValue;
		List<String> list = FileUtils.readTextFromJar("/resources/" + questionValue);
	    Iterator<String> it = list.iterator();
	    it = list.iterator();
	    int counter = 0;
	    String str = "";
	    while(it.hasNext()) 
	    {
	    	Question question = new Question();
	    	while(counter < 5)
			{
	    		if(counter == 0)
				{
					str = it.next();
					question.setQuestions(str);
				}
				else if (counter == 1)
				{
					str = it.next();
					str = checkForAnswer(question , str);
					question.setAnswer1(str);
				}
				else if (counter == 2)
				{
					str = it.next();
					str = checkForAnswer(question , str);
					question.setAnswer2(str);;
				}
				else if (counter == 3)
				{
					str = it.next();
					str = checkForAnswer(question , str);
					question.setAnswer3(str);;
				}
				else if (counter == 4)
				{
					str = it.next();
					str = checkForAnswer(question , str);
					question.setAnswer4(str);;
				}
				counter++;
			}
	    	counter = 0;
	    	Qlist.add(question);
	    }
	    
//	    for(Question qObject : Qlist)
//		{
//			System.out.println(qObject.toString());
//		}
		
	}


	private static String checkForAnswer(Question question, String str) {
		char last = str.charAt(str.length() - 1);
//		System.out.println(last);
		if(last == '*')
		{
			question.setCorrect(str.substring(0 , str.length() - 1));
			str = str.substring(0 , str.length() - 1);
			question.setCorrect(str);
		}
		return str;
	}
}
