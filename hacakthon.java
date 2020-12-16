

import java.util.Scanner;

public class hacakthon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows = ");
        int n = sc.nextInt();
        if(n<=0) {
        	System.out.println("Enter the valid number");
        }
        for(int i =1;i<=n;i++)
        {
        	 for(int l =1;l<=n-i;l++) {
       		  System.out.print(" ");
        	 }
        	 if(i%4 ==0) {
        		  for(int k =1;k<=i;k++)
             	System.out.print("$ ");
        	 }else if(i%2 ==0) {
        		 for(int k =1;k<=i;k++)
        			System.out.print("# ");
        			
        	 }else {
        		  for(int k =1;k<=i;k++) {
        				System.out.print("* ");
              	}
        	 }
        	  
        	  System.out.println();
        }
     
	}

}

