package lt.bt.java.sample.task.data;

public class Kontrole {

	private String valstNumeris;
	private Zonos zona;
	private int valanda;
	private int minutes;
	
	public Kontrole(){
		
	}
	
	public Kontrole(String valstNumeris, Zonos zona, int valanda, int minutes){
		this.valstNumeris =valstNumeris;
		this.zona = zona;
		this.valanda = valanda;
		this.minutes = minutes;
	}

	public String getValstNumeris() {
		return valstNumeris;
	}

	public void setValstNumeris(String valstNumeris) {
		this.valstNumeris = valstNumeris;
	}

	public Zonos getZona() {
		return zona;
	}

	public void setZona(Zonos zona) {
		this.zona = zona;
	}

	public int getValanda() {
		return valanda;
	}

	public void setValanda(int valanda) {
		this.valanda = valanda;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
