package pack_01;

import org.testng.annotations.Test;

public class Script_01_Test {
@Test
public void know_name() {
	String NAME = System.getProperty("name");
	System.out.println("HI!..................."+NAME);
}
@Test
public void know_skill() {
	String SKILL = System.getProperty("skill");
}
}
