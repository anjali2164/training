public class region {
   
    String region_Name;
    int region_Id; 

   public region(String region_Name, int region_Id)
   {
      this.region_Name = region_Name;
      this.region_Id = region_Id;
  }
  public String getregion_Name()
  {
  return  region_Name ;
  }
 
  // method 2
  public int getregion_Id()
  {
      return region_Id;
  }

  public static void main(String[] args)
  {
    // creating object using new operator
    region r1 = new region("denmark", 44);

    System.out.println(r1.getregion_Name());
    System.out.println(r1.getregion_Id());
    
  }
}


