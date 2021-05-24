package pi221team4k;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import team4.Check;

public class LoginTest {

boolean prov1;

@Before
public void prisvoenieTest() throws IOException {
Check check = new Check();
prov1 = check.check2("1", "1");
}

@Test
public void logTest() {
assertTrue(prov1);
}
}