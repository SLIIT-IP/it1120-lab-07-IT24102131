import java.util.Scanner;
public class IT24102131Lab7Q3{
	public static void main(String[]args){
		final double Discount_Rate=0.05;
		double billAmount,amountToPay;
		char payMode;
		
		Scanner input = new Scanner(System.in);
		for(int customerCount=1;customerCount<=5;customerCount++){
			System.out.println("customer "+ customerCount);
			System.out.print("Enter total bil amount: ");
			billAmount=input.nextDouble();
			System.out.print("Enter mode of payment (C for cash,O for other): ");
			payMode=input.next().toUpperCase().charAt(0);
			double discount=billAmount*Discount_Rate;
			amountToPay=billAmount-discount;
			if(payMode=='C'){
				System.out.println("Discount is : "+discount);
			System.out.println("Amount to be paid: "+amountToPay);}
				
			else if(payMode=='O'){
				amountToPay=billAmount;
				System.out.println("No discount applicable");
			System.out.println("Amount to be paid: "+billAmount);}
				
			else {System.out.println("Payment Mode is Not Valid");}
			 
			System.out.println();
			}
			}	
		}	     
				