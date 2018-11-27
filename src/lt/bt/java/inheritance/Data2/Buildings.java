package lt.bt.java.inheritance.Data2;

//Tevine klase
public class Buildings {

	private String address;
	private String street;
	protected int hight;
	
	public Buildings(){
		System.out.println("Buildings constructor");
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public void print(){
		System.out.println("Building");
	}
	
	
}
