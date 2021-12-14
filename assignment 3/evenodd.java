import java.util.Scanner;
    

public class evenodd {
   
public static void main(String[] args){

    Scanner n = new Scanner(System.in);
	System.out.print("Enter number:");        
	int x=n.nextInt();
         if((x%2==0) && (x<=20))
        {
            System.out.println("Not Weird");
        }
           else if(( x>=2 && x<=5) || (x%2==0))
           {
               System.out.println("not weird");
           }
           else if(( x>=6 && x<=20) || (x%2==0))
           {
               System.out.println(" weird");
           }
          else 
          {
             System.out.println("weird");
         }
         
  }

}

