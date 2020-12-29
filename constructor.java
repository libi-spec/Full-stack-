class Xyz{



            Xyz(){
 
           System.out.println("this is xyz default constructor");
           }
           
           Xyz(int x, int y){
       
               System.out.println("this is xyz parameterised constructor");

           }
         
          
           void disp(){
           
                      System.out.println("This is disp1 method");
          
        
           }
}

class Abc extends Xyz
   
         Abc(){
                super(10,20);
                System.out.println("this is Abc default constructor");
    }

}
class constructor{

public static void main(String args[]){