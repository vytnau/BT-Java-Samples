package lt.bt.tasks.parkavimas;

import lt.bt.tasks.parkavimas.data.Automobilis;
import lt.bt.tasks.parkavimas.data.ParkavimoInfo;
import lt.bt.tasks.parkavimas.data.Zona;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utils {
    private static final String SKYRIKLIS = " ";
    private static final String PATH = "/tasks/src/main/java/lt/bt/tasks/parkavimas/";

    public static Map<String, ParkavimoInfo> nuskaitytiAikstelesDuomenis(String failoVardas, Map<String, Zona> zonos) throws FileNotFoundException {
        String failoKelias = new File("").getAbsolutePath() + PATH + failoVardas;
        File file = new File(failoKelias);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        Map<String, ParkavimoInfo> aiksteles = new HashMap<>();
        try {
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if(lineNumber <= 1){
                    continue;
                }
                ParkavimoInfo parkavimoInfo = konvertuotiIAisktelesAuto(line, zonos);
                aiksteles.put(parkavimoInfo.getValstNr(), parkavimoInfo);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aiksteles;
    }

    private static ParkavimoInfo konvertuotiIAisktelesAuto(String line, Map<String, Zona> zonos){
        ParkavimoInfo parkavimoInfo = null;
        String[] duomenys = line.substring(0, 19).split(SKYRIKLIS);
        String dataIkiStr = line.substring(19).trim();
        Date dataIki = konvertuotiData(dataIkiStr);
        String valstNr = duomenys[0];
        Zona zona = zonos.get(duomenys[1]);
        parkavimoInfo = new ParkavimoInfo(valstNr, zona, dataIki);
        return parkavimoInfo;
    }

    private static Date konvertuotiData(String data){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            return dateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, Zona> nuskaitytiZonosDuomenis(String failoVardas) throws FileNotFoundException {
        String failoKelias = new File("").getAbsolutePath() + PATH + failoVardas;
        File file = new File(failoKelias);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        Map<String, Zona> zonos = new HashMap<>();
        try {
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if(lineNumber <= 1){
                    continue;
                }
                String[] duomenys = line.split(SKYRIKLIS);
                String id = duomenys[0];
                double kaina = Double.parseDouble(duomenys[1]);
                Zona zona = new Zona(id, kaina);
                zonos.put(id, zona);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return zonos;
    }

    public static List<Automobilis> nuskaitytiAutomobilisDuomenis(String failoVardas) throws FileNotFoundException {
        String failoKelias = new File("").getAbsolutePath() + PATH + failoVardas;
        File file = new File(failoKelias);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<Automobilis> aiksteles = new ArrayList<>();
        try {
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if(lineNumber <= 1){
                    continue;
                }
                String marke = line.substring(0, 16);
                String valstNr = line.substring(16, 22);
                String zona = line.substring(22, 23);
                Date dataNuo = konvertuotiData(line.substring(25, 40));
                Date dataIki = konvertuotiData(line.substring(41));
                Automobilis automobilis = new Automobilis(marke, valstNr, zona, dataNuo, dataIki);
                aiksteles.add(automobilis);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aiksteles;
    }
}

