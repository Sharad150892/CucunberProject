package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LoginHooks {
	@Before
	public void start() {

		System.out.println("Process Started");

	}

	@After
	public void end() {

		System.out.println("Process End");
	}

}
