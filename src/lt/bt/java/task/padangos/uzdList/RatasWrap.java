package lt.bt.java.task.padangos.uzdList;

import java.util.List;

//Tarpine klase duomenim pernesti is funkcijos
public class RatasWrap {
	private Padanga ieskomasRatas;
	private List<Padanga> turimiRatai;

	public Padanga getIeskomasRatas() {
		return ieskomasRatas;
	}

	public void setIeskomasRatas(Padanga ieskomasRatas) {
		this.ieskomasRatas = ieskomasRatas;
	}

	public List<Padanga> getTurimiRatai() {
		return turimiRatai;
	}

	public void setTurimiRatai(List<Padanga> turimiRatai) {
		this.turimiRatai = turimiRatai;
	}

}
