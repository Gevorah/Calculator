import java.lang.Math;
public class ComplexOperations{
	public static double suppRoot = 30;
	
	/**
	<p> desc: <p> This method allows obtain a root value.
	<p> pre: <p> The radicand must be a positive number.
	<p> post: <p> The root has been obtained of the square root.
	@param radicand This param represent a positive number.
	@throws NegativeRadicand If number is negative throw this exception.
	@return This method return the root obtain of the operation.
	*/
	public static double squareRoot(double radicand){
		double root = 0;
		if(radicand>=0){
			for(int i=0;i<=12;i++){
			root = (suppRoot/2)+(radicand/(2*suppRoot));
			suppRoot = root;
			}
		}else{
			throw new ArithmeticException("Only must be positive numbers");
		}
		return root;
	}
	
	/**
	<p> desc: <p> This method allows obtain a root value of any index.
	<p> pre: <p> The index must be a positive integer greater than 2. The radicand must be a positive number.
	<p> post: <p> The root has been obtained of the operation of the nth root.
	@param index This param represent a positive integer that is the index of the root.
	@param radicand This param represent a positive number to wich the nth root is taken.
	@throws NegativeIndexorRadicand If the index or the radicand are negative numbers throw this param.
	@return This method return the root obtain of the nth root.
	*/
	public static double nthRoot(int index, double radicand){
		double root = 0;
		if(index>=3 && radicand>=0){
			for(int i=0;i<=12;i++){
			root = ((1/index)*(((index-1)*suppRoot)+(radicand/power(suppRoot,(index-1)))));
			suppRoot = root;
			}
		}else{
			throw new ArithmeticException("Only must be positive numbers");
		}
		return root;
	}
	
	/**
	<p> desc: <p> This method allows obtain a power value of one number.
	<p> pre: <p> The exponent must be a positive integer.
	<p> post: <p> The result has been obtained with the operation.
	@param base This param is a number to boost.
	@param exponent This param is the number of times that must be multiply the base.
	@throws NegativeExponent If the exponent is a negative integer throw this exception.
	@return This method return a result obtain of multiply the base a number of times.
	*/
	public static double power(double base, int exponent){
		double result=1;
		if(exponent>=0){
			for(int i=1;i<=exponent;i++){
			result *= base;
			}
		}else{
			throw new ArithmeticException("The exponent only must be positive integer");
		}
		return result;
	}
	
	/**
	<p> desc: <p> This method allow obtain the factorial of one number.
	<p> pre: <p> The number must be a integer positive.
	<p> post: <p> The result has been obtained with the operation.
	@param number This param is the number who is goint to take the factorial.
	@throws IntegerOverflow If the number is greater than 90 throw this exception.
	@return This method return the result of the factorial.
	*/
	public static double factorial(int number){
		double result=1;
		if(number>0){
			if(number>=90){
				throw new ArithmeticException("Integer overflow");
			}else{
				for(int i=1;i<=number;i++){
				result *= i;
				}
			}
		}
		return result;
	}
	
	/**
	<p> desc: <p> This method allow obtain a logarithm base ten of any number.
	<p> pre: <p> Only numbers. The library has been declared.
	<p> post: <p> The result has been obtain with the operation.
	@return This method return the result of the operation.
	*/
	public static double logarithmTen(double number){
		double result = 0;
		result = java.lang.Math.log10(number);
		return result;
	}
	
	/**
	<p> desc: <p> This method allow obtain the logarithm of any base of any number.
	<p> pre: <p> Only numbers. The library has been declared.
	<p> post: <p> The result has been obtain with the operation.
	@return This method return the result of the operation.
	*/
	public static double logarithmN(double base, double number){
		double result = 0;
		result = logarithmTen(number)/logarithmTen(base);
		return result;
	}
}