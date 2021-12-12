public class location {
    
   
        String stress_address;
        String post_code;
        String city;
        String state_province;
        int location_id;
        int country_id;    
       public location(String stress_address, String post_code, String city, String state_province, int location_id, int country_id; )
       {
          this.stress_address = stress_address;
          this.post_code = post_code;
          this.city = city;
          this.state_province = state_province;
          this.location_id = location_id;
          this.country_id = country_id;
                 }
      public String getstress_address()
      {
          return stress_address;
              }
      public String getpost_code()
      {
          return post_code;
      }
     
      public String getcity()
      {
          return city;
      }
     
      public String getstate_province()
      {
          return state_province;
      }
     
      // method 2
      public int getlocation_Id()
      {
          return location_Id;
      }
     
      // method 3
      public int getcountry_Id() 
      {
    
         return country_Id;
      }
      
      public static void main(String[] args)
      {
        // creating object using new operator
        location l1 = new location ("MRC", "INII", "HYD", "JJJ", 20, 19);
    
        System.out.println(l1.getstate_address());
        System.out.println(l1.getpost_code());
        System.out.println(l1.getcity());
        System.out.println(l1.getstate_province());
        System.out.println(l1.getlocation_id());
        System.out.println(l1.getcountry_id());
        
        
      }
    
    
}
    

