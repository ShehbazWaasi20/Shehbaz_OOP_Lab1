package lab;

import java.util.Scanner;


public class logInDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dep;
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		System.out.println(opt);
	}

}
