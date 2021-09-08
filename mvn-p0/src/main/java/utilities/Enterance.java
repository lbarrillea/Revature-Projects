package utilities;
import controllers.NonStaticController;
import controllers.TestController;
import daos.TableDAO;
import io.javalin.Javalin;
import models.Main;
import utilities.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enterance {
	
	public static void openingmessagem() {
		System.out.println("Enter the number for your choice. { put instructions for 1-6] ");
	}
	
	public static void MainMenuM() {
		System.out.println("Welcome to First Intersteller Colonial Bank" +"\n"+ "please choose from the following options"+"\n"+"1: Create a new user and account"+
	"\n"+"2: View an Existing Account"+ "\n" + "3: View all accounts"+"\n"+"4: View all Customers"+"\n"+ "5: to exit");
	}
	
	public static void DisplayAllcustomers() {

      
		
		Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM customers";
		try {
			Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
			
			System.out.println("================ Customers Table =================");
			while(rs.next()) {
				
				//out put of information
				System.out.println("Customer_id: ["
						+ rs.getInt("customer_id")
						+ "] Name: ["
						+ rs.getString("name")
						+"]"
						);
				
			}
			System.out.println("================ Customers Table =================");
		
		}catch (SQLException e) {
	}
}
	
	public static void makenewaccount() {
		
		System.out.println("Please enter new Customer name");
		try {
		Scanner scan = new Scanner(System.in);
		String name;
		name = scan.nextLine();
		
		System.out.println("Please enter new Customer eight digit id number");
		
		int cidnumber;
		cidnumber = scan.nextInt();
		
		Connection conn = ConnectionFactory.getConnection();
		
        String sql = "INSERT INTO customers VALUES ("+cidnumber+",'"+name+"')";

        System.out.println("PLease enter amount of deposit to complete account");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
        int initalamount;
        initalamount = scan.nextInt();
        sql = "INSERT INTO accounts(customer_id, balance) VALUES  ("+ cidnumber+","+initalamount+")";

		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		System.out.println("Account Holder : ["+name+"]   Holder CID["+cidnumber+"]  Account Balance: $"+initalamount+"]");
		
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public static void Displayallaccounts() {
Connection conn = ConnectionFactory.getConnection();
		
        String sql = "SELECT * FROM accounts";

        
		try {
			Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
			
			System.out.println("================Accounts Table=================");
			while(rs.next()) {
				
				//out put of information
				System.out.println("Customer_id: ["
						+ rs.getInt("customer_id")
						+ "] Balance: [$"
						+ rs.getInt("balance")
						+ "]  Account ID: ["
						+rs.getInt("account_id")
						+"]");
				
			}
			System.out.println("================Accounts Table=================");
		
		}catch (SQLException e) {
			
		}
		
		
	}
	
	public static void DisplayExistingAccount() {
		

		Connection conn = ConnectionFactory.getConnection();
		
		System.out.println("Please enter Account holder Name");
	
		Scanner scan = new Scanner(System.in);
		String name;
		name = scan.nextLine();
		
		System.out.println("please enter 8 digit CID number");
		int cidnumber;
		cidnumber = scan.nextInt();
		String sql= "SELECT customer_id, account_id, balance FROM accounts WHERE "+cidnumber+"=customer_id";
	try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(sql);
			System.out.println("Owner: ["+name+"]  CID: ["+rs.getInt("customer_id")+"]  Account Balance: ["+rs.getDouble("balance")+"]");
			}
		}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static void main(String[] args) throws IOException {
		Connection set = null;
		
    	//port connector and middle man handshake
        Javalin app = Javalin.create().start(7000);
        Connection conn = ConnectionFactory.getConnection();
        
        TestController.init(app);
        
//        DisplayAllcustomers();
//        Displayallaccounts();
//        
        
        
    	MainMenuM();
    	
		Scanner scan = new Scanner(System.in);
        int userinput;
    	userinput=scan.nextInt();
    	
    	switch(userinput) {
    		case 1:
    			makenewaccount();
    			break;
    		case 2:
    			DisplayExistingAccount();
    			break;
    		case 3:
    			break;
    		case 4:
    			DisplayAllcustomers();
    			break;
    	}

        
        String sql = "SELECT * FROM test_table";
  
		try {
			
		//connects to db
			Statement stmt = conn.createStatement();
		//records returned as SQL query
		ResultSet rs = stmt.executeQuery(sql);
		
			
			System.out.println("================ test_table=================");
			
			//loops through db info and returns query
			while(rs.next()) {

				//out put of information
				System.out.println("String_id: ["
						+ rs.getInt("String_id")
						+ "] string: ["
						+ rs.getString("string")
						+ "]");
				
			}
			System.out.println("================ test_table=================");
		
		}catch (SQLException e) {
		
		//remember to close all active 
		}try {
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
