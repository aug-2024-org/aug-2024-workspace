package classesandobjects;

public class FordFigoTitanium extends FordFigo{
	int noOfAirbags;

	public FordFigoTitanium(String carModel, String carColor, int seaters, int noOfAirbags) {
		//super();
		super(carModel, carColor, seaters); // constructor chaining
		this.noOfAirbags = noOfAirbags;
	}
	
	String ejectAirbags() {
		return "Airbags ejected for " + carModel +"...";
	}
	
	@Override
	String applyBrake() {
		return "ABS brakes applied for " + carModel + "...";
	}
}
