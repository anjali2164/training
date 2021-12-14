public class conditions {
    
public static void main(String[] args){

 int x = 21;
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