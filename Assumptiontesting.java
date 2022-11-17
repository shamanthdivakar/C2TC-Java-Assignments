import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
public class Assumptiontesting {

	@Test
	void testonDev() {
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("ENV".equals(System.getProperty("DEV")));
      	
	}
Void testProd()
{
	return null;
}
}
