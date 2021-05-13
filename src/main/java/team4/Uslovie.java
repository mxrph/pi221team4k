package team4;

import java.io.IOException;


public abstract class Uslovie {


  public static float proc;
  public static float mproc;
  public static float mesyac;
  public static float pereplata;
  public static float itog;
  
  public float mess() {
	  	mesyac = (int)(mesyac*100);// Округление в целое
	  	mesyac = mesyac/100; // Перевод в десятичное
		return mesyac;
		 
		}
	public float perepl() {
		pereplata = (int)(pereplata*100);
		pereplata = pereplata/100;
		return pereplata;
		}
	public float procc() {
		proc = (int)(proc*100); // Округление процента в целое
	    proc /= 100; // Перевод числа в десятичную форму для последующих вычислений
		return proc;
		}
	public void dosr(int dosr_try) {
		if (dosr_try == 1) {
		proc -=2; }
	}

 
	abstract float calculation(int summ_try, int mesyac_try, int dosr_try) throws IOException;
}