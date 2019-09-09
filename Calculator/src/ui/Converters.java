public class Converters{
	
	/**
	* <p> desc: <p> Given an number in decimal notation. This method allows convert the decimal notation to hexadecimal notation.
	* <p> pre: <p> The given number must be integer and must be located between zero and fifteen.
	* @param decimal This param  represents a number in decimal notation.
	* @return This method return the characters that represent the hexadecimal notation.
	*/
	public static String decimalToHexadecimal(int decimal){
		String hexadecimal = "";
		int division,residuo;
		if(decimal<16){
			hexadecimal = decToHex(decimal);
		}else{
			do{
				division = decimal/16;
				residuo = decimal%16;
				hexadecimal = decToHex(residuo)+hexadecimal;
				decimal = division;
			}while(decimal>=16);
			hexadecimal = decToHex(decimal)+hexadecimal;
		}
		return hexadecimal;
	}
	
	/**
	* <p> desc: <p> This method allows evaluate and convert a number to hexadecimal character.
	* <p> pre: <p> The number to evaluate take from other method initialized.
	* <p> post: <p> The number has been convert to hexadecimal character.
	* @param decimal This parameter represents the given number.
	* @return This method return a character hexadecimal.
	*/
	public static String decToHex(int decimal){
		String hexadecimal = "";
		if(decimal>=0 && decimal<=9){
			hexadecimal += decimal;
		}else if(decimal==10){
			hexadecimal = "A";
		}else if(decimal==11){
			hexadecimal = "B";
		}else if(decimal==12){
			hexadecimal = "C";
		}else if(decimal==13){
			hexadecimal = "D";
		}else if(decimal==14){
			hexadecimal = "E";
		}else if(decimal==15){
			hexadecimal = "F";
		}
		return hexadecimal;
	}
	
	/**
	* <p> desc: <p> Given a hexadecimal this method allows convert the hexadecimal notation to a number decimal.
	* <p> pre: <p> The hexadecimal must only have letters from A to F and integers.
	* @param hexadecimal This param represent a hexadecimal number.
	* @return This method return a number in decimal notation.
	*/
	public static int hexadecimalToDecimal(String hexadecimal){
		String notation = "0123456789ABCDEF";
		hexadecimal = hexadecimal.toUpperCase();
		int decimal = 0;
		int result = 0;
		int i = hexadecimal.length()-1;
		int j = 0;
		while(i>=0){
			char select = hexadecimal.charAt(j);
			int evaluate = notation.indexOf(select);
			result = evaluate*(int)(ComplexOperations.power(16,i));
			decimal += result;
			i--;
			j++;
		}
		return decimal;
	}
	
	/**
	* <p> desc: <p> This method allows convert the decimal notation to binary notation.
	* <p> pre: <p> The decimal must be a integer.
	* <p> post: <p> The binary has been obtain of the converter.
	* @param decimal This param represent a number in decimal notation.
	* @return This method return a number in binary notation.
	*/
	public static String decimalToBinary(int decimal){
		String binary = "";
		int i = 1;
		do{
			i = decimal/2;
			int evaluate = decimal%2;
			decimal = i;
			if(evaluate==0){
				binary = "0"+binary;
			}else{
				binary = "1"+binary;
			}
		}while(i!=0);
		return binary;
	}
	
	/**
	* <p> desc: <p> This method allows convert the binary notation to decimal notation.
	* <p> pre: <p> The binary must be only numbers zero or one.
	* <p> post: <p> The binary has been convert to decimal.
	* @param binary This param represent a binary number.
	* @return This method return a number in decimal notation.
	*/
	public static int binaryToDecimal(String binary){
		int decimal = 0;
		int i = 0;
		int j = binary.length()-1;
		while(i<binary.length()){
			char select = binary.charAt(j);
			if(select=='1'){
				decimal += (int)(ComplexOperations.power(2,i));
			}
			j--;
			i++;
		}
		return decimal;
	}
	
	/**
	* <p> desc: <p> This method allows convert the degrees to radians.
	* <p> post: <p> The degrees has been converted to radians.
	* @param degrees This param represent a given degrees.
	* @return This method return a number in radians.
	*/
	public static double degreesToRadians(double degrees){
		double result = 0;
		result = (degrees/180)*Calculator.PI;
		return result;
	}
	
	/**
	* <p> desc: <p> This method allows to convert the radians to degrees.
	* <p> post: <p> The radians has been coonvert to degrees.
	* @param radians This param represent a given radians.
	* @return This method return a number in degrees.
	*/
	public static double radiansToDegrees(double radians){
		double result = 0;
		result = (radians/Calculator.PI)*180;
		return result;
	}
	
	/**
	* <p> desc: <p> This method allows to convert the number to scientific notation.
	* <p> post: <p> The number has been convert to scientific notation.
	* @param number This param represent a given number.
	* @return This method return the number in scientific notation.
	*/
	public static String scientificNotation(double number){
		String result;
		result = String.format("%9.2E",number);
		return result;
	}
}