import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner readerNumbers = new Scanner(System.in);
		Scanner readerText = new Scanner(System.in);
		boolean finish = false;
		do{
			System.out.println("\n"+"1.Converters \n"+"2.Trigonometric Operations \n"+"3.Other Operations \n"+"4.IMPORTANT: Usage Guide \n"+"5.Exit \n");
			int main = readerNumbers.nextInt(),trigonometric;
			String binary = "", hexadecimal = "", x = "",resultSn = "",pi = "";
			int converter,type,decimal;
			double number,numberA,numberB,result;
			boolean otherOperation = false;
			if(main==1){
				System.out.println("\n"+"Converters: \n"+"1.Binary, Decimal and Hexadecimal \n"+"2.Degrees and Radians \n"+"3.Scientific Notation \n");
				converter = readerNumbers.nextInt();
				if(converter==1){
					System.out.println("\n" +"Type of input: \n"+"1.Binary \n"+"2.Decimal \n"+"3.Hexadecimal \n");
					type = readerNumbers.nextInt();
					if(type==1){
						binary = readerText.next();
						decimal = Converters.binaryToDecimal(binary);
						hexadecimal = Converters.decimalToHexadecimal(decimal);
						System.out.println("\n"+"Binary: "+binary);
						System.out.println("Decimal: "+decimal);
						System.out.println("Hexadecimal: "+hexadecimal+" \n");
					}else if(type==2){
						decimal = readerNumbers.nextInt();
						binary = Converters.decimalToBinary(decimal);
						hexadecimal = Converters.decimalToHexadecimal(decimal);
						System.out.println("\n"+"Binary: "+binary);
						System.out.println("Decimal: "+decimal);
						System.out.println("Hexadecimal: "+hexadecimal+" \n");
					}else if(type==3){
						hexadecimal = readerText.next();
						decimal = Converters.hexadecimalToDecimal(hexadecimal);
						binary = Converters.decimalToBinary(decimal);
						System.out.println("\n"+"Binary: "+binary);
						System.out.println("Decimal: "+decimal);
						System.out.println("Hexadecimal: "+hexadecimal+" \n");
					}
				}else if(converter==2){
					System.out.println("\n"+"Type of input: \n"+"1.Degrees \n"+"2.Radians \n");
					type = readerNumbers.nextInt();
					if(type==1){
						number = readerNumbers.nextDouble();
						result = Converters.degreesToRadians(number);
						System.out.println("\n"+"Degrees: "+number);
						System.out.println("Radians: "+result+" \n");
					}else if(type==2){
						pi = readerNumbers.next();
						if(pi.equalsIgnoreCase("PI")){
							number = PI;
						}else{
							number = Double.parseDouble(pi);
						}
						result = Converters.radiansToDegrees(number);
						System.out.println("\n"+"Degrees: "+result);
						System.out.println("Radians: "+number+" \n");
					}
				}else if(converter==3){
					System.out.println("\n"+"Input: ");
					number = readerNumbers.nextDouble();
					resultSn = Converters.scientificNotation(number);
					System.out.println("\n"+"Input: "+number);
					System.out.println("Scientific Notation: "+resultSn);
				}
			}else if(main==2){
				System.out.println("\n"+"Trigonometric Operations: \n"+"1.Sin(x) \n"+"2.Cos(x) \n"+"3.Tan(x) \n");
				trigonometric = readerNumbers.nextInt();
				System.out.println("\n"+"Type of input: \n"+"1.Degrees \n"+"2.Radians \n");
				TrigonometricOperations.convertDude = readerNumbers.nextInt();
				if(trigonometric==1){
					x = readerText.next();
					if(x.equalsIgnoreCase("PI")){
						numberB = PI;
					}else{
						numberB = Double.parseDouble(x);
					}
					result = TrigonometricOperations.sin(numberB);
					System.out.println("\n"+"Sin"+"("+numberB+")= "+result+" \n");
				}else if(trigonometric==2){
					x = readerText.next();
					if(x.equalsIgnoreCase("PI")){
						numberB = PI;
					}else{
						numberB = Double.parseDouble(x);
					}
					result = TrigonometricOperations.cos(numberB);
					System.out.println("\n"+"Cos"+"("+numberB+")= "+result+" \n");
				}else if(trigonometric==3){
					x = readerText.next();
					if(x.equalsIgnoreCase("PI")){
						numberB = PI;
					}else{
						numberB = Double.parseDouble(x);
					}
					result = TrigonometricOperations.tan(numberB);
					System.out.println("\n"+"Tan"+"("+numberB+")= "+result+" \n");
				}
			}else if(main==3){
				System.out.println("\n"+"Other Operations: \n"+
				"~add(+)        ~subtract(-)   ~multiply(*)   ~divide(/) \n"+
				"~module(%)     ~power(^)      ~factorial(!) \n"+
				"~square root(sqrt)            ~nth root (root) \n"+
				"~logarithm base 10(log)       ~logarithm base n(logn) \n");
				String first = "", second = "";
				first = readerText.next();
				if(first.equalsIgnoreCase("PI")){
						numberA = PI;
				}else{
					numberA = Double.parseDouble(first);
				}
				do{
					String operator = readerText.next();
					if(operator.equalsIgnoreCase("sqrt")){
						numberA = ComplexOperations.squareRoot(numberA);
						System.out.println("= \n"+numberA);
					}else if(operator.equalsIgnoreCase("log")){
						numberA = ComplexOperations.logarithmTen(numberA);
						System.out.println("= \n"+numberA);
					}else if(operator.equalsIgnoreCase("root")){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = ComplexOperations.nthRoot((int)numberA,numberB);
						System.out.println("= \n"+numberA);
					}else if(operator.equalsIgnoreCase("logn")){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = ComplexOperations.logarithmN(numberA,numberB);
						System.out.println("= \n"+numberA);
					}else if(operator.charAt(0)=='+'){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = SimpleOperations.add(numberA, numberB);
						System.out.println("= \n"+numberA);
					}else if(operator.charAt(0)=='-'){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = SimpleOperations.subtract(numberA, numberB);
						if(numberA!=0){
							System.out.println("= \n"+numberA);
						}
					}else if(operator.charAt(0)=='*'){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = SimpleOperations.multiply(numberA, numberB);
						System.out.println("= \n"+numberA);
					}else if(operator.charAt(0)=='/'){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = SimpleOperations.divide(numberA, numberB);
						if(numberB!=0){
							System.out.println("= \n"+numberA);
						}else{
							otherOperation = true;
						}
					}else if(operator.charAt(0)=='%'){
						second = readerText.next();
						if(second.equalsIgnoreCase("PI")){
							numberB = PI;
						}else{
							numberB = Double.parseDouble(second);
						}
						numberA = SimpleOperations.module(numberA, numberB);
						if(numberA!=0){
							System.out.println("= \n"+numberA);
						}else{
							otherOperation = true;
						}
					}else if(operator.charAt(0)=='^'){
						numberB = readerNumbers.nextDouble();
						numberA = ComplexOperations.power(numberA, (int)numberB);
						System.out.println("= \n"+numberA);
					}else if(operator.charAt(0)=='!'){
						numberA = ComplexOperations.factorial((int)numberA);
						if(numberA!=0){
							System.out.println("= \n"+numberA);
						}else{
							otherOperation = true;
						}
					}else if(operator.charAt(0)=='#'){
						otherOperation = true;
					}
				}while(otherOperation==false);
			}else if(main==4){
				usageGuide();
			}else if(main==5){
				finish=true;
			}
		}while(finish==false);
	}
	/**
	* <p> des: <p> Show a instructions for the correct use of the calculator.
	*/
	public static void usageGuide(){
		System.out.println("Other Operations Functions"+"\n"+
		"The operations are simultaneous. For example: 'input:1 input:* input:5 output:= output:5 input:+ input:1 output:= output:6 input:#'."+
		"\n"+"If you want finish the operations write the char '#'. One example is above of this."+
		"\n"+"For operator as sqrt and log. Writer first the number and then the operator. For example: 'input:4 input:log output:= output:2'");
	}
	public static final double PI = 3.14159265359;
}