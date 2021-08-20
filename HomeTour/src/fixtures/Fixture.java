package fixtures;

import fixtures.Items;

public abstract class Fixture {
	
	private String Name;
	private String shortDescription;
	private String longDescription;
	
	public Fixture(String Name, String shortDescription, String longDescription) {
		
		this.Name = Name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public String getName() {
		return Name;
	}
	public String getshortDescription() {
		return shortDescription;
	}
	public String getlongDescription() {
		return longDescription;
	}
}
	
	/*
	public void addItems(Items item) {
		this.items.add(item);
	}
	public String lookAtItem(String name) {
		for(items roomItems : items)
			if(roomItems.getName().equals(name))
				return roomItems.getLongDescription();
		return ("look at that its a" + name);
	}
	
	public Items getItems() {
		return items;
	}
	public Items getItem(String name) {
		for(Items roomItem : items)
			if(roomItem.getitemname().equals(name))
				return roomItem;
		return null;
	}
	
	public boolean removeItems(Items item) {
		return this.items.remove(item);
	}
	public boolean itemExists(String name) {
		for(Items roomItems : items)
			if(roomItems.getitemname().toLowerCase().equals(name))
				return true;
		return false;
	}
	
	public Room[] getExit() {
		return exit;
	}
	
	public Room getExit(String dir) {
		int direction = getIntDirectionFromString(dir);
		return exit[direction];
	}
	
public Room getIntDirectionFromString(String dir) {
	switch (dir) {
	//turn and walk North
			case "North":
				return this.doorways[0];
				break;
			//turn and walk East
			case "East":
				return this.doorways[1];
				break;
			//turn and walk South
			case "South":
				return this.doorways[2];
				break;
			//turn and walk west
			case "West":
				return this.doorways[3];
				break;
			default:
				System.out.println("My apologies, but you can't go that way");
				return this;
	}
}
public boolean exitExists(String dir) {
	int direction = getIntDirectionFromString(dir);
	if(exit[direction] == null) {
		return false;
	}
	return true;
}
public String[] enterRoom() {
	String exits = getExits();
	String[] getText = {getName(), getLongDescription(), exits};
	
	return getText;
}

private String getExits() {
	String exits = "";
	// going through each direction in order and assigning text 
	if(this.exit[0]!=null)
		if(this.closedDoor[0])
			exits += "[North] - a closed door\n";
		else
			exits += "North - " + exit[0].getShortDescription() + "\n";
	
	if(this.exit[1]!=null)
		if(this.closedDoor[1])
			exits += "[East] - a closed door\n";
		else
			exits += "East - " + exit[1].getShortDescription() + "\n";

	if(this.exit[2]!=null)
		if(this.closedDoor[2])
			exits += "[South] - a closed door\n";
		else
			exits += "South - " + exit[2].getShortDescription() + "\n";

	if(this.exit[3]!=null)
		if(this.closedDoor[3])
			exits += "[West] - a closed door\n";
		else
			exits += "West - "+ exit[3].getShortDescription() +"\n";
	
	return exits;
}

public void setExits(Room... exit) {
	this.exit = exit;
}
public void setExits(Room exit, int dir) {
	this.exit[dir] = exit;
}
public boolean getClosedDoor(String dir) {
	int direction = getIntDirectionFromString(dir);
	return closedDoor[direction];
}
public void setClosedDoor(boolean North, boolean East, boolean South, boolean West) {
	boolean[] dir = {North, East, South, West}; 
	this.closedDoor = dir;
}
public boolean[] getDoorExists() {
	return doorExists;
}

public void setDoorExists(boolean North, boolean East, boolean South, boolean West) {
	this.doorExists = new boolean[] {North,East,South,West};
}
public void setClosedDoor(String dir) {
	int direction = getIntDirectionFromString(dir);
	closedDoor[direction] = false;
}

public boolean isDoorClosed(String dir) {
return getClosedDoor(dir);
}

public void setOpenedDoor(String dir) {
	int direction = getIntDirectionFromString(dir);
	closedDoor[direction] = true;
}

public boolean doorExists(String dir) {
	int direction = getIntDirectionFromString(dir);
	return doorExists[direction];
}
 return false;
}
}
*/