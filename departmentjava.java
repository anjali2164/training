public class department {
    
    String department_Name;
    int department_Id,
    int manager_Id,
    int location_Id;

   public department(String department_Name, int department_Id, int manager_Id,int location_Id)
   {
      this.department_Name = department_Name;
      this.department_Id = department_Id ;
      this.manager_Id = manager_Id;
      this.location_Id = location_Id;
  }
  public String getdepartment_Name()
  {
      return department_Name;
  }
 
  // method 2
  public int getdepartment_Id()
  {
      return department_Id;
  }
 
  // method 3
  public int getmanager_Id() 
  {

     return manager_Id;
  }
  

  public int getlocation_Id() 
  {

     return location_Id;
  }
  public static void main(String[] args)
  {
    // creating object using new operator
    department d1 = new department("human source", 10, 255, 654);

    System.out.println(d1.getdepartment_Name());
    System.out.println(d1.getdepartment_Id());
    System.out.println(d1.getmanager_Id());
    System.out.println(d1.getlocation_Id());
  }
}


