import java.lang.Math;
public class TrigonometricOperations{
	public static String convertDude= "";
	public static double sin(double numberA){
		double result = 0;
		if(convertDude=="1"){
			double convert = Converters.degreesToRadians(numberA);
			result = java.lang.Math.sin(numberA);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude=="2"){
			result = java.lang.Math.sin(numberA);
		}		
		return result;
	}
	public static double cos(double numberA){
		double result = 0;
		if(convertDude=="1"){
			double convert = Converters.degreesToRadians(numberA);
			result = java.lang.Math.cos(numberA);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude=="2"){
			result = java.lang.Math.cos(numberA);
		}
		return result;
	}
	public static double tan(double numberA){
		double result = 0;
		if(convertDude=="1"){
			double convert = Converters.degreesToRadians(numberA);
			result = java.lang.Math.tan(numberA);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude=="2"){
			result = java.lang.Math.tan(numberA);
		}
		return result;
	}
}