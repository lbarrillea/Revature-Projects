package game;

import fixtures.Fixture;
import fixtures.Items;
import fixtures.Room;

//list rooms and objects

public class RoomManager {
	
	//create our rooms
	static Room[] roomList = new Room[6]; //total of 5 interactable rooms
	
	public static Room frontgarden;
	public static Room enterancehall;
	public static Room parlour;
	public static Room oakhall;
	public static Room eastspareroom;
	public static Room smokingroom; 
	
	
//	public static String easthall;
//	public static String kitchen; 
//	public static String Atrium;
//	public static String pantry; 
//	public static String diningroom;
//	public static String study; is off limits by order of the owner
//	public static String westhall;
	//public static String masterbedroom;
//	public static String guestroom;
//	public static String backroom;
//	public static String cellar;


	public static void init() {
		

		// make into array and look at store example
		frontgarden = new Room("Front Garden","A beautiful green lawn leading up to the door", "The beautiful emerald colored velvet lawn of this home leads up to the house which is set into the side of a hill." +"\n"+ "The front lawn of this home has a stone path leading up to a beautiful circular wood door." +"\n"+"The stone path and outside walls are adorned with blooming flowers in beds and pots");
			
		enterancehall = new Room("Entrance Hall", "Wooden floored enterance with hat rack and long bench." +"\n"+ "In the middle of the clean white arched ceiling with brown beams hangs a iron chandelier illuminating the room brightly", "");
		parlour = new Room("Parlour","A Cozy room with a table and fireplace", "LongDescription");
		oakhall = new Room("Oak Hall","shortDescription", "LongDescription");
		eastspareroom =new Room("East Spare Room","shortDescription", "LongDescription");
		smokingroom= new Room("Smoking Room","shortDescription", "LongDescription");
		
		//stretch goals
		Room easthall =new Room(null,null,null);
		Room kitchen = new Room(null,null,null);
		Room Atrium = new Room(null,null,null);
		Room pantry =new Room(null,null,null);
		Room diningroom =new Room(null,null,null);
		Room westhall =new Room(null,null,null);
		Room masterbedroom =new Room(null,null,null);
		Room guestroom =new Room(null,null,null);
		Room backroom= new Room(null,null,null);
		Room celler= new Room(null,null,null);
		
		//items to initallize in the rooms
		Items ring = new Items("ring", "small plain gold ring", "If you watched the movie then you know that you should leave it");
//		ring.setItems(parlour, ring);
		
		//exits by cardinal direction and adjacent rooms
		frontgarden.setRoom(0, enterancehall);
		
		enterancehall.setRoom(0, oakhall);
		enterancehall.setRoom(2, frontgarden);
		enterancehall.setRoom(3,  parlour);
		
		eastspareroom.setRoom(2, oakhall);
		eastspareroom.setRoom(3, smokingroom);
		
		parlour.setRoom(1, enterancehall);
		
		oakhall.setRoom(0, eastspareroom);
		oakhall.setRoom(2, enterancehall);
		
		smokingroom.setRoom(1, eastspareroom);
			

	}
}
