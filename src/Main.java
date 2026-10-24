
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("welcome");
      
    Random  random = new Random();
   int  com = random.nextInt(100);
  
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter any number[0-101] ");
  
   
    int num;
    int count =0;
    
   do {
	    num = sc.nextInt();
	   count++;
    if(num==com) {
    	System.out.println("Congratulation! you guess correctly ");
    	System.out.println("Attempts"+" = " + count );

    	
    }
   else if (num>com ) {
	   System.out.println("Your entered number is large ");
   }
   else { 
	   System.out.println("Your entered number is small");
   }
   } while(num != com );
    
   sc.close();
      
	}
	
	  

}
