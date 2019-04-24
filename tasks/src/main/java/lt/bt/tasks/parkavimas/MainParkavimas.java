package lt.bt.tasks.parkavimas;

import lt.bt.tasks.parkavimas.data.Automobilis;
import lt.bt.tasks.parkavimas.data.ParkavimoInfo;
import lt.bt.tasks.parkavimas.data.Zona;
import lt.bt.tasks.parkavimas.services.Kontrolierius;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

/*
Duoti trys failai.
Nusiskaityti duomenis.
1. rasti automobilius su pasibaigusiu parkavimu
2. atspausdinti kiek uz parkavima isleista konkreciam automobiliui
3. suskaiciuoti kiek valandu automobilis prastovejo aikstelese
 */

public class MainParkavimas {
    public static final String AIKSTELES_FAILAS = "aikstele.txt";
    public static final String AUTOMOBILIU_FAILAS = "automobiliai.txt";
    public static final String ZONOS_FAILAS = "zonos.txt";


    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Zona> zonos = Utils.nuskaitytiZonosDuomenis(ZONOS_FAILAS);
        Map<String, ParkavimoInfo> parkavimoInfos = Utils.nuskaitytiAikstelesDuomenis(AIKSTELES_FAILAS, zonos);
        List<Automobilis> automobiliai = Utils.nuskaitytiAutomobilisDuomenis(AUTOMOBILIU_FAILAS);
        zonos.values().stream().forEach(z -> System.out.println(z.toString()));
        parkavimoInfos.values().stream().forEach(a -> System.out.println(a.toString()));
        automobiliai.stream().forEach(a -> System.out.println(a.toString()));

        Kontrolierius kontrolierius = new Kontrolierius();
        kontrolierius.pasibaigesParkavimas(parkavimoInfos);
    }

}
