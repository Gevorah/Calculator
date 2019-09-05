import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		double numberA,numberB;
		char operator;
		boolean finish = false;
		numA = reader.nextDouble();
		do{
			operator = reader.next().charAt(0);
			if(operator!='#'){
				numberB = reader.nextDouble();
				if(operator=='+'){
				numberA = SimpleOperations.sum(numberA, numberB);
				System.out.println(numberA);
				}else if(operator=='-'){
				numberA = SimpleOperations.subtraction (numberA, numberB);
				System.out.println(numberA);
				}else if(operator=='*'){
				numberA = SimpleOperations.product(numberA, numberB);
				System.out.println(numberA);
				}else if(operator=='/'){
				numberA = SimpleOperations.division(numberA, numberB);
				System.out.println(numberA);
				}else if(operator=='%'){
				numberA = SimpleOperations.module(numberA, numberB);
				System.out.println(numberA);
				}else if(operator=='^'){
				numberA = potentiation(numberA, numberB);
				System.out.println(numberA);
				}
			}else{
				finish = true;
			}
		}while(finish==false);
	}
}