package lt.bt.java.test.sample;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import lt.bt.java.sample.task.KontrolesServisas;
import lt.bt.java.sample.task.data.Automobilis;
import lt.bt.java.sample.task.data.Kontrole;
import lt.bt.java.sample.task.data.Zonos;

public class KontrolesServisasTest {

	@Test
	public void arApmoketas_test() {
		List<Automobilis> automobiliai = new ArrayList<>();		
		automobiliai.add(new Automobilis("HGA475", Zonos.GELTONA, 11, 00));
		automobiliai.add(new Automobilis("HGV475", Zonos.ZALIA, 8, 22));
		automobiliai.add(new Automobilis("HGC475", Zonos.ZALIA, 12, 23));
		automobiliai.add(new Automobilis("HGU475", Zonos.ZALIA, 11, 23));
		KontrolesServisas kontrolesServisas = new KontrolesServisas();
		Kontrole kontrole = new Kontrole("HGU475", Zonos.ZALIA, 9, 54);
		
		boolean apmoketa = kontrolesServisas.arApmoketasAutomobilioParkavimas(automobiliai, kontrole);
		assertEquals(true, apmoketa);
	}
	
	@Test
	public void arApmoketas1_test() {
		List<Automobilis> automobiliai = new ArrayList<>();		
		automobiliai.add(new Automobilis("HGA475", Zonos.GELTONA, 11, 00));
		automobiliai.add(new Automobilis("HGV475", Zonos.ZALIA, 8, 22));
		automobiliai.add(new Automobilis("HGC475", Zonos.ZALIA, 12, 23));
		automobiliai.add(new Automobilis("HGU475", Zonos.ZALIA, 11, 23));
		KontrolesServisas kontrolesServisas = new KontrolesServisas();
		Kontrole kontrole = new Kontrole("HGU477", Zonos.ZALIA, 9, 54);
		
		boolean apmoketa = kontrolesServisas.arApmoketasAutomobilioParkavimas(automobiliai, kontrole);
		assertEquals(false, apmoketa);
	}
	
	@Test
	public void arApmoketas2_test() {
		List<Automobilis> automobiliai = new ArrayList<>();		
		automobiliai.add(new Automobilis("HGA475", Zonos.GELTONA, 11, 00));
		automobiliai.add(new Automobilis("HGV475", Zonos.ZALIA, 8, 22));
		automobiliai.add(new Automobilis("HGC475", Zonos.ZALIA, 12, 23));
		automobiliai.add(new Automobilis("HGU475", Zonos.ZALIA, 11, 23));
		KontrolesServisas kontrolesServisas = new KontrolesServisas();
		Kontrole kontrole = new Kontrole("HGV475", Zonos.ZALIA, 9, 54);
		
		boolean apmoketa = kontrolesServisas.arApmoketasAutomobilioParkavimas(automobiliai, kontrole);
		assertEquals(false, apmoketa);
	}

}
