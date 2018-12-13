package lt.bt.java.sample.task.data;

public class ParkavimasBaigsis {

	private int valanda;
	private int minute;
	private String valstNr;
	
	public ParkavimasBaigsis(String valstNr, int valanda, int minute){
		this.valstNr = valstNr;
		this.valanda = valanda;
		this.minute = minute;		
	}

	public int getValanda() {
		return valanda;
	}

	public void setValanda(int valanda) {
		this.valanda = valanda;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public String getValstNr() {
		return valstNr;
	}

	public void setValstNr(String valstNr) {
		this.valstNr = valstNr;
	}
	
	@Override
	public String toString(){
		return "Automobiliui: " + valstNr + " parkavimas baigsis po: " + valanda + ":" + minute;
	}

}
