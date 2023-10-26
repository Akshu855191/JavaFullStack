import java.util.Scanner;
public class Primeonot{
     public static void main(String args[]){ 
     int count = 0; 
     System.out.println("Please enter the no");
     Scanner sc = new Scanner(System.in);
     int  number= sc.nextInt();
     for(int i = 1; i <= number; i++){
     if(number % i == 0){
        count++;
      }
    }
    if(count == 2)
     System.out.println("Prime number ");
    else
     System.out.println("not Prime number ");  
   }   
 }