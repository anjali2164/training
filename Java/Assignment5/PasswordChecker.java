public class PasswordChecker {


String password;
    
    class InvalidPasswordException extends Exception{ 

        public InvalidPasswordException(String message) {
            super(message);
        }
    }
        public PasswordChecker(String password){
            this.password = password;
        }

        void validationPassword(){
            String capitalAlphabets = "";
            String smallAlphabets = "";
            String specialCharacter = "";
            if(password.length()<=8){
                for(char a:password.toCharArray()){
                  if(a>=65 && a<=90)
                      capitalAlphabets+=Character.toString(a);
                    else if(a=35 || a=36 || a=37 || a=38 || a=45 || a=95)
                       specialCharacter+=Character.toString(a);
                    else
                         smallAlphabets+=Character.toString(a);

                 
                    }
              if((capitalAlphabets.length()==0) ||(specialCharacter.length(==0))||(smallAlphabets.length()==0))
              {
                  throw new InvalidPasswordException();
              }
              else
               {
                   System.out.println("This is valid password");
               }
                else {
                    throw new InvalidPasswordException();
                
                }
             }


        }
    public static void main(String[] args){

        password p = new password;
        try{
            p.validationPassword();
        }
         catch(InvalidPasswordException e){
                e.message();
         }


    }


    }

