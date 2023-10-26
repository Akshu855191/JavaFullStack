public class Oddeven{
  public static void main(String[] args) {
      int arr[] = {5, 9, 3, 2, 11, 29, 20};
      System.out.println("Even num : ");
      for(int i = 0; i < arr.length; i++){
       if(arr[i] % 2 == 0){
       System.out.print(arr[i] + " ");
       }
      }
      System.out.println("Odd num : ");
      for(int i = 0; i < arr.length; i++){
       if(arr[i] % 2 != 0){
       System.out.print(arr[i] + " ");
       }
      }
    }
  }



       