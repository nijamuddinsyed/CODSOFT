package p1;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of subjects");
	    int num=sc.nextInt();
	    int totmarks=0;
	    for(int i=1;i<=num;i++) {
	    	System.out.println("Enter the marks for subject="+i );
	    	totmarks +=sc.nextInt();
	    	
	    }
	    double averageper=(double)totmarks/num;
	    char grade=calgrade(averageper);
	    System.out.println("Total Marks="+totmarks);
	    System.out.println("Average Percentage="+averageper);
        System.out.println("Grade="+grade);
        sc.close();
	}
	private static char calgrade(double average) {
		if(average>=90)return 'A';
		else if(average>=80)return 'B';
		else if(average>=70)return 'C';
		else if(average>=60)return 'D';
		else return 'F';
	}

}
