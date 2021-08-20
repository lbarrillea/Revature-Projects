package game;

import java.io.*;
import java.util.Scanner;

import fixtures.Room;
import fixtures.Fixture;
import fixtures.Items;
import game.RoomManager;


// based on work found at https://www.instructables.com/Hand-Made-Bagend-a-Hobbit-Hole/
public class Main {
	
	
	

	public static Scanner input;
	public static boolean exittour;
	public static Player player = new Player();
//	public static Items items = new Items();

	public static RoomManager roomManager;
	
	public static void welcomemessage() {
		System.out.println("Welcome to the humble home of Bilbo Baggins. Come on in and lets take a look.");
		System.out.println("");
	};

	public static void controlsmessage(){
		System.out.println("to look around press l or look" +"\n"+"to go up press n or north"+ "\n" +"to go right press e or east" +"\n"+ "to go down press s or south"+"\n"+"to go left press w or west"+"\n"+"To leave the tour press q or quit");
	}
	
	public static void outputmessage() {
		System.out.println(player.getCurrentLocation().getName() + " " );
		System.out.println(player.getCurrentLocation().getshortDescription() +"\n"+ player.getCurrentLocation().getlongDescription());
//		if (player.getCurrentLocation(player.getCurrentLocation(parlour).instructions.toLowerCase("l"))) {
//			System.out.println("oh hello look what we found a "+player.getCurrentItem(ring));
//		}
	}
	
	public static void main(String[] args) {
		Main.input = new Scanner(System.in);
		Main.roomManager = new RoomManager();
		
		RoomManager.init();
		player.setCurrentLocation(RoomManager.frontgarden);
		
		Main.exittour = false;	
		welcomemessage();
		controlsmessage();


		Scanner userinput = new Scanner(System.in);
		String instructions;
		
		while(!exittour) {
			
			instructions = userinput.nextLine();
			
			switch(instructions.toLowerCase()) {
				
				case "north": case "n": 
				case "east": case "e":
				case "south": case "s":
				case "west": case "w":
				
					if(player.getCurrentLocation().getExit(instructions)==null) {
						System.out.println("(WHUMP) Sorry lad there is no door there. Are you alright?");
						break;
					}
					player.setCurrentLocation(player.getCurrentLocation().getExit(instructions));
					System.out.println(player.getCurrentLocation().getName());					
					break;
				case "look": case"l":
					outputmessage();
					break;
				case "quit": case"q":
					Main.exittour = true;
					System.out.println("Safe travels adventurer");
					break;
				default: System.out.println("Sorry Im hard of hearing please say that again");
				
			}
		}
		
	
		Main.exittour = false;
	}
}
	