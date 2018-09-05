package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();

	@Test
	void opeatorTestUnitTestArithmetic() {
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(5,oT.subtraction(7,2),"");
		assertEquals(4.0,oT.division(12,3),"");
		assertEquals(6,oT.multiplication(2,3),"");
		assertEquals(5,oT.modulus(12,7),"");
		
	}
	
	@Test
	void opeatorTestUnitTestRelational() {
		//Relational Operator
		assertEquals(true,oT.equalTo(12,12),"");
		assertEquals(false,oT.notEqualTo(12,12),"");
		assertEquals(false,oT.greaterThan(12,12),"");
		assertEquals(true,oT.greaterThanOrEqual(12,12),"");
		assertEquals(false,oT.lessThan(12,12),"");
		
	}
	@Test
	void opeatorTestUnitTestLogical() {
		//Logical Operator
		assertEquals(false,oT.logicalNot(true),"");
		assertEquals(true,oT.logicalAnd(true, true),"");
		assertEquals(true,oT.logicalOr(true, false),"");
		assertEquals(true,oT.logicalExOr(true, false),"");
		/*assertEquals(false,oT.shortCircuitAnd(true, false),"");
		assertEquals(false,oT.shortCircuitOr(true, false),"");*/
		
		//fail("Not yet implemented");
	}

}
