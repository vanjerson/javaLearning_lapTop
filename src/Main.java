public class Main {
    public static void main(String[] args) {
        
    	Laptop myLaptop = new Laptop("ACER", "Windows", "Core i5", "16 GB", 80000);
    	
    	System.out.println(myLaptop.getBrand());
    	System.out.println(myLaptop.getOperatingSystem());
    	System.out.println(myLaptop.getProcessor());
    	System.out.println(myLaptop.getRam());
    	System.out.println(myLaptop.getPrice());
    	
    	myLaptop.switchOn();
    	myLaptop.switchOn();
    	
    	GamingLaptop predator = new GamingLaptop("ASUS", "Linux", "AMD", "32 GB", 80000);
    	predator.setGpu("NVIDIA GEFORCE RTX3080");
    	System.out.println(predator.getBrand());
    	System.out.println(predator.getOperatingSystem());
    	System.out.println(predator.getProcessor());
    	System.out.println(predator.getRam());
    	System.out.println(predator.getPrice());
    	System.out.println(predator.getGpu());
    }
}