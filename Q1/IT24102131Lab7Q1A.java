import java.util.Scanner;
public class IT24102131Lab7Q1A{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int marks;
		int count=1;
		double avg;
		int sum=0;
		System.out.println("Enter marks for four subjects :");
		while(count<5)
		{System.out.print("Enter Subject Mark "+count+":");
	    marks=input.nextInt();
		sum=sum+marks;
		count=count+1;}
		avg=sum/4;
                
		System.out.println("\nAverage is :"+ avg);
		if (avg>=75)
		{System.out.println("Overall grade is : Distinction");}
	    else if (avg>=50 && avg<=74)
		{System.out.println("Overall grade is : Credit");}
	   else
	   {System.out.println("Overall grade is : Fail");}
   
	}
}	