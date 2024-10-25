package GEYMNA;
import java.util.Scanner;
public class rate_of_change {
	
    public static void main(String args[]) 
    {
    Scanner input = new Scanner(System.in);
    
	System.out.print("CALCULATE THE RATE OF CHANGE OF A CURVE: \n_______________________________________\n");
	
	System.out.print("\nSelect given ordinate of a curve: \n1. y = x^2 + 2x - 3\n2. y = 3x^2 + 4\n3. y = 2x + 5 + (-x)^2\n4. \n5. \n6. \n7. \nto be update...\n\nChoose the ordinate of a curve to be solve: ");
	int RC = input.nextInt();
	switch(RC)
	{
	case 1:
	case 2:
	case 3:
	System.out.print("\nAbscissa points\nEnter the first number: ");
    int a = input.nextInt();
    
    System.out.print("Enter the second number: ");
    int b = input.nextInt();
    System.out.print("\nEnter the value of limit in zero: ");
    int k = input.nextInt();
    
    int f = 0;
    
    System.out.print("\nEnter the vertex sub 1 of a curve: ");
    int u = input.nextInt();
    
    if (b<u) 
        
  	  System.out.println("\nGraph: \"upward\"");
  	  else if (b>u)
  		  System.out.println("\nGraph: \"downward\""); 
  	  else if (b==0&&u==0)
		  System.out.println("\nGraph: \"from the origin\""); 
  	else if (b==u)
		  System.out.println("\nGraph: \"upward/downward\""); 
    
    

      switch(RC)
      {
      case 1:
          System.out.println("\n\nSolution: \ny = (x + dx)^2 + (x +dx) - 3\ny = (x^2 + 2xdx + dx^2) + (2x +2dx) - 3\n\nSubtact the original equation\ny = (x^2 + 2xdx dx^2) + (2x +2dx) - 3 - (x^2 - 2x + 3)\n\nSimplify; \ndy = 2xdx + dx^2 + 2dx\n\nEquate to rate of change; \ndy/dx = 2x + dx + 2");
      
         
          System.out.print("Enter the total coefficient of (dx): ");
          int c = input.nextInt();
      
          System.out.print("lim (dx) = " + k + "    so, \nlim (dx) = 2x + " + (k*c) + " + 2 \nRate of Change of a curve: 2x + 2");
      
          System.out.print("\n\nSubtitute the value of subscissa: \ndy/dx = 2(" + (a) + ") + " + k + " + 2\nFINAL RATE OF CHANGE (Curve):\ndy/dx = " + (2*a+2+k) +" units");
          
      break;
      
      case 2:
    	  System.out.println("\n\nSolution: \ny = 3(x + dx)^2 + 4\ny = 3(x^2 + 2xdx + dx^2) + 4\ny = 3x^2 + 6xdx + 3dx^2 + 4\n\nSubtact the original equation\ny = 3x^2 + 6xdx + 3dx^2 + 4 - (3x^2 + 4)\n\nSimplify; \ndy = 6xdx + 3dx^2\n\nEquate to rate of change; \ndy/dx = 6x + 3dx");
          
          
          System.out.print("Enter the total coefficient of (dx): ");
          int cc = input.nextInt();
      
          System.out.print("lim (dx) = " + k + "    so, \nlim (dx) = 6x + " + (k*cc) + " \nRate of Change of a curve: 6x");
      
          System.out.print("\n\nSubtitute the value of subscissa: \ndy/dx = 6(" + (a) + ") + " + k + "\nFINAL RATE OF CHANGE (Curve):\ndy/dx = " + (6*a+k) +" units");
          
          break;
          
      case 3:
    	  System.out.println("\n\nSolution: \ny = 2(x + dx) + 5 + (-x + dx)^2\ny = 2x + 2dx + 5 + (-x + dx)(-x + dx)\ny = 2x + 2dx + 5 + x^2 - 2xdx + dx^2\n\nSubtact the original equation\ny = 2x + 2dx + 5 + x^2 - 2xdx + dx^2 - (2x + 5 + (-x)^2)\n\nSimplify; \ndy = 2dx + 2dx^2 - 2xdx\n\nEquate to rate of change; \ndy/dx = -2x + 2dx + 2");
          
    	  int e = 2;
          
          System.out.print("Enter the total coefficient of (dx): ");
          int ccc = input.nextInt();
      
          System.out.print("lim (dx) = " + k + "    so, \nlim (dx) = -2x + " + (k*ccc) + " + 2 \nRate of Change of a curve: -2x + 2");
      
          System.out.print("\n\nSubtitute the value of subscissa: \ndy/dx = -2(" + (a) + ") + " + k + " + 2\nFINAL RATE OF CHANGE (Curve):\ndy/dx = " + (-2*a+k+2) +" units");
          
          break;
      } 
     if (k==0) 
          
    	  System.out.println("\n\nYou selected the limits in zero, the solution is: \"TRUE\"");
    	  else if (k!=0)
    		  System.out.println("\n\nYou selected the non-zero limits, the solution is: \"FALSE\" (Your limit is not in zero value.)");
      
      System.out.print("\n\nEnter the number of the ordinate you selected to view the \"short method\": ");
      int l = input.nextInt();
      
     
      switch(l)
      {
      case 1:
      case 2:
      case 3:
    	  
      if (l!=RC) 
          
    	  System.out.println("\n\n\"SELECT THE SAME NUMBER OF ORDINATE TO BE SOLVE!\"\nTHE SHORT METHOD BELOW IS NOT FOR THE ORDINATE YOU SELECTED.");
    	  else if (l==RC)
    		  System.out.println("\n\nCONTINUE!");
    
      
      switch(l)
      {
      case 1:
          System.out.print("\nShort method: \ny\' = f\'(x + h)\nyd/dx = x^2 + 2x - 3\nd/dx = 2x + 2 - " +k+"\nd/dx = 2("+(a)+") + 2");
          System.out.print("\nRate of Change = " + (2*a+k+2) +" units");
          
      break;
      case 2:
    	  System.out.print("\nShort method: \ny\' = f\'(x + h)\nd/dx = 3x^2 + 4\nd/dx = 6x + "+k+"\nd/dx = 6("+(a)+")");
    	  System.out.print("\nRate of Change = " + (6*a+k) +" units");
    	  
      break;
      case 3:
    	  System.out.print("\nShort method: \ny\' = f\'(x + h)\nd/dx = 2x + 5 +(-x^2)\nd/dx = -2x + "+k+" + 2\nd/dx = -2("+(a)+") + 2");
    	  System.out.print("\nRate of Change = " + (-2*a+k+2) +" units");
    	  
      break;
      }
 if (k==0) 
          
    	  System.out.println("\n\nThe solution is: \"TRUE\"");
    	  else if (k!=0)
    		  System.out.println("\n\nThe solution is: \"FALSE\" (Your limit is not in zero value.)");
      System.out.print("\n\nIf the short & long method is not the same...\"TRY AGAIN!\"\nIf the short and long method is the same...\"GOOD!\" ");
      break;
	default:
	  	  System.out.print("\n\n\"YOU SELECTED UNAVAILABLE ORDINATE. FAILED TO VIEW SHORT METHOD!\" ");
	}
      break;
	default:
    	System.out.print("\n\"YOU SELECTED UNAVAILABLE EQUATION\"\n\n\"FAILED TO SOLVE YOUR ORDINATE!\"");
    }

}
}
