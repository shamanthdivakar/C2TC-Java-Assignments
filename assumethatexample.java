import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.Test;
class nan{

	public static Object divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	public static Object multiply(int a, int b) {
		return a*b;
	}
}

public class assumethatexample {
	@Test
	void testInAllEnvironments() {
		assumingThat("DEV".equals(System.getenv("ENV")),
		() -> {
			//perform these assertions only on the DEV server
			assertEquals(2, nan.divide(4,2));
		});
		//perform these assertions in all environments
		assertEquals(42, nan.multiply(6,7));
		}
	}
