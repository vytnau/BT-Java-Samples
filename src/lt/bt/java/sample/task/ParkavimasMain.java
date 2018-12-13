package lt.bt.java.sample.task;

import java.util.ArrayList;
import java.util.List;

import lt.bt.java.sample.task.data.Automobilis;
import lt.bt.java.sample.task.data.Kontrole;
import lt.bt.java.sample.task.data.ParkavimasBaigsis;
import lt.bt.java.sample.task.data.Zonos;

public class ParkavimasMain {

	public static void main(String[] args) {
		List<Automobilis> automobiliai = new ArrayList<>();
		automobiliai.add(new Automobilis("HGA475", Zonos.GELTONA, 11, 00));
		automobiliai.add(new Automobilis("HGV475", Zonos.ZALIA, 8, 22));
		automobiliai.add(new Automobilis("HGC475", Zonos.ZALIA, 12, 23));
		automobiliai.add(new Automobilis("HGU475", Zonos.ZALIA, 11, 23));
		KontrolesServisas kontrolesServisas = new KontrolesServisas();
		Kontrole kontrole = new Kontrole("HGU475", Zonos.ZALIA, 9, 54);

		boolean apmoketa = kontrolesServisas.arApmoketasAutomobilioParkavimas(automobiliai, kontrole);

		ParkavimasBaigsis parkavimoPabaiga = kontrolesServisas.automobilioParkavimoGaliojimas(automobiliai, kontrole);

		if (parkavimoPabaiga != null) {
			kontrolesServisas.spausdintiAutoParkavimoTermina(parkavimoPabaiga);
			System.out.println(parkavimoPabaiga.toString());
		}

	}

	private static void pvzEnumMaping() {
		// ENUMAS ateina is isores, kaip sumapinti
		Zonos zona = KontrolesServisas.konvertuotiZona("Geltona");
		if (zona != null && zona.equals(Zonos.GELTONA)) {
			System.out.println("Geltona zona");
		} else {
			System.out.println("zona nesumapinta");
		}
	}

}
