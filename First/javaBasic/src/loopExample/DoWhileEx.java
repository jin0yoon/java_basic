package loopExample;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum += num;
//			num++;
//		}
//		while (num <= 10);
//		
//		System.out.println(sum);
//		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println(sum);
	
	}

}
