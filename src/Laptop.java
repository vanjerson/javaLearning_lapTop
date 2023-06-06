// Blueprint
public class Laptop {

// Attributes	
	private String brand;
	private String operatingSystem;
	private String processor;
	private String ram;
	private int price;
	private boolean isOn;

	// Constractor with Params
	public Laptop(String brand, String operatingSystem, String processor, String ram, int price) {
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
	}

	// Switch Method
	public void switchOn() {
		
		
		
		if (isOn == true) {
			System.out.println("Laptop is already running");
		} else {
			isOn = true;
			System.out.println("Laptop is ON");
		}
	}
	
	// Getter / Setter
	public String getBrand() {
		return brand;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
