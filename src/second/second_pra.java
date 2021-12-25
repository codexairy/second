package second;

import java.util.Random;
import java.util.Scanner;

public class second_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.4
//		Random rand = new Random();
//		int rand1=rand.nextInt(12)+1;
//		if(rand1 == 1)
//			System.out.println("January");
//		else if(rand1 == 2)
//			System.out.println("February");
//		else if(rand1 == 3)
//			System.out.println("March");
//		else if(rand1 == 4)
//			System.out.println("April");
//		else if(rand1 == 5)
//			System.out.println("May");
//		else if(rand1 == 6)	
//			System.out.println("June");
//		else if(rand1 == 7)
//			System.out.println("July");
//		else if(rand1 == 8)
//			System.out.println("August");
//		else if(rand1 == 9)
//			System.out.println("September");
//		else if(rand1 == 10)
//			System.out.println("October");
//		else if(rand1 == 11)
//			System.out.println("November");
//		else
//			System.out.println("December");
		
		//3.9
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//		String s = input.nextLine();
//		int sum = 0;
//		for(int i = 8;i >= 0;i--) {
//			String t = String.valueOf(s.charAt(i));
//			sum+=Integer.parseInt(t)*(i+1);
//		}
//		int a = sum % 11;
//		if(a != 10)
//			System.out.println("The ISBN-10 number is " + s + a);
//		else
//			System.out.println("The ISBN-10 number is " + s + "X");
		
		//3.15
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter your lottery pick (three digits): ");
//		int lottery = (int)(Math.random() * 1000);
//		int guess = input.nextInt();
//		
//		int lotteryDigits1 = lottery / 100;
//		int lotteryDigits2 = (lottery / 10) % 10;
//		int lotteryDigits3 = lottery % 10;
//		
//		int guessDigits1 = guess / 100;
//		int guessDigits2 = (guess / 10) % 10;
//		int guessDigits3 = guess % 10;
//		
//		int[] b = new int[10];
//		for(int i = 0;i < 10;i++) 
//			b[i] = 0;
//		b[lotteryDigits1]+=1;
//		b[lotteryDigits2]+=1;
//		b[lotteryDigits3]+=1;
//				
//  		if(guess == lottery)
//			System.out.println("win 10000 dollars");
//		else if(b[guessDigits1] > 0 || b[guessDigits2] > 0 || b[guessDigits3] > 0) {
//			b[guessDigits1]-=1;
//			b[guessDigits2]-=1;
//			b[guessDigits3]-=1;
//			if(b[lotteryDigits1] > 0 || b[lotteryDigits2] > 0 || b[lotteryDigits3] > 0) 
//				System.out.println("win 1000 dollars");
//			else
//				System.out.println("win 3000 dollars");
//		}
//		else 
//			System.out.println("no win");
		
		//3.19
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter three edges: ");
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		int sum = 0;
//		if(a + b > c || a + c > b || b + c > a) {
//			sum = a + b + c;
//			System.out.println("legal" + " C = " + sum);
//		}
//		else
//			System.out.println("illegal");
			
		//3.21
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter year: (e.g., 2012): ");
//		int y=input.nextInt();
//		System.out.print("Enter month: 1-12: ");
//		int m=input.nextInt();
//		System.out.print("Enter the day of the month: 1-31: ");
//		int d=input.nextInt();
//		if(m == 1 || m == 2) {
//			m += 12;
//			y -= 1;
//		}
//		int j = y / 100;
//		int k = y % 100;
//		int h;
//		String s;
//		h=(d + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
//		if(h == 0)
//			s = "Saturday";
//		else if(h == 1)
//			s = "Sunday";
//		else if(h == 2)
//			s = "Monday";
//		else if(h == 3)
//			s = "Tuesday";	
//		else if(h == 4)
//			s = "Wednesday";
//		else if(h == 5)
//			s = "Thursday";
//		else
//			s = "Friday";
//		System.out.println("Day of the week is " + s);
	
		//3.22
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter a point with two coordinates: ");
//		double x = input.nextDouble();
//		double y = input.nextDouble();
//		
//		if(Math.sqrt(x * x + y * y) <= 10)
//			System.out.println("Point (" + x + ", " + y + ") is in the circle");
//		else
//			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
		
		//3.23
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter a point with two coordinates: ");
//		double x = input.nextDouble();
//		double y = input.nextDouble();
//		
//		if(Math.abs(x) <= 5 && Math.abs(y) <= 2.5)
//			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
//		else
//			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		
		//3.24
//		int number = (int)(Math.random() * 13 + 1);
//		int color = (int)(Math.random() * 4 + 1);
//		        
//		String a;
//		if(number == 1)
//			a = "ACE";
//		else if(number == 11)
//		    a = "Jack";
//		else if(number == 12)
//		    a = "Queen";
//		else if(number == 13)
//		    a = "King";
//		else
//		    a = "" + number;
//
//		String b;
//		if(color == 1)
//		    b = "Clubs";
//		else if(color == 2)
//			b = "Diamonds";
//		else if(color == 3)
//			b = "Hearts";
//		else
//			b = "Spades";   
//		System.out.println("The card you picked is " + a + " of " + b);
	
		//3.27
//		Scanner input = new Scanner(System.in);	
//		System.out.print("Enter a point's x- and y-coordinates: ");
//		double x = input.nextDouble();
//		double y = input.nextDouble();
//
//		int flag = 0;
//		if(x < 0 || x > 200 || y < 0 || y > 100)
//			flag = 1;
//		double k = 100.0 / -200.0;
//		double a = y - k * x;
//		if(a < 0 || a > 100)
//			flag = 1;
//		if(flag == 1)
//			System.out.println("The point is not in the triangle");
//		else
//			System.out.println("The point is in the triangle");
		
		//3.28
//		Scanner input = new Scanner(System.in);	
//		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
//		double x1 = input.nextDouble();
//		double y1 = input.nextDouble();
//		double w1 = input.nextDouble();
//		double h1 = input.nextDouble();
//		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
//		double x2 = input.nextDouble();
//		double y2 = input.nextDouble();
//		double w2 = input.nextDouble();
//		double h2 = input.nextDouble();
//
//		if(Math.abs(x1 - x2) <= (w1 - w2) / 2 && Math.abs(y1 - y2) <= (h1 - h2) / 2)
//			System.out.println("r2 is inside r1");
//		else if(Math.abs(x1 - x2) > (w1 - w2) / 2 && Math.abs(x1 - x2) < (w1 + w2) / 2 && Math.abs(y1 - y2) > (h1 - h2) / 2 && Math.abs(y1 - y2) < (h1 + h2) / 2)
//			System.out.println("r2 overlaps r1");
//		else
//			System.out.println("r2 does not overlap r1");
		
		//3.29
//		Scanner input = new Scanner(System.in);	
//		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
//		double x1 = input.nextDouble();
//		double y1 = input.nextDouble();
//		double r1 = input.nextDouble();
//		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
//		double x2 = input.nextDouble();
//		double y2 = input.nextDouble();
//		double r2 = input.nextDouble();
//
//		if(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= r1 - r2)
//			System.out.println("circles2 is inside circles1");
//		else if(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= r1 + r2)
//			System.out.println("circles2 overlaps circles1");
//		else
//			System.out.println("circles2 does not overlap circles1");
		
		//5.7
//		double fee = 10000;
//		double sum = 0;
//		for(int i = 1;i <= 10;i++) 
//			fee *= 1.05;	
//		double fee1 = fee;
//		for(int i = 1;i <= 4;i++) {
//			fee1 *= 1.05;
//			sum += fee1;
//		}
//		System.out.println(fee + " " + sum);
		
		//5.17
//		Scanner input = new Scanner(System.in);		
//		System.out.print("Enter the number of lines: ");
//		int m = input.nextInt();
//		
//		for (int i = 1; i <= m;i++){       
//                for (int a = i; a < m; a++)
//                    System.out.print("  ");
//            for (int b = i; b > 0 ; b--)
//                System.out.printf("%d ",b);
//            if(i >= 2) {
//                for (int c = 2; c <= i; c++)
//                    System.out.printf("%d ", c);
//            }
//            System.out.println();
//		}
		
		//5.19
//		int m = 8;
//		for (int i = 1; i <= m;i++){       
//			for (int a = i; a < m; a++)
//				System.out.print("    ");
//            for (int b = 0; b <= i - 1 ; b++) {
//                int n = (int)Math.pow(2,b);
//                if(n / 100 > 0)
//                	System.out.printf("%d ",n);
//                else if(n % 100 / 10 > 0)
//                	System.out.printf(" %d ",n);
//                else
//                	System.out.printf("  %d ",n);
//            }
//            if(i >= 2) {
//                for (int c = i - 2; c >= 0; c--) {
//                	int n = (int)Math.pow(2,c);
//                	if(n / 10 > 0)
//                		System.out.printf(" %d ",n);
//                	else
//                		System.out.printf("  %d ",n);
//                }
//            }
//            System.out.println();
//		}
	
		//5.21
//		Scanner input = new Scanner(System.in);	
//		System.out.print("Loan Amount: ");
//		double amount = input.nextDouble();
//		System.out.print("Number of Years: ");
//		int year = input.nextInt();
//		System.out.println("Interest Rate  Monthly Payment  Total Payment");
//		System.out.println();
//		
//		double interestRate = 0,monthlyPayment = 0,totalPayment = 0;
//		for(double i = 5.0;i <= 8.0;i += 1.0 / 8) {
//			interestRate = i / 100;
//			monthlyPayment = amount * (interestRate / 12) / (1 - 1 / Math.pow((1+(interestRate / 12)), year * 12));
//			totalPayment = monthlyPayment * year * 12;	
//			System.out.printf("%4.3f",i);
//			System.out.print("%");
//			System.out.printf("         %6.2f           %8.2f\n",monthlyPayment,totalPayment);
//		}
		
		//5.22
//		Scanner input = new Scanner(System.in);
//		System.out.print("Loan Amount: ");
//		double amount = input.nextDouble();
//		System.out.print("Number of Years: ");
//		int year = input.nextInt();
//		System.out.print("Annual Interest Rate: ");
//		double interestRate = input.nextDouble();
//		
//		double monthlyPayment = (amount * interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200,year * 12));
//		double totalPayment = monthlyPayment * year * 12;
//		System.out.println();
//		System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
//		System.out.printf("Total Payment: %.2f\n\n",totalPayment);
//		System.out.println("Payment# Interest  Principal   Balance");
//		
//		double interest = 0.0,principal = 0.0;
//		for(int i = 1;i <= year * 12;i++) {
//			interest = interestRate / 1200 * amount;
//			principal = monthlyPayment - interest;
//			amount -= principal;
//			if(i == year * 12)
//				principal += amount;
//			System.out.print(i + "        ");
//			System.out.printf("%5.2f     %6.2f      %7.2f\n", interest,principal,amount);
//		}
		
		//5.25
//		for(int i = 10000;i <= 100000;i += 10000) {
//			double sum = 0;
//			for(int j = 1;j <= i / 2;j++) {
//				sum += 1.0 / ((4 * j - 3) * (4 * j - 1));
//			}
//			sum *= 8;
//			System.out.printf("i = %d,¦Ð = %f\n", i,sum);
//		}
		
		//5.26
//		for(int i = 10000;i <= 100000;i += 10000) {
//			double sum = 0;
//			double m = 1.0;
//			for(int j = 1;j <= i;j++) {
//				m *= j;
//				sum += 1.0 / m;
//			}
//			System.out.printf("i = %d,e = %f\n", i,sum + 1);
//		}
		
		//5.27
//		int sum = 0;
//		for(int y = 101;y <= 2100;y++) {
//			if((y % 4 == 0) && (y % 100 != 0) || (y % 400 ==0)) {
//				sum++;
//				System.out.print(y + " ");
//				if(sum % 10 == 0) 
//					System.out.println();
//			}
//		}
//		System.out.printf("\nthe day of run is %d",sum);
		
		//5.28
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the year: ");
//		int y = input.nextInt();
//		System.out.print("Enter the day: ");
//		int d = input.nextInt();
//		
//		String s1 = "";
//		String s2 = "";
//		for(int m = 1;m <= 12;m++) {
//			if(m == 1) {
//				s1 = "January 1, ";
//			}
//			else if(m == 2) {
//				d += 31;
//				s1 = "Febrary 1, ";
//			}
//			else if(m == 3) {
//				d += 28;
//				s1 = "March 1, ";
//			}
//			else if(m == 4) {
//				d += 31;
//				s1 = "April 1, ";
//			}
//			else if(m == 5) {
//				d += 30;
//				s1 = "May 1, ";
//			}
//			else if(m == 6) {
//				d += 31;
//				s1 = "June 1, ";
//			}
//			else if(m == 7) {
//				d += 30;
//				s1 = "July 1, ";
//			}
//			else if(m == 8) {
//				d += 31;
//				s1 = "August 1, ";
//			}
//			else if(m == 9) {
//				d += 31;
//				s1 = "September 1, ";
//			}
//			else if(m == 10) {
//				d += 30;
//				s1 = "October 1, ";
//			}
//			else if(m == 11) {
//				d += 31;
//				s1 = "November 1, ";
//			}
//			else {
//				d += 30;
//				s1 = "Decemebr 1, ";
//			}
//			if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
//				if(m != 1)
//					d += 1;
//			}
//			int w = d % 7;
//			if(w == 1)
//				s2 = " is Monday";
//			else if(w == 2)
//				s2 = " is Tuesday";
//			else if(w == 3)
//				s2 = " is Wednesday";
//			else if(w == 4)
//				s2 = " is Thursday";
//			else if(w == 5)
//				s2 = " is Friday";
//			else if(w == 6)
//				s2 = " is Saturday";
//			else
//				s2 = " is Sunday";
//			System.out.println(s1 + y + s2);
//			s1 = "";
//			s2 = "";
//		}
//		
		//5.29
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the year: ");
//		int y = input.nextInt();
//		System.out.print("Enter the day: ");
//		int d = input.nextInt();
//		
//		String s1 = "";
//		String s2 = "";
//		for(int m = 1;m <= 12;m++) {
//			if(m == 1) {
//				s1 = "January 1, ";
//			}
//			else if(m == 2) {
//				d += 31;
//				s1 = "Febrary 1, ";
//			}
//			else if(m == 3) {
//				d += 28;
//				s1 = "March 1, ";
//			}
//			else if(m == 4) {
//				d += 31;
//				s1 = "April 1, ";
//			}
//			else if(m == 5) {
//				d += 30;
//				s1 = "May 1, ";
//			}
//			else if(m == 6) {
//				d += 31;
//				s1 = "June 1, ";
//			}
//			else if(m == 7) {
//				d += 30;
//				s1 = "July 1, ";
//			}
//			else if(m == 8) {
//				d += 31;
//				s1 = "August 1, ";
//			}
//			else if(m == 9) {
//				d += 31;
//				s1 = "September 1, ";
//			}
//			else if(m == 10) {
//				d += 30;
//				s1 = "October 1, ";
//			}
//			else if(m == 11) {
//				d += 31;
//				s1 = "November 1, ";
//			}
//			else {
//				d += 30;
//				s1 = "Decemebr 1, ";
//			}
//			if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
//				if(m != 1)
//					d += 1;
//			}
//			int w = d % 7;
//			if(w == 1)
//				s2 = " is Monday";
//			else if(w == 2)
//				s2 = " is Tuesday";
//			else if(w == 3)
//				s2 = " is Wednesday";
//			else if(w == 4)
//				s2 = " is Thursday";
//			else if(w == 5)
//				s2 = " is Friday";
//			else if(w == 6)
//				s2 = " is Saturday";
//			else
//				s2 = " is Sunday";
//			System.out.println(s1 + y + s2);
//			s1 = "";
//			s2 = "";
//		}
		
		//5.32
//		int lottery1 = (int)(Math.random() * 10);
//		int lottery2 = 0;
//		for(int i = 0;i <= 9;i++) {
//			if(i != lottery1) {
//				lottery2 = i;
//				break;
//			}
//		}
//		System.out.println(lottery1 * 10 + lottery2);
		
		//5.33
//		int sum = 0;
//		for(int i = 6;i < 10000;i++) {
//			sum = 0;
//			for(int j = 1;j < i;j++) {
//				if(i % j == 0)
//					sum += j;
//			}
//			if(i == sum)
//				System.out.println(i);
//		}
		
		//5.36
//		Scanner input = new Scanner(System.in);	
//		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//		String s = input.nextLine();
//		int sum = 0;
//		for(int i = 8;i >= 0;i--) {
//			String t = String.valueOf(s.charAt(i));
//			sum += Integer.parseInt(t)*(i+1);
//		}
//		int a = sum % 11;
//		if(a != 10)
//			System.out.println("The ISBN-10 number is " + s + a);
//		else
//			System.out.println("The ISBN-10 number is " + s + "X");
		
		//5.37
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter an integer: ");
//		int x = input.nextInt();
//		int sum = 0;
//		int i = 1;
//		while(x > 0) {
//			int a = x % 2;
//			sum += a * i;
//			i *= 10;
//			x /= 2;
//		}
//		System.out.println(sum);
		
		//5.38
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter an integer: ");
//		int x = input.nextInt();
//		int sum = 0;
//		int i = 1;
//		while(x > 0) {
//			int a = x % 8;
//			sum += a * i;
//			i *= 10;
//			x /= 8;
//		}
//		System.out.println(sum);
		
		//5.45
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter 10 numbers: ");
//		
//		double sum1 = 0; 
//		double sum2 = 0;
//		for(int i = 0;i < 10;i++) {
//			double x = input.nextDouble();
//			sum1 += x;
//			sum2 += Math.pow(x,2);
//		}
//		double ave = sum1 / 10;
//		double dev = Math.sqrt((sum2 - sum1 * sum1 / 10) / 9);
//		System.out.println("The mean is " + ave);
//		System.out.println("The standard deviation is " + dev);
	}
}
