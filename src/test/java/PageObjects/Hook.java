package PageObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before
	public void beforescenario() {
		System.out.println("This will run before the scenario");
	}
	
	@After
	public void afterscenario() {
		System.out.println("This will run after the scenario");
	}
}
