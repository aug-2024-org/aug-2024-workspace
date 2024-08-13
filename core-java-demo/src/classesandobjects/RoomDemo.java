package classesandobjects;

public class RoomDemo {

	public static void main(String[] args) {
		int mark;
		mark = 50;
		
		Room livingRoom;
		livingRoom = new Room(200, 150, 100);
		
//		livingRoom.length = 200;
//		livingRoom.width = 150;
//		livingRoom.height = 100;
		
		int result = livingRoom.calculateFloorArea();
		System.out.println("Floor area of living room :" + result);
		
		
	}
}
