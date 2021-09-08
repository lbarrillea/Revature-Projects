package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import io.javalin.Javalin;
import io.javalin.http.Context;


public class Main {
	 private int stringId;
	    private String string;

	    public Main() {
	    }

	    public int getStringId() {
	        return stringId;
	    }

	    public void setStringId(int stringId) {
	        this.stringId = stringId;
	    }

	    public String getString() {
	        return string;
	    }

	    public void setString(String string) {
	        this.string = string;
	    }
	
}
	
//	//establish boolean value to run or close app
//	boolean application;
//	boolean previous;
//	
//	static String fullname;
//	static String Password;
//	static int CID;
//	static double amount;
//	
//	static Colonist colonist;
//	Bank bank = new Bank();
//	
//	
//	//opening menu 
//	public static void openingmessage() {
//		System.out.println("Enter the number for your choice. { put instructions for 1-6] ");
//	}
//	
//	//connect application to database
//	public static void SQLconnection() {
//
//				//"jdbc:mariadb://database-1.cjxyekxchied.us-east-2.rds.amazonaws.com:3306/database-1?user=admin&password=StarWars1977!"
//				Connection conn = ConnectionFactory.getConnection();
//				
//				
//				
//				String sql = "SELECT * FROM test_table";
//				try {
//					Statement stmt = conn.createStatement();
//					ResultSet rs = stmt.executeQuery(sql);
//				
//					
//					System.out.println("================ test_table=================");
//					while(rs.next()) {
//						System.out.println("String_id: ["
//								+ rs.getInt("String_id")
//								+ "] string: ["
//								+ rs.getString("string")
//								+ "]");
//						
//					}
//					System.out.println("================ test_table=================");
//				
//				}catch (SQLException e) {
//					
//				}
//	}
//	
//	public static void mainMenu() {
//		System.out.println("Welcome to First Intersteller Bank" +"\n"+ "please choose from the following options"+"\n"+"1: Create a new user and account"+
//	"\n"+"2: Access Current Account");
//	}
//	
//	//main method
//	public static void main(String[] args) {
//	       Javalin app = Javalin.create().start(7000);
//		
//		//Sql database connection
//		SQLconnection();
//		
//		//put scanner into the program so that typed info can be entered
//		Scanner scan = new Scanner(System.in);
//		
//		//
//		
//		int menuselection;
//		
//		//loops to run full program
//		while (true) {
//			openingmessage();
//			//detect and process user menu input
//		menuselection = scan.nextInt();
//		
//				switch(menuselection) {
//				case 1: 
//					System.out.println("Please enter full name");
//					String fullname = scan.nextLine();
//					fullname = scan.next();
//						while(colonistMap.containsKey(fullname)) {
//							System.out.println("Colonist already registered");
//							fullname = scan.next();
//						}
//						System.out.println("Please set your password");
//						Password = scan.next();
//						scan.nextLine();
//						
//						
//						while(!Password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{1,}"))))
//						{
//							System.out.println("Invalid password. Try again :");
//							Password=scan.next();
//						}
//						System.out.print("Enter initial deposit : ");
//						scan.nextLine();
//						while(!scan.hasNextDouble()) {
//							System.out.println("Invalid amount. Enter again :");
//							scan.nextLine();
//						}
//						amount=scan.nextDouble();
//						scan.nextLine();
//						colonist = new Colonist(fullname, Password, CID, balance);
//						colonistMap.put(fullname,colonist);
//					break;
//				case 2: 
//					System.out.println("please enter Full Name");
//					fullname = scan.next();
//					scan.nextLine();
//					System.out.println("Please enter Password");
//					Password = scan.next();
//					scan.nextLine();
//					if (colonistMap.containsKey(fullname)) {
//						colonist = colonistMap.get(fullname);
//							if(colonist.Password.equals(Password)) {
//								while(true) {
//									System.out.println("   Welcome Back Valued Colonist");
//									System.out.println("");
//									System.out.println("1  Deposit into Account");
//									System.out.println("2  Withdraw funds");
//									System.out.println("3  Transfer funds to another Account");
//									System.out.println("4  Open checking Account");
//									System.out.println("5  View Account information");
//									System.out.println("6  Log out");
//									System.out.println("");
//									System.out.println("   choose an option and press enter     ");
//									menuselection = scan.nextInt();
//									scan.nextLine();
//									
//									switch(menuselection) {
//									case 1:
//									       System.out.print("Enter amount to deposit : ");
//									       while(!scan.hasNextDouble())
//									       {
//										       System.out.println("Invalid amount. Try again :");
//										       scan.nextLine();
//									       }
//									       amount = scan.nextDouble();
//									       scan.nextLine();
//	                                       colonist.deposit(amount);
//									       break;
//									case 2:
//									       System.out.print("Enter amount to withdraw : ");
//									       while(!scan.hasNextDouble())
//									       {
//										       System.out.println("Invalid amount. Try again :");
//										       scan.nextLine();
//									       }
//									       amount = scan.nextDouble();
//									       scan.nextLine();
//	                                       colonist.withdraw(amount);
//									       break;
//									       
//									case 3: 
//											System.out.println("Please enter name of account paying");
//											
//											for(String transactions : colonist.)
//									}
//								}
//							}
//					}
//					
//					
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//				case 5:
//					break;
//				case 6:
//					close.
//				}
//		
//		
//		}
//	}