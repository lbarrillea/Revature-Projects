package fixtures;

import game.RoomManager;
import fixtures.Items;


public class Room extends Fixture{
	//item
	String itemName;
	Items [] Itemsarray;
	
	// use room[] exits to move around
	String roomName;
	Room[] rooms = new Room[5];
	public boolean[] closedDoor = new boolean[4];
	public Room[] doorExists = new Room[4];

	// insert movment means here
	
	public Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
	
	public Room[] Exits() {
		return this.doorExists;
		
	}
	
	public Room getExit(String direction) {
		switch (direction) {
		//turn and walk North
				case "north": case "n":
					return this.doorExists[0];

				//turn and walk East
				case "east": case "e":
					return this.doorExists[1];

				//turn and walk South
				case "south": case "s":
					return this.doorExists[2];

				//turn and walk west
				case "west": case "w":
					return this.doorExists[3];

				default:
					System.out.println("My apologies, but you can't go that way");
					return this;
		}
		
	}
	public Room(String roomName, String shortRoomDescription, String longRoomDescription, Room North, Room East, Room South, Room West, Items[] itemsName) {
		super(roomName, shortRoomDescription, longRoomDescription);
		this.roomName = roomName;
		this.Itemsarray = itemsName;
		
	}
	public void setRoom(int direction, Room nameName) {
		doorExists[direction] = nameName;
	}
	
	public Room moveNorth() {
		return this.moveNorth();
	}
	public Room moveEast() {
		return this.moveEast();
	}
	public Room moveSouth() {
		return this.moveSouth();
	}
	public Room moveWest() {
		return this.moveWest();
	}
	
	
}
