package lt.bt.kaledos;

import java.io.Serializable;

public class Sandelis implements Serializable{

	private String toyName;
	private int quant;
	
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	@Override
	public String toString() {
		return toyName + " " + quant;
	} 
}
