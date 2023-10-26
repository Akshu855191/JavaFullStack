public class Max{
  public static void main(String[] args) {
      int arr[] = {5, 9, 3, 2, 11, 3, 29, 20};
      int max = arr[0];
      for(int i = 0; i < arr.length; i++){
      if(arr[i]  > max){
       max = arr[i];
      }
    }
     System.out.println("Maximum from array : " + max);
}
}