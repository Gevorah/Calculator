import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner readerNumbers = new Scanner(System.in);
		Scanner readerText = new Scanner(System.in);
		boolean finish = false;
		do{
			System.out.println("\n"+"1.Converters \n"+"2.Trigonometric Operations \n"+"3.Other Operations \n"+"4.Usage Guide \n"+"5.Exit \n");
			int main = readerNumbers.nextInt(),trigonometric;
			String binary = "", hexadecimal = "", x = "";	
			int converter,type,decimal;
			double number,numberA,numberB,result;
			boolean otherOperation = false;
			if(main==1){
				System.out.println("\n"+"Converters: \n"+"1.Binary, Decimal and Hexadecimal \n"+"2.Degrees and Radians \n");
				converter = readerNumbers.nextInt();
				if(converter==1){
					System.out.println("\n" +"Type of input: \n"+"1.Binary \n"+"2.Decimal \n"+"3.Hexadecimal \n");
					type = readerNumbers.nextInt();
					if(type==1){
						binary = readerText.nextLine();
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
						hexadecimal = readerText.nextLine();
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
						number = readerNumbers.nextDouble();
						result = Converters.radiansToDegrees(number);
						System.out.println("\n"+"Degrees: "+result);
						System.out.println("Radians: "+number+" \n");
					}
				}
			}else if(main==2){
				System.out.println("\n"+"Trigonometric Operations: \n"+"1.Sin(x) \n"+"2.Cos(x) \n"+"3.Tan(x) \n");
				trigonometric = readerNumbers.nextInt();
				System.out.println("\n"+"Type of input: \n"+"1.Degrees \n"+"2.Radians \n");
				TrigonometricOperations.convertDude = readerText.nextLine();
				if(trigonometric==1){
					x = readerText.nextLine();
					if(x.equalsIgnoreCase("PI")){
						numberB = PI;
					}else{
						numberB = Double.parseDouble(x);
					}
					result = TrigonometricOperations.sin(numberB);
					System.out.println("\n"+"Sin"+"("+numberB+")= "+result+" \n");
				}else if(trigonometric==2){
					x = readerText.nextLine();
					if(x.equalsIgnoreCase("PI")){
						numberB = PI;
					}else{
						numberB = Double.parseDouble(x);
					}
					result = TrigonometricOperations.cos(numberB);
					System.out.println("\n"+"Cos"+"("+numberB+")= "+result+" \n");
				}else if(trigonometric==3){
					x = readerText.nextLine();
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
				first = readerText.nextLine();
				if(first.equalsIgnoreCase("sqrt")){
					second = readerText.nextLine();
					if(first.equalsIgnoreCase("PI")){
						numberA = PI;
					}else{
						numberA = Double.parseDouble(second);
					}
					numberA = ComplexOperations.squareRoot(numberA);
					System.out.println(numberA);
				}else if(first.equalsIgnoreCase("log")){
					second = readerText.nextLine();
					if(first.equalsIgnoreCase("PI")){
						numberA = PI;
					}else{
						numberA = Double.parseDouble(second);
					}
					numberA = ComplexOperations.logarithmTen(numberA);
					System.out.println(numberA);
				}else{
					if(first.equalsIgnoreCase("PI")){
						numberA = PI;
					}
					numberA = Double.parseDouble(first);
					do{
						String operator = readerText.nextLine();
						if(operator.equalsIgnoreCase("root")){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = ComplexOperations.nthRoot((int)numberA,numberB);
							System.out.println(numberA);
						}else if(operator.equalsIgnoreCase("logn")){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = ComplexOperations.logarithmN(numberA,numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='+'){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = SimpleOperations.add(numberA, numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='-'){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = SimpleOperations.subtract(numberA, numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='*'){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = SimpleOperations.multiply(numberA, numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='/'){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = SimpleOperations.divide(numberA, numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='%'){
							second = readerText.nextLine();
							if(second.equalsIgnoreCase("PI")){
								numberB = PI;
							}else{
								numberB = Double.parseDouble(second);
							}
							numberA = SimpleOperations.module(numberA, numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='^'){
							numberB = readerNumbers.nextDouble();
							numberA = ComplexOperations.power(numberA, (int)numberB);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='!'){
							numberA = ComplexOperations.factorial((int)numberA);
							System.out.println(numberA);
						}else if(operator.charAt(0)=='#'){
							otherOperation = true;
						}
					}while(otherOperation==false);
				}
			}else if(main==4){
				usageGuide();
			}else if(main==5){
				finish=true;
			}
		}while(finish==false);
	}
	public static void usageGuide(){
		System.out.println("\n"+"Hello moto");
	}
	public static final double PI = 3.14159265359;
}