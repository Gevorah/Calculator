
public class ComplexOperations{
	public static double suppRoot = 30;
	public static double squareRoot(double numberB){
		//revisar
		double result = 0;
		for(int i=0;i<=12;i++){
			result = (suppRoot/2)+(numberB/(2*suppRoot));
			suppRoot = result;
		}
		return result;
	}
	public static double nthRoot(double numberA, double numberB){
		//revisar
		double result = 0;
		for(int i=0;i<=12;i++){
			result = ((1/numberA)*(((numberA-1)*suppRoot)+(numberB/potentiation(suppRoot,(numberA-1)))));
			suppRoot = result;
		}
		return result;
	}
	public static double potentiation(double numberA, int numberB){
		double result=1;
		if(numberB!=0){
			for(int i=1;i<=numberB;i++){
			result *= numberA;
			}
		}
		//revisar_ solo enteros_ base+-_ exponente+_
		return result;
	}
	public static double factorial(double numberA){
		double result=1;
		if(numberA>0){
			for(int i=1;i<=numberA;i++){
			result *= i;
			}
		}
		return result;
	}
}