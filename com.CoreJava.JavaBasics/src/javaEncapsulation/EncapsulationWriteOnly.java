package javaEncapsulation;

// how to create write only class
// to create write only classes we need to provide setters methods only
class Mobile {
	private int ram;
	private String os;
	private static String companyName;

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public static void setCompanyName(String companyName) {
		Mobile.companyName = companyName;
	}

}

public class EncapsulationWriteOnly {

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.setRam(8);
		obj.setOs("Android12");
		Mobile.setCompanyName("XYZ pvt ltd");
	}

}
