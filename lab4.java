public class lab4 {

    public static void main(String[] args) {
        //test case for task 1
        countDown(5);

        //for task 2
        int x = 36;
        int y = 24;
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd(x, y));

        //for task 3
        System.out.println("0: " + fib(0));  // Expected: 0
        System.out.println("1: " + fib(1));  // Expected: 1
        System.out.println("2: " + fib(2));  // Expected: 1
        System.out.println("3: " + fib(3));  // Expected: 2

        //test for homework
        //1
        printHelloWorld(5);

        //2
        int n1 = 1;//start
        int n2 = 10;//end
        System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + ": " + sumMultiplesOf7(n1, n2));

        //3
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("index: " + index);
        } else {
            System.out.println("not found");
        }

    }

    //task 1
    static void countDown (int num){
    //Because I can't handle static, I turned this method into static

       if (num == 0) // test
           System.out.println("Blastoff!");
       else {
           if (num % 2 == 0)//print even only
               System.out.println(num);
           countDown(num - 1); // recursive call
        }
    }

    //task 2
    static int gcd(int x, int y) {
//        if (x % y == 0) //base case
//            return y;
//        else
//            return gcd(y, x % y);
        if(x == y)//base case
            return x;
        else if (x > y)//if x is greater, sub y from x and recursively call gcd
            return gcd(x - y, y);
        else//if y is greater, sub x from y and recursively call gcd
            return gcd(x, y - x);
    }

    //task 3
    static int fib(int n) {
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    //homework
    //1
    static void printHelloWorld(int n){
        if (n <= 0){//1. as long as it is judged that n is a number greater than 0
            return;
        }
        System.out.println("Hello World!");//2. it will be printed
        printHelloWorld(n-1);//3. and then recurse n-1 until n=0
    }

    //2
    static int sumMultiplesOf7(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }
        if (n1 % 7 == 0) {
            return n1 + sumMultiplesOf7(n1 + 1, n2);
        } else {
            return sumMultiplesOf7(n1 + 1, n2);
        }
    }

    //3
    static int binarySearch(int[] arr, int target){
        return binarySearchHelper(arr, target, 0, arr.length-1);
    }

    static int binarySearchHelper(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid; // Element found at mid
        } else if (arr[mid] < target) {
            return binarySearchHelper(arr, target, mid + 1, high); // Search right half
        } else {
            return binarySearchHelper(arr, target, low, mid - 1); // Search left half
        }
    }

}

