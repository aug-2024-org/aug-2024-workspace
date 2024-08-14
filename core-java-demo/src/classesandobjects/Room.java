package classesandobjects;

public class Room {
	private int length;
	private int width;
	private int height;
	private String roomColor;
	private int roomNumber;

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
	
	// public getter method for length
	// getters are also known as accessors
	// getters are providing the read access to the property
	public int getLength() {
		return length;
	}
	
	// public setter method for length
	// setters are also known as mutators
	// setters are providing the write acess to the property
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getRoomColor() {
		return roomColor;
	}

	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
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
