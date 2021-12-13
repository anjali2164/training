 class country {

   
    String country_Name;
    int country_Id; 
    int Region_Id;

   public country(String country_Name, int country_Id, int Region_Id)
   {
      this.country_Name = country_Name;
      this.country_Id = country_Id ;
      this.Region_Id = Region_Id;
  }
  public String getcountry_Name()
  {
      return country_Name;
  }
 
  // method 2
  public int getcountry_Id()
  {
      return country_Id;
  }
 
  // method 3
  public int getRegion_Id() 
  {

     return Region_Id;
  }
  
  public static void main(String[] args)
  {
    // creating object using new operator
    country c1 = new country("india", 344, 456);

    System.out.println(c1.getcountry_Name());
    System.out.println(c1.getcountry_Id());
    System.out.println(c1.getRegion_Id());
      
  }
}
