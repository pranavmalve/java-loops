package userinput;


import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int value=0;
		do {
			System.out.print("enter a num:5");
			value = scanner.nextInt();
		}while(value!=5);
		System.out.print("Your enter value is "+ value);
		
}
}