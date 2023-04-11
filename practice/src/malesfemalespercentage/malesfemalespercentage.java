package malesfemalespercentage;

import java.util.Scanner;

public class malesfemalespercentage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double male_percentage, Female_percentage;
		int males, females, total;
		
		System.out.println("Enter number of males: ");
		males = in.nextInt();
		
		System.out.println("Enter number of females: ");
		females = in.nextInt();
		
		total = males + females;
		
		System.out.println("The total of number of student is:" + total);
		male_percentage = 100* males / total;
		Female_percentage = 100* females / total;
		
		System.out.println("Males: ");
		System.out.format("%.2f",male_percentage);
		System.out.println("%");
		
		System.out.println("Females: ");
		System.out.format("%.2f",Female_percentage);
		System.out.println("%");
	}

}
