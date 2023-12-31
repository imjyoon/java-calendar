package lucy.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		String prompt = "cal> ";
		
		System.out.println("반복횟수를 입력하세요");	
		int repeat = sc.nextInt();
		
		
		for(int i=0; i<repeat; i++) {			
			System.out.println("달을 입력하세요");
			System.out.print(prompt);
			int month = sc.nextInt();
			if(month == -1) {
				break;					
			}		
			System.out.println( month+"월은" + cal.maxDaysOfMonth(month) + "까지 있습니다");					
		}
		cal.printSampleCalendar();		
	}
}