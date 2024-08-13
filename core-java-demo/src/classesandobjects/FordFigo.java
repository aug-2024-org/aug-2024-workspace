package classesandobjects;

public class FordFigo {
	String carModel;
	String carNumber;
	String carColor;
	int seaters;
	
	public FordFigo(String carModel, String carColor, int seaters) {
		//super();
		this.carModel = carModel;
		this.carColor = carColor;
		this.seaters = seaters;
	}
	
	String unlock() {
		return "Unlocked " + carModel +"...";
	}
	
	String lock() {
		return "Locked " + carModel +"...";
	}
	
	String start() {
		return "Started " + carModel +"...";
	}
	
	String stop() {
		return "Stopped " + carModel +"...";
	}
	
	String accelerate() {
		return "Accelerated " + carModel +"...";
	}
	
	String applyBrake() {
		return "Manual brakes applied for " + carModel +"...";
	}
}
