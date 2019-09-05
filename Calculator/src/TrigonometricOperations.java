
public class TrigonometicOperations{
	public final static PI = 3.14159265359;
	public static String convertDude= "";
	public static double sin(double numberA){
		double result = 0;
		if(convertDude.equalsIgnoreCase("Degrees")){
			double convert = degreesToRadians(numberA);
			result = numberA-((ComplexOperations.potentiation(numberA,3))/6)+((ComplexOperations.potentiation(numberA,5))/120);
			double convert = radiansToDegrees(result);
		}else{
			result = numberA-((ComplexOperations.potentiation(numberA,3))/6)+((ComplexOperations.potentiation(numberA,5))/120);
		}		
		return result;
	}
	public static double cos(double numberA){
		double result = 0;
		if(convertDude.equalsIgnoreCase("Degrees")){
			double convert = degreesToRadians(numberA);
			result = 1-((ComplexOperations.potentiation(numberA,2))/2)+((ComplexOperations.potentiation(numberA,4))/24)-((ComplexOperations.potentiation(numberA,6))/720);
			double convert = radiansToDegrees(result);
		}else{
			result = 1-((ComplexOperations.potentiation(numberA,2))/2)+((ComplexOperations.potentiation(numberA,4))/24)-((ComplexOperations.potentiation(numberA,6))/720);
		}
		return result;
	}
	public static double tan(double numberA){
		double result = 0;
		if(convertDude.equalsIgnoreCase("Degrees")){
			double convert = degreesToRadians(numberA);
			result = numberA+((ComplexOperations.potentiation(numberA,3))/3)+((2*(ComplexOperations.potentiation(numberA,5)))/15)-((17*(ComplexOperations.potentiation(numberA,7)))/315);
			double convert = radiansToDegrees(result);
		}else{
			result = numberA+((ComplexOperations.potentiation(numberA,3))/3)+((2*(ComplexOperations.potentiation(numberA,5)))/15)-((17*(ComplexOperations.potentiation(numberA,7)))/315);
		}
		return result;
	}
	public static double degreesToRadians(double numberA){
		double result = 0;
		result = (numberA/180)*PI;
		return result;
	}
	public static double radiansToDegrees(double numberA){
		double result = 0;
		result = (numberA/PI)*180;
		return result;
	}
}