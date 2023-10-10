public class Multidimentional{
  public static void main(String[] args) {
    //int arr[][] = {{1,2,3,4,5},{6,7}};
    //System.out.println(arr[1][0]);
            //or
    //int [][] arr = {{1,2,3,4,5},{6,7}};
    //System.out.println(arr[0][4]);
           //or
   
    int arr[][] = new int[4][4];
    arr[0][0] = 10;
    arr[0][1] = 20;
    arr[0][2] = 30;
    arr[0][3] = 40;
    System.out.print(arr[0][0]);
    System.out.print(arr[0][1]);
    System.out.print(arr[0][2]);
    System.out.println(arr[0][3]);
    arr[1][0] = 50;
    arr[1][1] = 60;
    arr[1][2] = 70;
    arr[1][3] = 80;
    System.out.print(arr[1][0]);
    System.out.print(arr[1][1]);
    System.out.print(arr[1][2]);
    System.out.println(arr[1][3]);
    arr[2][0] = 90; 
    arr[2][1] = 91;
    arr[2][2] = 92;
    arr[2][3] = 93;
    System.out.print(arr[2][0]);
    System.out.print(arr[2][1]);
    System.out.print(arr[2][2]);
    System.out.println(arr[2][3]);

    arr[3][0] = 81;
    arr[3][1] = 82;
    arr[3][2] = 83;
    arr[3][3] = 84;
    System.out.print(arr[3][0]);
    System.out.print(arr[3][1]);
    System.out.print(arr[3][2]);
    System.out.println(arr[3][3]);

     /*usig for loop
    for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr[i].length; j++) {
    System.out.println("" + arr[i][j]);
    }
    System.out.println();
}
*/
  }
}