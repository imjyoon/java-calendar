package lucy.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("두 수의 합은"+ sum + "입니다");
		
		
	}	
}
