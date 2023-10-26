import java.util.*;
public class Samedigit{
  public static void main(String[] args) {
      int arr1[] = {5, 9, 3, 2, 11, 29, 20};
      int arr2[] = {8, 9, 4, 2, 11, 3, 29, 20};
      //find common(arr1, arr2);
      }
   public static void findcommon(int arr1[], int arr2[]){
    for(int i = 0; i < arr1.length; i++){
      for(int j = 0; j < arr2.length; j++){
       if(arr1[i] == arr2[j]){
        System.out.println("Common element : " + arr1[i]);
        }
      }
    } 
   }
 }