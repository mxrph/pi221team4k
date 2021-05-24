package pi221team4k;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

	public class ProcTest {

		private int summ;
		private int mes;

@Before

	public void prisvoenieTest() {

			summ = 2500000; // тест 1
			mes = 36;
	}

@Test

	public void porcentTest() {

	double procMin;
	double procMax;
	double procRaznica;
	double procMes;
	double proc;

	if(summ < 250001) {
		procMin = 16.99;
		procMax = 23.49;
		procRaznica = procMax - procMin;

	} else if (summ < 700001) {
		procMin = 14.99;
		procMax = 18.99;
		procRaznica = procMax - procMin;

	} else {
		procMin = 11.99;
		procMax = 18.99;
		procRaznica = procMax - procMin;

	}

	procMes = procRaznica/48;
	proc = procMax - procMes*(mes - 12);
	assertEquals(15, (int)proc);
	System.out.println(proc);

	}

}