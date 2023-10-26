public class  {
  public static void main(String[] args) {
      int arr[] = {5, 9, 3, 2, 11, 3, 29, 20};
      double sum = 0;
      int n = arr.length;
      for(int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
      }
    System.out.println(sum/n);
   }
}