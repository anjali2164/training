import java.util.Scanner;

public class table {
    

    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=x.nextInt();
      if(n>=2 && n<=20)
      {
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    }
}
