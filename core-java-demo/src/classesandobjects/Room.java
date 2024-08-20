package classesandobjects;

import java.util.Objects;

public class Room implements Comparable<Room>{
	private int length;
	private int width;
	private int height;
	private String roomColor;
	private int roomNumber;

	public Room(int length, int width, int height){
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

	@Override
	public int compareTo(Room o) {
		return (this.length * this.width) - (o.length * o.width);
	}

//	@Override
//	public boolean equals(Object o) {
//		Room otherRoom = (Room)o;
//		if(this.length != otherRoom.getLength())
//			return false;
//		if(this.width != otherRoom.width)
//			return false;
//		if(this.height != otherRoom.height)
//			return false;
//
//		return true;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(height, length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return height == other.height && length == other.length && width == other.width;
	}

	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + ", height=" + height + ", roomColor=" + roomColor
				+ ", roomNumber=" + roomNumber + "]";
	}
}
