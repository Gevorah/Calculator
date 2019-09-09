import java.lang.Math;
public class TrigonometricOperations{
	public static int  convertDude = 1;
	
	/**
	* <p> desc: <p> This method allow obtain the sin of any number.
	* <p> pre: <p> The degrees must be converted to radians.
	* <p> post: <p> The result has been obtain with the operation.
	* @return This method return the result of the operation.
	*/
	public static double sin(double number){
		double result = 0;
		if(convertDude==1){
			double convert = Converters.degreesToRadians(number);
			result = java.lang.Math.sin(number);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude==2){
			result = java.lang.Math.sin(number);
		}		
		return result;
	}
	
	/**
	* <p> desc: <p> This method allow obtain the cos of any number.
	* <p> pre: <p> The degrees must be converted to radians.
	* <p> post: <p> The result has beem obtain with the operation.
	* @return This method return the result of the operation.
	*/
	public static double cos(double number){
		double result = 0;
		if(convertDude==1){
			double convert = Converters.degreesToRadians(number);
			result = java.lang.Math.cos(number);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude==2){
			result = java.lang.Math.cos(number);
		}
		return result;
	}
	
	/**
	* <p> desc: <p> This method allow obtain the tan of any number.
	* <p> pre: <p> The degrees must be converted to radians.
	* <p> post: <p> The result has beem obtain with the operation.
	* @return This method return the result of the operation.
	*/
	public static double tan(double number){
		double result = 0;
		if(convertDude==1){
			double convert = Converters.degreesToRadians(number);
			result = java.lang.Math.tan(number);
			convert = Converters.radiansToDegrees(result);
		}else if(convertDude==2){
			result = java.lang.Math.tan(number);
		}
		return result;
	}
}