package Project4Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UslovieTest {

protected int summ;
protected int mes;

@Before
public void prisvoenieTest() {

summ = 1234567; // тест 1
mes = 60;

//summ = 3000000; тест 2
//mes = 12;

//summ = 100000; тест 3
//mes = 32;
}

@Test
public void raschetTest() {

assertFalse(summ < 50000 || summ >= 3000000 || mes < 12 || mes > 60 );
}
}

