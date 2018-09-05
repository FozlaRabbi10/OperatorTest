package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();

	@Test
	void test() {
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(5,oT.subtraction(7,2),"");
		
	}

}
