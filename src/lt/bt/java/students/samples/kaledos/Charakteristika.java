package lt.bt.kaledos;

public class Charakteristika {

	private String name;
	private String lastName;
	private GerasBlogas personality;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public GerasBlogas getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		if(personality.toLowerCase().equals("blogas")){
			this.personality = GerasBlogas.BLOGAS;
		} else {
			this.personality = GerasBlogas.GERAS;
		}
	}
	
	@Override
	public String toString() {
		return name + " " + lastName + " " + personality; 
		
	}
	
}
