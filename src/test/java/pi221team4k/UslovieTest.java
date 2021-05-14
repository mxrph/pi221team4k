package pi221team4k;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UslovieTest {
  
	protected double proc;
    protected int dosr_try;
  
    @Before
    public void procTest() {
    	
    	proc = 23.49; // тест №1
    	dosr_try = 1;
    }

	@Test
	public void provercaprocTest() {
		
		if (dosr_try == 1) {
			proc -= 2;
		}
		assertEquals(21, (int)proc);
		System.out.println(proc);
	}
}