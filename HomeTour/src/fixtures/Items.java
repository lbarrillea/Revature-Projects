package fixtures;

public class Items extends Fixture {
	String ItemName;
	String shortItemDescription;
	String longItemDescription;
	
	//create array of items
	public Items[] itemExists = new Items[6];
	public Items[] List;
	

	static Items[] itemsList = new Items[6];
	
	//variables that represent items
	public static Items ring;
	public static Items poker;
	public static Items teapot;
	public static Items letter;
	public static Items parlourtable;
	public static Items fireplace;
	
	
	//constructor for items 
	public Items(String ItemName, String shortItemDescription, String longItemDescription) {
		super(ItemName, shortItemDescription, longItemDescription);
	}
	
//	public void setItems(Room nameName, Items ring ) {
//		String  = ;
//	}
	
	
	
	public String getitemname() {
		return this.ItemName;
	}
	public String getshortitemdescription() {
		return this.shortItemDescription;
	}
	public String getlongitemdescription() {
		return this.longItemDescription;
	}

	
	
}
