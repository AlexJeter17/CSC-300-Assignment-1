import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Assignment One of CSC300 - Alex Jeter \n");
    
    Mainrepeat();
    
    System.out.println("\nThank you for using my program.");
  }

  public static void rightTriangle(int num){

	  for (int i = 1; i <= num; i++) {
		  
	     for(int a = 1; a <= num - i; a++) {
	    	 System.out.print("  ");
	     }
	     
	     for(int j = 1; j <= i; j++) {
	    	 System.out.print("* ");
	     }
	     
	     System.out.println();
	  }
	  
  }
	  
  public static void EqualTriangle(int num){
	  
	  for(int i = 1, z = 0; i <= num; i++, z = 0) {
		  for(int y = 1; y <= num - i; y++) {
			  System.out.print("  ");
		  }
	  
		  while(z != 2 * i - 1) {
			  System.out.print("* ");
			  z++;
	  	  }
		  System.out.println();
	  }
    
  }
  
  public static void Diamond(int num){

	  int org = num;
	  num /= 2;
	  System.out.print(" ");
	  for(int i = 1, z = 0; i <= num; i++, z = 0) {
		  System.out.print("  ");
		  for(int y = 1; y <= num -i; y++) {
			  System.out.print("  ");
		  }
	  
		  while(z != 2 * i - 1) {
			  System.out.print("* ");
			  z++;
	  	  }
		  System.out.println();
		  System.out.print(" ");
	  }
	  
	  for(int i = 0; i < org;i++) {
		  System.out.print("* ");
	  }
	  System.out.println();
	  
	  for(int i = num; i > 0; i--) {
		  System.out.print("   ");
		  for(int a = 0; a < num - i; a++) {
			  System.out.print("  ");
		  }
		  for(int b = 0; b < (i * 2) - 1; b++){
			  System.out.print("* ");
		  }
		  System.out.println();
		  System.out.print("");
	  }
	  
	  
  }
  
  public static void NumTriangle(int num){
	  
	  int sNeed;
	  int s = num * 2;
	  
	  for(int i = 1; i < Math.pow(2,num); i *= 2){
		  for(sNeed = s; sNeed > 0; sNeed--) {
		   System.out.print(" ");
	   }
	   System.out.print("1 ");
	   
	   int j;
	   for(j = 2; j <= i; j *= 2){
		   System.out.print(j+ " ");
	   }
	   
	   j /= 2;
	   for(int k = j / 2; k >= 2; k /= 2){
		   System.out.print(k + " ");
	   }
	   if(i>1)
		   System.out.print("1 ");
	   	System.out.println();
	   	s-=2; 
	  }

	 }
	  
  public static void Mainrepeat() {
	    Scanner scnr = new Scanner(System.in);
	  
	    System.out.println("Please choose one of the following \n1. Right Triangle\n2. Equilateral Triangle\n3. Diamond\n4. Numbered Triangle");

	    int num = scnr.nextInt();
	    
	    while(num > 4 || num < 1){
	      System.out.println("This is not a valid number. Please choose a number 1, 2, 3, or 4.");
	      num = scnr.nextInt();
	    }
	    
	    int height = 0;
	    
	    while(num <= 4 && num >= 1){
	    	
	      if (num == 3){
	        System.out.println("How large would you like it to be? (Odd number less than 10)");
	        height = scnr.nextInt();
	      }
	      
	      else{
	    	  System.out.println("How large would you like it to be? (10 is max height)");
	    	  height = scnr.nextInt();
	      }
	      
	      while(height < 1 || height > 10){
	    	  System.out.println("This is not a valid number. Please put a valid number.");
	    	  height = scnr.nextInt();
	      }
	      
	      if(num == 3 && height % 2 == 0) {
	    	 
	    	  while(height % 2 == 0) {
	    		  
	    		  if(height < 1 || height > 10){
	            	  System.out.println("This is not a valid number. Please put a valid number.");
	            	  height = scnr.nextInt();
	              }
	    		  
	    		  System.out.println("This is not a valid number for Diamond Shape. Please put a valid number.");
	    		  height = scnr.nextInt();
	    	  }
	      }
	      char boo;
	      switch(num) {
	      case 1:
	          rightTriangle(height);
	          System.out.println("\nWould you like to choose another pattern?(y for yes, n for no)");
	          boo = scnr.next().charAt(0);
	          Character.toLowerCase(boo);
	          if(boo == 'y')
	          	Mainrepeat();
	          else
	        	  break;
	        
	      case 2:
	          EqualTriangle(height);
	          System.out.println("\nWould you like to choose another pattern?(y for yes, n for no)");
	          boo = scnr.next().charAt(0);
	          Character.toLowerCase(boo);
	          if(boo == 'y')
	          	Mainrepeat();
	          else
	        	  break;
	      case 3:
	          Diamond(height);
	          System.out.println("\nWould you like to choose another pattern?(y for yes, n for no)");
	          boo = scnr.next().charAt(0);
	          Character.toLowerCase(boo);
	          if(boo == 'y')
	          	Mainrepeat();
	          else
	        	  break;
	      case 4:
	          NumTriangle(height);
	          System.out.println("\nWould you like to choose another pattern?(y for yes, n for no)");
	          boo = scnr.next().charAt(0);
	          Character.toLowerCase(boo);
	          if(boo == 'y')
	          	Mainrepeat();
	          else
	        	  break;
	      }
	      break;
	    }
	    
	      
	    scnr.close();
  }
	  
}
 