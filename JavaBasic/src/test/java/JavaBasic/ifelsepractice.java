package JavaBasic;

import java.util.Scanner;

public class ifelsepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("give first number");
int number1= scan.nextInt();


System.out.println("give Second number");
int number2= scan.nextInt();


System.out.println("give Third  number");
int number3= scan.nextInt();

if ((number1 >number2) && (number1 > number3))
{
	System.out.println(number1 + " is greater ");
	
}

else if ((number2 >number1) && (number2 > number3)) {
	System.out.println(number2 + " is greater ");
}

else 
{
	System.out.println(number3 + " is greater ");
}


System.out.println("Give complement");
String com =scan.next();
String comvar ="";
switch (com) {
case "thanks":
	comvar = "welcome";
	break;
case "wow":
	comvar="thanks";break;
case "nice":
comvar= "ha ha ";break;

default:
	comvar="thanks";
	break;
}

System.out.println(comvar);

	}
	
}
