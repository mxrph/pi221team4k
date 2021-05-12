package Project4Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StandartTest {

private int summ;
private int mes;

@Before
public void prisvoenieTest() {

summ = 2500000; // тест 1
mes = 36;

//summ = 1000000; // тест 2
//mes = 48;

//summ = 200000; тест 3
//mes = 12;
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

assertEquals(15, (int)proc); // тест 1

//assertEquals(13, (int)proc); тест 2

//assertEquals(23, (int)proc); тест3
}
}
