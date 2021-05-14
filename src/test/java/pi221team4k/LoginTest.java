package pi221team4k;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

String login;
boolean prov1;

@Before
public void prisvoenieTest() {

login = "user"; // тест 1
prov1 = false;
}

@Test
public void logTest() {
	
if (login == "user") {
prov1=true;
}

assertTrue(prov1);

}
}