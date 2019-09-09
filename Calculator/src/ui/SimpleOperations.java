
public class SimpleOperations{
	/**
	<p> desc: <p> This method allows sum two numbers and get a value of that sum.
	<p> pre: <p> The given numbers must belong to the domain of real numbers.
	<p> post: <p> A sum has been performed.
	@param numberA This param represents a number.
	@param numberB This param represents a number.
	@throws IntegerOverflow If the given numbers overflow the Integer.MAX_VALUE throw this exception.
	@return This method return the value that is obtain of the sum of the given numbers.
	*/
	public static double add(double numberA, double numberB){
		double result = 0;
		if(numberB>0? numberA>Integer.MAX_VALUE-numberB : numberA<Integer.MIN_VALUE-numberB){
		throw new ArithmeticException("Integer overflow");
		}else{
		result = (numberA+numberB);
		}
		return result;
	}
	
	/**
	<p> desc: <p> This method allows subtract two numbers and get a value of that substract.
	<p> pre: <p> The given numbers must belong to the domain of real numbers.
	<p> post: <p> A subtraction has been performed.
	@param numberA This param represents a number.
	@param numberB This param represents a number.
	@throws IntegerOverflow If the given numbers overflow the Integer.MIN_VALUE throw this exception.
	@return This method return the value that is obtain of the subtraction of the given numbers.
	*/
	public static double subtract(double numberA, double numberB){
		double result;
		result = (numberA-numberB);
		return result;
	}
	
	/**
	<p> desc: <p> This method allows multiply a number by other.
	<p> pre: <p> The given numbers must belong to the domain of real numbers.
	<p> post: <p> The product has been obtained of multiply the two numbers.
	@param numberA This param represents a number.
	@param numberB This param represents a number.
	@throws IntegerOverflow If the given numbers overflow the Integer.MAX_VALUE throw this exception.
	@return This method return the product that is obtained of the multiply of the given numbers.
	*/
	public static double multiply(double numberA, double numberB){
		double product;
		if(numberB>0? numberA>Integer.MAX_VALUE/numberB || numberB<Integer.MIN_VALUE/numberA 
		: numberB==-1 && numberA==Integer.MIN_VALUE){
		throw new ArithmeticException("Integer overflow");
		}else{
		product = (numberA*numberB);
		}
		return product;
	}
	
	/**
	<p> desc: <p> This method allows divide a number by another.
	<p> pre: <p> The given numbers cannot be zero and must belong to the domain of real numbers.
	<p> post: <p> The quotient has been obtained of divide the two numbers. 
	@param dividend This param represents a number.
	@param divider This param represents a number.
	@throws DivisionByZero If the given numbers are zero throw this exception.
	@return This method return the quotient of the division between two numbers.
	*/
	public static double divide(double dividend, double divider){
		double quotient=0;
		if(divider==0){
			throw new ArithmeticException("Infinity. Cannot be divided by zero.");
		}else{
			quotient = (dividend/divider);
		}
		return quotient;
	}
	
	/**
	<p> desc: <p> This method allows take the remainder of the division.
	<p> pre: <p> The given numbers cannot be zero and must belong to the domain of real numbers.
	<p> post: <p> The remainder has been obtained of divide two numbers.
	@param dividend This param represents a number.
	@param divider This param represents a number.
	@throws DivisionByZero If the given numbers are zero throw this exception.
	@return This method return the remainder of the division between two numbers.
	*/
	public static double module(double dividend, double divider){
		double remainder;
		if(divider==0){
			throw new ArithmeticException("Undefined.");
		}else{
			remainder = (dividend%divider);
		}
		return remainder;
	}
}