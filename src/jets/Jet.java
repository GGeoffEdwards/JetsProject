package jets;

public class Jet {

	private String model;
	private double speed;
	private int range;
	private int price;

	public Jet(String model, double speed, int range, int price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [Model=" + model + ", Speed(mach)=" + speed + ", Range=" + range + ", Price=" + price + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
