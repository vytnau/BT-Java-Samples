package lt.bt.java.tasks.sviesuoliuMiestas;

import lt.bt.java.tasks.sviesuoliuMiestas.data.Gyventojas;
import lt.bt.java.tasks.sviesuoliuMiestas.data.Prenumeratos;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public static Map<String, Object> nuskaitytiDuomenis(String failoVardas) throws FileNotFoundException {
        String failoKelias = new File("").getAbsolutePath() + "/src/lt/bt/java/tasks/sviesuoliuMiestas/" + failoVardas;
        Map<String, Object> result = new HashMap<>();
        File file = new File(failoKelias);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        try {
            int lineNumber = 0;
            List<String> pastininkasLines = new ArrayList<>();
            List<String> gyventojasLines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                if(lineNumber < 2){
                    pastininkasLines.add(line);
                } else {
                    gyventojasLines.add(line);
                }
                lineNumber++;
            }
            br.close();
            Prenumeratos prenumeratos = konvertuotiTekstineEiluteIPastininka(pastininkasLines);
            List<Gyventojas> gyventojai = konvertuotiTektineEuluteIGyventoja(gyventojasLines);
            result.put(MainSviesuoliuMiestas.PRENUMERATOS, prenumeratos);
            result.put(MainSviesuoliuMiestas.GYVENTOJAI, gyventojai);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static Prenumeratos konvertuotiTekstineEiluteIPastininka(List<String> pastinikasStr){
        String[] pirmaEilute = pastinikasStr.get(0).split(" ");
        int prenumeratuSk = Integer.parseInt(pirmaEilute[1]);
        String[] kainosStr = pastinikasStr.get(1).split(" ");
        List<Double> kainos = new ArrayList<>();
        for(String kainaStr : kainosStr){
            kainos.add(Double.parseDouble(kainaStr));
        }
        Prenumeratos prenumeratos = new Prenumeratos(prenumeratuSk, kainos);
        return prenumeratos;
    }

    private static List<Gyventojas> konvertuotiTektineEuluteIGyventoja(List<String> gyvetojaiStr){
        List<Gyventojas> gyventojai = new ArrayList<>();
        for(String gyventojasStr : gyvetojaiStr){
            String vardas = gyventojasStr.substring(0, 15);
            String[] prenumeratos = gyventojasStr.substring(15).split(" ");
            List<Integer> gyventojoPrenumeretos = new ArrayList<>();
            for(String prenumerta : prenumeratos){
                gyventojoPrenumeretos.add(Integer.parseInt(prenumerta));
            }
            gyventojai.add(new Gyventojas(vardas, gyventojoPrenumeretos));
        }
        return gyventojai;
    }

    public static void rasytiRezultatus(String content, String fileName, boolean append){
        String resultFile = new File("").getAbsolutePath() + "/src/lt/bt/java/tasks/sviesuoliuMiestas/" + fileName;
        FileWriter fw;
        try {
            fw = new FileWriter(resultFile, append);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void isvalytiFaila(){
        rasytiRezultatus("", MainSviesuoliuMiestas.REZULTATU_FAILAS, false);
    }
}
