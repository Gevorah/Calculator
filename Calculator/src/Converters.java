public class Converters{
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
	public static String decimalToBinary(int numberA){
		String binary = "";
		int result = 1;
		do{
			result = numberA/2;
			int evaluate = numberA%2;
			numberA = result;
			if(evaluate==0){
				binary = "0"+binary;
			}else{
				binary = "1"+binary;
			}
		}while(result!=0);
		return binary;
	}
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
	public static String binaryToHexadecimal(String binary){
		int decimal = binaryToDecimal(binary);
		String hexadecimal = decimalToHexadecimal(decimal);
		return hexadecimal;
	}
	public static String hexadecimalToBinary(String hexadecimal){
		int decimal = hexadecimalToDecimal(hexadecimal);
		String binary = decimalToBinary(decimal);
		return binary;
	}
	public static double degreesToRadians(double numberA){
		double result = 0;
		result = (numberA/180)*Calculator.PI;
		return result;
	}
	public static double radiansToDegrees(double numberA){
		double result = 0;
		result = (numberA/Calculator.PI)*180;
		return result;
	}
}