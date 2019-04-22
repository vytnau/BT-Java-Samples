package lt.bt.tasks.sviesuoliuMiestas;

import lt.bt.tasks.sviesuoliuMiestas.data.Gyventojas;
import lt.bt.tasks.sviesuoliuMiestas.data.Prenumeratos;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class MainSviesuoliuMiestas {
    public static final String PRENUMERATOS = "prenumeratos";
    public static final String GYVENTOJAI = "gyventojai";
    public static final String DUOMENU_FAILAS = "Duomenys.txt";
    public static final String REZULTATU_FAILAS = "ataskaita.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Utils.isvalytiFaila();
        Skaiciavimai skaiciavimai = new Skaiciavimai();
        Map<String, Object> duomenys = Utils.nuskaitytiDuomenis(DUOMENU_FAILAS);
        List<Gyventojas> gyventojai = (List<Gyventojas>) duomenys.get(GYVENTOJAI);
        Prenumeratos prenumeratos = (Prenumeratos)duomenys.get(PRENUMERATOS);
        skaiciavimai.spausdintiGyventojuPrenumeratuSumas(gyventojai, prenumeratos);
        skaiciavimai.leidiniamsIsVisoIsleista(gyventojai, prenumeratos);
        skaiciavimai.daugiausiaiLeidiniuUzsiprenumeravo(gyventojai);
        skaiciavimai.prenumerataUzMaziausiaSuma(gyventojai, prenumeratos);
    }
}
