package team4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check implements Config {

	private List<String> adminLogins = new ArrayList<>();
    private List<String> adminPasswords = new ArrayList<>();
    
    private List<String> userLogins = new ArrayList<>();
    private List<String> userPasswords = new ArrayList<>();
    
    boolean lp;

    public boolean check1(String login, String password) throws IOException {
    	lp = false;
        setParam();
        for (int i = 0; i < adminLogins.size(); i++) {
            if (login.equals(adminLogins.get(i)) && password.equals(adminPasswords.get(i))) {
                lp = true;
                break;
            }
        }
        return lp;
    }
    
    public boolean check2(String login, String password) throws IOException {
    	lp = false;
        for (int i = 0; i < userLogins.size(); i++) {
            if (login.equals(userLogins.get(i)) && password.equals(userPasswords.get(i))) {
                lp = true;
                break;
            }
        }
        return lp;
    }

    public void setParam() throws IOException {
    	ClassLoader classLoader = getClass().getClassLoader();
    	File file1 = new File(classLoader.getResource("1.txt").getFile());

    	//File is found




    	//File file1 = new File("src/main/resources/2.txt");
    	FileReader fr1 = new FileReader(file1);
    	BufferedReader reader1 = new BufferedReader(fr1);
    	String line;
    	while((line = reader1.readLine()) != null) {
    		int end = line.indexOf(' ');
    		adminLogins.add(line.substring(0, end));
    		line = line.substring(end+1);
    		adminPasswords.add(line.substring(0));
    		}
    		reader1.close();

    	ClassLoader classLoader1 = getClass().getClassLoader();
    	File file2 = new File(classLoader1.getResource("2.txt").getFile());






    	//File file1 = new File("src/main/resources/1.txt");
    	FileReader fr2 = new FileReader(file2);
    	BufferedReader reader2 = new BufferedReader(fr2);
    	String line1;
    		while((line1 = reader2.readLine()) != null) {

    			int end = line1.indexOf(' ');
    			adminLogins.add(line1.substring(0, end));
    			line1 = line1.substring(end+1);
    	adminPasswords.add(line1.substring(0));
    }
    	reader2.close();
    }
}