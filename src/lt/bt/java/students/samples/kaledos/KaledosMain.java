package lt.bt.kaledos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KaledosMain {

	public static void main(String[] args) throws FileNotFoundException {
		ReadFile firstRead = new ReadFile();
        System.out.println(firstRead.getElfuSandelis());
        ReadFile secondRead = new ReadFile();
        System.out.println(secondRead.getVaikuInfo());
        ReadFile thirdRead = new ReadFile();
        System.out.println(thirdRead.getCharakeris());
        Dirbtuves skaiciuoti = new Dirbtuves();
        System.out.println(skaiciuoti.getVaikuZaislai(secondRead.getVaikuInfo(), thirdRead.getCharakeris(), firstRead.getElfuSandelis()));
        Dirbtuves skaiciuoti2 = new Dirbtuves();
        System.out.println(skaiciuoti2.getIsardomiZaislai(secondRead.getVaikuInfo(), thirdRead.getCharakeris(), firstRead.getElfuSandelis()));
        Dirbtuves skaiciuoti3 = new Dirbtuves();
        System.out.println(skaiciuoti3.getAngliesMaisai(secondRead.getVaikuInfo(), thirdRead.getCharakeris(), firstRead.getElfuSandelis()));
        Dirbtuves skaiciuoti4 = new Dirbtuves();
        System.out.println("Išardomi žaislai: " + skaiciuoti4.getIsardomiZaislai(secondRead.getVaikuInfo(), thirdRead.getCharakeris(), firstRead.getElfuSandelis()));
	}

	
}
