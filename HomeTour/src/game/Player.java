package game;

import fixtures.Items;
import fixtures.Room;

public class Player {
		Room currentLocation;
		Items currentItems;
		
		public void setCurrentLocation(Room location) {
			currentLocation = location;
		}

		public Room getCurrentLocation() {
			// TODO Auto-generated method stub
			return currentLocation;
		}
		
		public void player() {
			
		}
		
		public void setCurrentItem(Items baubles) {
			currentItems = baubles;
		}
		public Items getCurrentItem() {
			return currentItems;
		}
		
		
	//	public static Items[] items() {
	//		return items();
	//	}
//		public static String lookAtItem(String itemname) {
//			for(int i=0;i< Items.length;i++)
//				if(Items[i].getName().equals(name))
//					return Items()[i].getLongDescription();
//			return "Nothing here";
//		}
//		public static boolean addToHeldItems(Items item) {
//			for(int i=0;i< items().length;i++)
//				if(items()[i]==null) {
//					items()[i] = item;
//					return true;
//				}
//			return false;
//		}
//		public static boolean dropHeldItem(String name) {
//			for(int i=0;i< items().length;i++)
//				if(items()[i].getName().toLowerCase().equals(name)) {
//					currentLocation.addItems(items()[i]);
//					items()[i] = null;
//					return true;
//				}
//			return false;
//		}
//		public static boolean isHeldItemAContainer(String sting, int hand) {
//			//make sure the hand isnt out of bounds. nobody gets more than 2.
//			if(hand>1)
//				return false;
//			
//			//make sure the hand isnt empty
//			if(heldItems[hand] == null)
//				return false;
//
//			if(heldItems[hand] instanceof Container)
//				return true;
//			return false;
//		}
//
//		public static boolean isAHandFree() {
//			
//			return false;
//		}

		
}
