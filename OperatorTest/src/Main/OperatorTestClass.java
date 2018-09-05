package Main;

public class OperatorTestClass {

	public Object addition(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 + operand2;
	}

	public Object subtraction(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 - operand2;
	}

	public Object division(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return (double)operand1 / (double)operand2;
	}

	public Object multiplication(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 * operand2;
	}

	public Object modulus(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 % operand2;
	}

	public boolean equalTo(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 == operand2;
	}

	public boolean notEqualTo(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 != operand2;
	}

	public boolean greaterThan(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 > operand2;
	}

	public boolean greaterThanOrEqual(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 >= operand2;
	}

	public boolean lessThan(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 < operand2;
	}

	public boolean logicalNot(boolean operand1 ) {
		// TODO Auto-generated method stub
		return ! operand1;
	}

	public boolean logicalAnd(boolean operand1, boolean operand2) {
		// TODO Auto-generated method stub
		return operand1 && operand2;
	}

	public boolean logicalOr(boolean operand1, boolean operand2) {
		// TODO Auto-generated method stub
		return operand1 || operand2;
	}

	public boolean logicalExOr(boolean operand1, boolean operand2) {
		// TODO Auto-generated method stub
		return operand1 ^ operand2;
	}
		
	public boolean shortCircuitAnd(boolean operand1, boolean operand2) {
		// TODO Auto-generated method stub
		return operand1 && operand2;
	}

	public boolean shortCircuitOr(boolean operand1, boolean operand2) {
		// TODO Auto-generated method stub
		return operand1 || operand2;
	}
	public int  bitNot(int operand1){
 		return ~operand1;
 	}
 	public int  bitAnd(int operand1,int operand2){
 		return operand1 & operand2;
 	}
 	public int bitOr(int operand1, int operand2) {
		return operand1 | operand2;
	}
 	public int bitExOr(int operand1, int operand2) {
		
		return operand1 ^ operand2;
	}
 	public int bitShiftRightZero(int operand1) {
	
		return operand1>>1;
	}
 	public int bitShiftLeft(int operand1) {
	
		return operand1<<1;
	}

	public int bitShiftRight(int operand1){
		
        return operand1>>1;
	}

}
