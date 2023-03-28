package demo.function;

import java.util.Scanner;

public class Fibonacci {
	
	
	public int deretFibonacci(int deretFibonacci) {
	    int n1 = 1; //inisiasi nilai awal n1
	    int n2 = 0; //inisiasi nilai awal n2
	    int n = 0;
		for(int i = 1; i <= deretFibonacci; i++) {
	    	n2 = n1;	//untuk mengupdate nilai n2
	    	n1 = n;		//untuk mengupdate nilai n1
	    	n = n1+n2;
		}
		return n;
	}
	
//	public static void main(String[] args) {
//		
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.print("Enter username :");
//
//	    int baris = myObj.nextInt(); // Read user input
//	    
//	    int n1 = 1;
//	    int n2 = 0;
//	    int n = 0;
//	    int result = 0;
//	    for(int i = 1; i <= baris; i++) {
//	    	n2 = n1;
//	    	n1 = n;
//	    	n = n1+n2;
//	    	if(baris ==i) {
//		    	System.out.println("bilangan fibonacci ke "+i + " : "+n);		    		
//	    	}
//	    }
//	}

}
