
public class SimpleOperations{
	public static double add(double numberA, double numberB){
		double result;
		if(numberB>0? numberA>Integer.MAX_VALUE-numberB : numberA<Integer.MIN_VALUE-numberB){
		throw new ArithmeticException("Integer overflow");
		}else{
		result = (numberA+numberB);
		}
		return result;
	}
	public static double subtract(double numberA, double numberB){
		double result;
		result = (numberA-numberB);
		return result;
	}
	public static double multiply(double numberA, double numberB){
		double result;
		if(numberB>0? numberA>Integer.MAX_VALUE/numberB || numberB<Integer.MIN_VALUE/numberA 
		: numberB==-1 && numberA==Integer.MIN_VALUE){
		throw new ArithmeticException("Integer overflow");
		}else{
		result = (numberA*numberB);
		}
		return result;
	}
	public static double divide(double numberA, double numberB){
		double result=0;
		if(numberB==0){
			System.out.println("Infinity. Cannot be divided by zero.");
		}else{
			result = (numberA/numberB);
		}
		return result;
		//revisar
	}	
	public static double module(double numberA, double numberB){
		double result;
		result = (numberA%numberB);
		return result;
	}
}