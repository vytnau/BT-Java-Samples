package lt.bt.kaledos;

public class Child {

	private String name;
	private String lName;
	private String street;
	private String toy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}
	
	@Override
	public String toString() {
		return name + " " + " " + lName + " " + street + " " + toy;
	}
}
