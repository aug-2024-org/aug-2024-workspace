package classesandobjects;

public class Room {
	int length;
	int width;
	int height;
	String roomColor;
	int roomNumber;

	Room(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Room(int length, int width, int height, String roomColor){
		this(length, width, height); // constructor chaining within the class
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomColor = roomColor;
	}

	Room(int length, int width, int height, String roomColor, int roomNumber){
		this(length, width, height, roomColor); // constructor chaining within the class
		this.roomNumber = roomNumber;
	}
	
	int calculateFloorArea() {
		int floorArea = length * width;
		return floorArea;
	}
	
	int costOfPaintingWalls() {
		int costOfPainting = (2 * (length * height) + 2 * (width * height) ) * 2;
		return costOfPainting;
	}
}
