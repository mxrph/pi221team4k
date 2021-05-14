package pi221team4k;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OgranTest {

	protected int summ;

	protected int mes;

@Before

	public void prisvoenieTest() {
	
	summ = 1234567; // тест 1

	mes = 60;	
}

@Test

public void raschetTest() {

	assertFalse(summ < 50000 || summ >= 3000000 || mes < 12 || mes > 60 );

	}

} 