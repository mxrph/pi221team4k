package team4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Koef {
	
	public static void getKoef() {
	
	try {
		
		ClassLoader cl = Koef.class.getClassLoader();
		
    	File file = new File(cl.getResource("Config/koef.txt").getFile());
    	FileReader fr1 = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr1);
		Main.a1 = Integer.parseInt(reader.readLine());
		Main.a2 = Integer.parseInt(reader.readLine());
		reader.close();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		}

	}
}
