package team4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check implements Config {

	private List<String> admlog = new ArrayList<>();
    private List<String> admpass = new ArrayList<>();
    
    private List<String> usrlog = new ArrayList<>();
    private List<String> usrpass = new ArrayList<>();
    
    boolean srav;

    public boolean check1(String login, String password) throws IOException {
    	srav = false;
    	readdan();
        for (int i = 0; i < admlog.size(); i++) {
            if (login.equals(admlog.get(i)) && password.equals(admpass.get(i))) {
            	srav = true;
                break;
            }
        }
        return srav;
    }
    
    public boolean check2(String login, String password) throws IOException {
    	srav = false;
        for (int i = 0; i < usrlog.size(); i++) {
            if (login.equals(usrlog.get(i)) && password.equals(usrpass.get(i))) {
            	srav = true;
                break;
            }
        }
        return srav;
    }

    public void readdan() throws IOException {
		String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		
		int lengthpath = parsfilepath.length;
		String abspath=""; 
		for(int i=0;i<(lengthpath-1);i++) {
			abspath=abspath+parsfilepath[i]+"/";
		}
		filepath=abspath+"webapps/CalcTeam4/Config/";
    	File file1 = new File(filepath);
    	
        FileReader fr1 = new FileReader(file1+"/adminlogpass.txt");
        BufferedReader reader1 = new BufferedReader(fr1);
        String line;
        while((line = reader1.readLine()) != null) {
            int end = line.indexOf(' ');
            admlog.add(line.substring(0, end));
            line = line.substring(end+1);
            admpass.add(line.substring(0));
        }
        reader1.close();
        
        File file2 = new File(filepath);
        FileReader fr2 = new FileReader(file2+"/userlogpass.txt");
        BufferedReader reader2 = new BufferedReader(fr2);
        while((line = reader2.readLine()) != null) {
            int end = line.indexOf(' ');
            usrlog.add(line.substring(0, end));
            line = line.substring(end+1);
            usrpass.add(line.substring(0));
        }
        reader2.close();
    }
}