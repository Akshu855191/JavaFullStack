public class Fibonacci{
  public static void main(String[] args) {
   /* int n = 10; // Change this to the number of Fibonacci numbers you want to print
    if (n >= 1) {
        System.out.print("Fibonacci Series: 0 ");
     }
    if (n >= 2) {
        System.out.print("1 ");
     }
    int a = 0, b = 1, count = 2;
    if (n >= 3) {
    while (count < n) {
    int next = a + b;
    System.out.print(next + " ");
    a = b;
    b = next;
    count++;
    }
   }
     System.out.println();
    }
}
*/
   
   int n = 10; // Change this to the number of Fibonacci numbers you want to print
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
}
}
    