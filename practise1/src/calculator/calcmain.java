package calculator;
import java.util.Scanner;
public class calcmain {
	public static void main( String[] args)
	{
int num1,num2;
char operator;
double answer=0;
Scanner scanObject=new Scanner(System.in);
System.out.println("Enter the first number:");
num1=scanObject.nextInt();
System.out.println("Enter the Second number:");
num2=scanObject.nextInt();
System.out.println("choose the operation to be performed");
operator=scanObject.next().charAt(0);
		switch(operator)
		{
		case '+' :answer=num1+num2;
				break;
		case '-':answer=num1-num2;
		break;
		case '*':answer=num1*num2;
		break;
		case '/':answer=num1/num2;
		break;
				
		}
		System.out.println(num1+ " "+operator+" "+num2+"="+answer );
	}
}

