public class Min{
  public static void main(String[] args) {
      int arr[] = {5, 9, 3, 2, 11, 3, 29, 20};
      int m in = arr[0];
      for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
       min = arr[i];
      }
    }
     System.out.println("Minimum from array : " + min);
}
}