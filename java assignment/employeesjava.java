public class employees {
    
    
        String first_name;
        String last_name;
        String email;
        String job_id;
        String phone_int;
        int hire_date;
        int department_Id;
        int manager_Id;
        int employee_id;
        float salary;
        float commission_id;
    
       public employee ( String first_name, String last_name, String email, String job_id, String phone_int, int hire_date, int department_Id,  int manager_Id, int employee_id, float salary, float commission_id)
       {
          this.first_name = first_name;
          this.last_name = last_name;
          this.email = email;
          this.job_id = job_id;
          this.phone_int = phone_int;
          this.hire_date = hire_date;
          this.department_id = department_id;
          this.manager_id = manager_id;
          this.employee_id = employee_id;
          this.salary = salary;
          this.commission_id = commission_id;
       }
      public String getfirst_name()
      {
          return first_name;
      }
     
      // method 2
      public String getlast_name()
      {
          return last_name;
      }
     
      public String getemail()
      {
          return email;
      }
     
      public String getjob_id()
      {
          return job_id;
      }
     
      public String getphone_int()
      {
          return phone_int;
      }
     
      public int gethire_date() 
      {
    
         return hire_date;
      }
      // method 3
      
    
      public int getdepartment_Id() 
      {
    
         return department_Id;
      }
     public int getmanager_Id() 
      {
    
         return manager_Id;
      }
      
        public int getemployee_id() 
      {
    
         return employee_Id;
      }
     
      
      public float getsalary() 
      {
    
         return salary;
      }
      
      public int commission_id() 
      {
    
         return commission_id;
      }
      
      public static void main(String[] args)
      {
        // creating object using new operator
        employee e1 = new employee("jhon", "son", "jon@gmail.com", "It", "IN", 21/2/118, 10, 22, 47, 100, 12);
    
        System.out.println(e1.getfirst_name());
        System.out.println(e1.getlast_name());
        System.out.println(e1.getemail());
        System.out.println(e1.getjob_id());
        System.out.println(e1.getphone_int());
        System.out.println(e1.gethire_date());
        System.out.println(e1.getdepartemnt_id());
        System.out.println(e1.getmanager_id());
        System.out.println(e1.getemployee_id());
        System.out.println(e1.getsalary());
        System.out.println(e1.getcommission_id());
       
       
       
    
    
      }
    
}
