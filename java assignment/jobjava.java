public class job {

    String job_title;
    String job_Id; 
    int max_salary;
    int min_salary;

   public job(String job_title, String job_Id, int max_salary, int min_salary)
   {
      this.job_title = job_title;
      this.job_Id = job_Id ;
      this.max_salary = max_salary;
      this.min_salary = min_salary;
  }
  public String getjob_title()
  {

      return job_title;
  }
 
  // method 2
  public String getjob_Id()
  {
      return job_Id;
  }
 
  // method 3
  public int getmax_salary() 
  {

     return max_salary;
  }
  public int getmin_salary() 
  {

     return min_salary;
  }
  public static void main(String[] args)
  {
    // creating object using new operator
    job j1 = new job("software","IT" 37, 456);

    System.out.println(j1.getjob_title());
    System.out.println(j1.getjob_Id());
    System.out.println(j1.getmax_salary());
    System.out.println(j1.getmin_salary());
      
  }
}
   

