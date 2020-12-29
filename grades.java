import java.util.Scanner;
class grades
{
   
    public static void main(String args[])
    {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the marks:");
           int marks=input.nextInt();
      
    
     if(marks >= 90){
     System.out.println("O");}
     else if(marks>=80 && marks<90){
     System.out.println("A");}
     else if(marks>=70 && marks<80){
     System.out.println("B");}
     else if(marks>=60 && marks<70){
     System.out.println("C");}
     else{
     System.out.println("D");}
    }
}