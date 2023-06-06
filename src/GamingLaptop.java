// Blueprint
public class GamingLaptop extends Laptop {
	
	// Attributes
	private String gpu;
	
	// Constractor with Params
	public GamingLaptop(String brand, String operatingSystem, String processor, String ram, int price) {
		super(brand, operatingSystem, processor, ram, price);
		// TODO Auto-generated constructor stub
		
	}
	
	// Getter / Setter
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	

}
