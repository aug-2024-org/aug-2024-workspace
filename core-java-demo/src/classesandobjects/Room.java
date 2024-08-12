package classesandobjects;

public class Room {
	int length;
	int width;
	int height;
	
	int calculateFloorArea() {
		int floorArea = length * width;
		return floorArea;
	}
	
	int costOfPaintingWalls() {
		int costOfPainting = (2 * (length * height) + 2 * (width * height) ) * 2;
		return costOfPainting;
	}
}
